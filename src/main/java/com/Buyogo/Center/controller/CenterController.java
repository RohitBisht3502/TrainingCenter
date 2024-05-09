package com.Buyogo.Center.controller;

import com.Buyogo.Center.model.Center;
import com.Buyogo.Center.service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CenterController {

    // creating service class object to interact with db
    @Autowired
    CenterService centerService;

    // api method for creating centers
    @PostMapping("Centers")
    public String createCenters(@RequestBody List<Center> newCenters){
        return centerService.createCenter(newCenters);
    }

    // api methods for getting centers
    @GetMapping("centers")
    public List<Center> getAllCenters(){
        return centerService.getAllCenters();
    }


}
