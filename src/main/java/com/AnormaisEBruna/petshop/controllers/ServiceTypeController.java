package com.AnormaisEBruna.petshop.controllers;

import com.AnormaisEBruna.petshop.models.ServiceTypeModel;
import com.AnormaisEBruna.petshop.services.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ServiceTypeController {
    @Autowired
    private ServiceTypeService serviceTypeService;

    @GetMapping("service-types")
    public ResponseEntity index() {
        try {
            ArrayList<ServiceTypeModel> serviceTypeModels = (ArrayList<ServiceTypeModel>) this.serviceTypeService.findAll();

            return ResponseEntity.ok(serviceTypeModels);
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
