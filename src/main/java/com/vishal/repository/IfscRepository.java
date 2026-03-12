package com.vishal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vishal.entity.IfscBank;

@Repository
public interface IfscRepository extends JpaRepository<IfscBank,String> {

}