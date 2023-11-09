package com.example.www.controller;

import com.example.www.dto.SaveDTO;
import com.example.www.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SaveController {

    @Autowired
    private SaveService saveService;

    @PostMapping("/save")
    public String saveL(SaveDTO saveDTO) {

        saveService.saveContent(saveDTO);


        return "redirect:/";
    }

    @PostMapping("/save/{id}")
    public String updateL(SaveDTO saveDTO, @PathVariable("id")int id) {

        saveService.updateContent(saveDTO, id);

        return "redirect:/list/"+id;
    }
}
