package com.AnormaisEBruna.petshop.controllers;

import com.AnormaisEBruna.petshop.dtos.PostProvidedServiceDto;
import com.AnormaisEBruna.petshop.dtos.PostSaleDto;
import com.AnormaisEBruna.petshop.models.*;
import com.AnormaisEBruna.petshop.services.PetService;
import com.AnormaisEBruna.petshop.services.ProvidedServiceService;
import com.AnormaisEBruna.petshop.services.ServiceTypeService;
import com.AnormaisEBruna.petshop.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProvidedServiceController {
    @Autowired
    private ProvidedServiceService providedServiceService;

    @Autowired
    private UserService userService;

    @Autowired
    private PetService petService;

    @Autowired
    private ServiceTypeService serviceTypeService;

    @GetMapping("provided-services")
    public ResponseEntity index() {
        try {
            ArrayList<ProvidedServiceModel> providedServiceServices = providedServiceService.findAll();
            return ResponseEntity.ok(providedServiceServices);
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    @PostMapping("provided-service")
    public ResponseEntity save(@RequestBody @Valid PostProvidedServiceDto postProvidedServiceDto) {
        try {
            UserModel userModel = userService.findById(postProvidedServiceDto.userId());
            PetModel petModel = petService.findById(postProvidedServiceDto.petId());
            ServiceTypeModel serviceType = serviceTypeService.findById(postProvidedServiceDto.serviceTypeId());

            ProvidedServiceModel providedServiceModel = ProvidedServiceModel.newInstance(
                postProvidedServiceDto.name(),
                postProvidedServiceDto.price(),
                petModel,
                serviceType,
                userModel
            );

            providedServiceService.save(providedServiceModel);

            return ResponseEntity.ok(providedServiceModel);
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
