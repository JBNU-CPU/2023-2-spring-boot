package com.example.www.controller;

import com.example.www.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EditorController {

    @Autowired
    private ListService listService;

    @GetMapping("/editor")
    public String editorP() {

        return "editor";
    }

    @GetMapping("/editor/{id}")
    public String updateP(@PathVariable("id")int id, Model model) {

        model.addAttribute("data", listService.getOneData(id).get());


        return "editor";
    }
}
