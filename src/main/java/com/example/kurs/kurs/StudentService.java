package com.example.kurs.kurs;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Kurs> getKurs(){
        return List.of(
                new Kurs(
                        "D0031N",
                        "Inlämningsuppgifter0",
                        60003
                )
        );
    }

}
