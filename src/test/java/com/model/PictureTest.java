package com.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PictureTest {
    Picture pic1=new Picture();
    Picture pic2=new Picture(2,"pic2",100,50,"paint","great",100);
    @BeforeEach
    void be(){
        pic1.setId(1);
        pic1.setCode("pic1");
        pic1.setHeight(200);
        pic1.setWidth(100);
        pic1.setMaterial("paper");
        pic1.setDescription("normal");
        pic1.setPrice(150);
    }
    @Test
    void testSetGet(){
        assertEquals(1,pic1.getId());
        assertEquals("pic1",pic1.getCode());
        assertEquals(200,pic1.getHeight());
        assertEquals(100,pic1.getWidth());
        assertEquals("paper",pic1.getMaterial());
        assertEquals("normal",pic1.getDescription());
        assertEquals(150,pic1.getPrice());

        pic2.setId(3);
        pic2.setCode("pic3");
        pic2.setHeight(150);
        pic2.setWidth(75);
        pic2.setMaterial("paperz");
        pic2.setDescription("normalize");
        pic2.setPrice(125);

        assertEquals(3,pic2.getId());
        assertEquals("pic3",pic2.getCode());
        assertEquals(150,pic2.getHeight());
        assertEquals(75,pic2.getWidth());
        assertEquals("paperz",pic2.getMaterial());
        assertEquals("normalize",pic2.getDescription());
        assertEquals(125,pic2.getPrice());
    }
    @Test
    void testToString(){
        assertEquals("Picture{id=1, code='pic1', height=200.0, width=100.0, material='paper', description='normal', price=150}",pic1.toString());
        assertEquals("Picture{id=2, code='pic2', height=100.0, width=50.0, material='paint', description='great', price=100}",pic2.toString());
    }
}