package com.controller;

import com.model.Picture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PictureManagerImpl implements PictureManager{
    private static Map<Integer,Picture> pictureMap;

    public PictureManagerImpl() {
        pictureMap=new HashMap<>();
        pictureMap.put(1,new Picture(1,"E01",200,100,"crayon","new",120));
        pictureMap.put(2,new Picture(2,"B12",100,150,"water","perfect",160));
        pictureMap.put(3,new Picture(3,"P99",150,400,"paint","mediocre",300));
        pictureMap.put(4,new Picture(4,"I20",75,50,"blood","nah",200));
        pictureMap.put(5,new Picture(5,"Z70",125,200,"invisible","bought",150));
    }

    @Override
    public List<Picture> findAll() {
        return new ArrayList<>(pictureMap.values()) ;
    }

    @Override
    public void save(Picture picture) {
        pictureMap.put(picture.getId(),picture);
    }

    @Override
    public Picture findByID(int id) {
        return pictureMap.get(id);
    }

    @Override
    public void update(int id, Picture picture) {
        pictureMap.put(id,picture);
    }

    @Override
    public void remove(int id) {
        pictureMap.remove(id);
    }
}
