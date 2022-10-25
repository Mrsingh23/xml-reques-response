package com.example.crudapixml.controller;

import com.example.crudapixml.dao.CollegeRepository;
import com.example.crudapixml.entity.CollegeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollegeController {

    @Autowired
    private CollegeRepository collegeRepository;

    @PostMapping("/saveCollege")
    public String saveCollege(@RequestBody CollegeDTO college){
        collegeRepository.save(college);
        return "College request saved...";
    }

    //produces set as xml to get response in xml format. By default will be JSON
    @GetMapping(value = "/getCollegeList", produces = "application/xml")
    public List<CollegeDTO> getCollegeList(){
        return collegeRepository.findAll();
    }
}
