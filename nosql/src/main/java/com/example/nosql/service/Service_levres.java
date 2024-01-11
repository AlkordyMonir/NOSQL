package com.example.nosql.service;

//import com.example.nosql.repo.Repository;

import com.example.nosql.model.Livre;
import com.example.nosql.repo.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_levres {

    //@Autowired
    public Repository livres_repo;

    public Service_levres() {
    }

   // public Service_levres(Repository livres_repo) {
     //   this.livres_repo = livres_repo;
    //}
    //  public Repository livres_repo;
    public List<Livre> findAllLivres() {
                return livres_repo.findAll();
    }
}
