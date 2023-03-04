package com.controller;

import com.model.Picture;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PictureManagerImplTest {
    private final PictureManager manager=new PictureManagerImpl();

    @Test
    void findAll() {
        List<Picture> pictures=manager.findAll();
        assertEquals("[Picture{id=1, code='E01', height=200.0, width=100.0, material='crayon', description='new', price=120}, " +
                "Picture{id=2, code='B12', height=100.0, width=150.0, material='water', description='perfect', price=160}, " +
                "Picture{id=3, code='P99', height=150.0, width=400.0, material='paint', description='mediocre', price=300}, " +
                "Picture{id=4, code='I20', height=75.0, width=50.0, material='blood', description='nah', price=200}, " +
                "Picture{id=5, code='Z70', height=125.0, width=200.0, material='invisible', description='bought', price=150}]",pictures.toString());
    }

    @Test
    void save() {
        manager.save(new Picture(6,"O12",300,150,"water","old",150));
        List<Picture> pictures=manager.findAll();
        assertEquals("[Picture{id=1, code='E01', height=200.0, width=100.0, material='crayon', description='new', price=120}, " +
                "Picture{id=2, code='B12', height=100.0, width=150.0, material='water', description='perfect', price=160}, " +
                "Picture{id=3, code='P99', height=150.0, width=400.0, material='paint', description='mediocre', price=300}, " +
                "Picture{id=4, code='I20', height=75.0, width=50.0, material='blood', description='nah', price=200}, " +
                "Picture{id=5, code='Z70', height=125.0, width=200.0, material='invisible', description='bought', price=150}, " +
                "Picture{id=6, code='O12', height=300.0, width=150.0, material='water', description='old', price=150}]",pictures.toString());
        manager.save(new Picture(7,"Y22",100,20,"yeah","ordered",50));
        pictures=manager.findAll();
        assertEquals("[Picture{id=1, code='E01', height=200.0, width=100.0, material='crayon', description='new', price=120}, " +
                "Picture{id=2, code='B12', height=100.0, width=150.0, material='water', description='perfect', price=160}, " +
                "Picture{id=3, code='P99', height=150.0, width=400.0, material='paint', description='mediocre', price=300}, " +
                "Picture{id=4, code='I20', height=75.0, width=50.0, material='blood', description='nah', price=200}, " +
                "Picture{id=5, code='Z70', height=125.0, width=200.0, material='invisible', description='bought', price=150}, " +
                "Picture{id=6, code='O12', height=300.0, width=150.0, material='water', description='old', price=150}, " +
                "Picture{id=7, code='Y22', height=100.0, width=20.0, material='yeah', description='ordered', price=50}]",pictures.toString());
    }

    @Test
    void findByID() {
        Picture picture=manager.findByID(1);
        assertEquals("Picture{id=1, code='E01', height=200.0, width=100.0, material='crayon', description='new', price=120}",picture.toString());
        picture=manager.findByID(2);
        assertEquals("Picture{id=2, code='B12', height=100.0, width=150.0, material='water', description='perfect', price=160}",picture.toString());
    }

    @Test
    void update() {
        List<Picture> pictures=manager.findAll();

        Picture pictureB4=pictures.get(0);
        Picture picture = new Picture(6, "O12", 300, 150, "water", "old", 150);
        manager.update(1, picture);
        pictures=manager.findAll();
        assertTrue(pictures.contains(picture));
        assertFalse(pictures.contains(pictureB4));

        pictureB4=pictures.get(2);
        picture = new Picture(7, "Y22", 100, 20, "yeah", "ordered", 50);
        manager.update(3, picture);
        pictures=manager.findAll();
        assertTrue(pictures.contains(picture));
        assertFalse(pictures.contains(pictureB4));
    }

    @Test
    void remove() {
        List<Picture> pictures=manager.findAll();

        Picture picture=pictures.get(0);
        manager.remove(1);
        pictures=manager.findAll();
        assertFalse(pictures.contains(picture));

        picture=pictures.get(1);
        manager.remove(3);
        pictures=manager.findAll();
        assertFalse(pictures.contains(picture));
    }
}