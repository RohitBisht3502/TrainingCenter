package com.Buyogo.Center.service;

import com.Buyogo.Center.model.Center;
import com.Buyogo.Center.repo.ICenterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CenterService {

    @Autowired
    ICenterRepo centerRepo;

    public String createCenter(List<Center> newCenters) {
        try {
            centerRepo.saveAll(newCenters);
            return "created Successfully";
        } catch (Exception e) {
            // Log the exception or handle it according to your requirement
            return "Failed to create centers: " + e.getMessage();
        }
    }

    public List<Center> getAllCenters() {
        try {
            return centerRepo.findAll();
        } catch (Exception e) {
            // Log the exception or handle it according to your requirement
            return null; //  throw a custom exception
        }
    }
}
