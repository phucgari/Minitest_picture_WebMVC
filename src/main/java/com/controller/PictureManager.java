package com.controller;

import com.model.Picture;

import java.util.List;

public interface PictureManager {
    List<Picture> findAll();
    void save(Picture picture);
    Picture findByID(int id);
    void update(int id, Picture picture);
    void remove(int id);
}
