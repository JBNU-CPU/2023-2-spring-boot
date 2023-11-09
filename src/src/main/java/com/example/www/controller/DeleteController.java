package com.example.www.controller;

import com.example.www.service.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DeleteController {

    @Autowired
    private DeleteService deleteService;

    @GetMapping("/delete/{id}")
    public String deleteP(@PathVariable("id")int id) {


        deleteService.deleteOneData(id);

        return "redirect:/list";
    }
}
