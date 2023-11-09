package com.example.www.service;


import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService{


    @Override
    public String getUsername() {

        String username = "kim";

        return username;
    }
}
