package com.example.nosql.controller;

import com.example.nosql.model.Livre;
import com.example.nosql.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
     Service service;

    @GetMapping("/livres")
  //  public ResponseEntity<List<Livre>> getAllLivres(@RequestParam(required = false) String title) {
      public String getAllLivres(Model model) {
        try {
            List<Livre> levres = new ArrayList<Livre>();
                Service service = null;
            for (Livre livre : levres = service.livres_repo.findAll()) {

            }

           // tutorialRepository.findAll().forEach(tutorials::add);

            model.addAttribute("index", levres);
        } catch (Exception e) {
            model.addAttribute("message", e.getMessage());
        }
        return "index";
    }





}
