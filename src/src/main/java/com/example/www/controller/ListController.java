package com.example.www.controller;

import com.example.www.service.ListService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ListController {

    @Autowired
    private ListService listService;

    @GetMapping("/list")
    public String listP(Model model) {

        model.addAttribute("data", listService.getAllData());

        return "list";
    }

    @GetMapping("/list/{id}")
    public String listNo(@PathVariable("id")int id, Model model) {



        model.addAttribute("data", listService.getOneData(id).get());


        return "listNo";
    }
}
