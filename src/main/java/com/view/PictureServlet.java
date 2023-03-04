package com.view;

import com.controller.PictureManager;
import com.controller.PictureManagerImpl;
import com.model.Picture;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PictureServlet", value = "/picture")
public class PictureServlet extends HttpServlet {
    private final PictureManager manager=new PictureManagerImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        if(action==null)action="";
        switch(action){
            case "create":
                showCreateForm(request,response);
                break;
            case "description":
                showDescription(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "delete":
                showDeleteForm(request,response);
                break;
            default:
                pictureFullList(request,response,"");
                break;
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher=request.getRequestDispatcher("picture/creator.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        Picture picture=manager.findByID(Integer.parseInt(request.getParameter("id")));
        RequestDispatcher dispatcher=request.getRequestDispatcher("picture/deleter.jsp");
        request.setAttribute("picture",picture);
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        Picture picture=manager.findByID(Integer.parseInt(request.getParameter("id")));
        RequestDispatcher dispatcher=request.getRequestDispatcher("picture/editor.jsp");
        request.setAttribute("picture",picture);
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showDescription(HttpServletRequest request, HttpServletResponse response) {
        Picture picture=manager.findByID(Integer.parseInt(request.getParameter("id")));
        RequestDispatcher dispatcher=request.getRequestDispatcher("picture/showDescription.jsp");
        request.setAttribute("picture",picture);
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void pictureFullList(HttpServletRequest request, HttpServletResponse response, String message) {
        List<Picture> pictureList = this.manager.findAll();
        request.setAttribute("message",message);
        request.setAttribute("pictures", pictureList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("picture/showList.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        switch(action){
            case "create":
                createData(request,response);
                break;
            case "edit":
                editData(request,response);
                break;
            case "delete":
                deleteData(request,response);
                break;
        }
    }

    private void createData(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        Picture picture=getPicture(request, id);
        manager.save(picture);
        String message= "create picture id "+id+" successful";
        pictureFullList(request,response,message);
    }


    private void deleteData(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        manager.remove(id);
        String message= "delete picture id "+id+" successful";
        pictureFullList(request,response,message);
    }

    private void editData(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        Picture picture = getPicture(request, id);
        manager.update(id,picture);
        String message="edit picture id "+id+" successful";
        pictureFullList(request,response,message);
    }

    private static Picture getPicture(HttpServletRequest request, int id) {
        String code = request.getParameter("code");
        int price = Integer.parseInt(request.getParameter("price"));
        int height = Integer.parseInt(request.getParameter("height"));
        int width = Integer.parseInt(request.getParameter("width"));
        String material = request.getParameter("material");
        String description = request.getParameter("description");
        Picture picture=new Picture(id,code,height,width,material,description,price);
        return picture;
    }
}
