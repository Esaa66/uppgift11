package com.example.kurs.kurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/kurs")
public class KursController {

    private final KursService kursService;

    @Autowired
    public KursController(KursService kursService){
        this.kursService = kursService;
    }

    //omvandlar klass till endpoint
    @GetMapping
    public List<Kurs> getKurs(){
        return kursService.getKurs();

    }

    }

