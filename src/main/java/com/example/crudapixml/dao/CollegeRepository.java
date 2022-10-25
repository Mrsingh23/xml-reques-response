package com.example.crudapixml.dao;

import com.example.crudapixml.entity.CollegeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<CollegeDTO, Long> {
}
