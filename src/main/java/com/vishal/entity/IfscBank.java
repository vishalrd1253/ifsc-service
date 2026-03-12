package com.vishal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
public class IfscBank {

    @Id
    private String Ifsc;

    private String BranchName;



}