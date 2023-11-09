package com.example.www.service;

import com.example.www.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteService {

    @Autowired
    private ContentRepository contentRepository;

    public void deleteOneData(int id) {

        //id?

        contentRepository.deleteById(id);
    }
}
