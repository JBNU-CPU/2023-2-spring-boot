package com.example.www.service;

import com.example.www.entity.ContentEntity;
import com.example.www.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListService {

    @Autowired
    private ContentRepository contentRepository;


    public List<ContentEntity> getAllData() {


        return contentRepository.findAll();
    }

    public Optional<ContentEntity> getOneData(int id) {

        return contentRepository.findById(id);
    }
}
