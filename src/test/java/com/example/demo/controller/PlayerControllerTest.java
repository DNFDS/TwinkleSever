package com.example.demo.controller;

import com.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class PlayerControllerTest {
    @Resource
    private PlayerController playerController;

    @Test
    public void addSongToList() {
    }

    @Test
    public void addAlbumToList()
    {
    }

    @Test
    public void addSongListToList() {
    }
}