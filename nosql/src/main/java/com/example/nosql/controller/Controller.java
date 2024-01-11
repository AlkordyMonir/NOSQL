package com.example.nosql.controller;

import com.example.nosql.model.Livre;
import com.example.nosql.repo.Repository;

import com.example.nosql.service.Service_levres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class Controller {
    @Autowired
    Repository rrr;
    public Controller(Service_levres service) {
        this.service = service;
    }

    public Controller() {
    }

    //@Autowired
    Service_levres service;

    @GetMapping("/")
  //  public ResponseEntity<List<Livre>> getAllLivres(@RequestParam(required = false) String title) {
      public String getAllLivres(Model model) {
//service=new Service_levres();

            // Service service = null;
           // Repository livres_repo
           // service.

            List<Livre> levres=rrr.findAll();
           // levres = (List<Livre>) service.findAllLivres();

            // tutorialRepository.findAll().forEach(tutorials::add);
               //System.out.println(levres.size());
            model.addAttribute("levres", levres);

        return "index";
    }





}
