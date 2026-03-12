package com.vishal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.entity.IfscBank;
import com.vishal.exception.IfscNotFoundException;
import com.vishal.repository.IfscRepository;

@Service
public class IfscService {

    @Autowired
    private IfscRepository repository;

    public IfscBank getBank(String ifsc){

        return repository.findById(ifsc)
                .orElseThrow(() -> new IfscNotFoundException("IFSC not found : " + ifsc));
    }

    public IfscBank addBank(IfscBank bank){

        return repository.save(bank);
    }

}