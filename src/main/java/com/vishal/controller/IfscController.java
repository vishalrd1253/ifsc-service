package com.vishal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vishal.entity.IfscBank;
import com.vishal.service.IfscService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ifsc")
public class IfscController {

    @Autowired
    private IfscService service;

    @PostMapping("/add")
    public ResponseEntity<IfscBank> add(@RequestBody IfscBank bank){

        return ResponseEntity.ok(service.addBank(bank));
    }

    @GetMapping("/{code}")
    public ResponseEntity<IfscBank> get(@PathVariable String code){

        return ResponseEntity.ok(service.getBank(code));
    }

}