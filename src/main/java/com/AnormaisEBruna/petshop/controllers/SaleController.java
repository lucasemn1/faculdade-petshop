package com.AnormaisEBruna.petshop.controllers;

import com.AnormaisEBruna.petshop.dtos.PostSaleDto;
import com.AnormaisEBruna.petshop.models.SaleModel;
import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.repositories.SaleRepository;
import com.AnormaisEBruna.petshop.services.SaleService;
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
public class SaleController {
    @Autowired
    private SaleService saleService;

    @Autowired
    private UserService userService;

    @GetMapping("sales")
    public ResponseEntity index() {
        try {
            ArrayList<SaleModel> sales = saleService.findAll();
            return ResponseEntity.ok(sales);
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    @PostMapping("sales")
    public ResponseEntity save(@RequestBody @Valid PostSaleDto postSaleDto) {
        try {
            UserModel userModel = userService.findById(postSaleDto.userId());
            SaleModel saleModel = SaleModel.newInstance(
                postSaleDto.price(),
                postSaleDto.description(),
                userModel
            );
            this.saleService.save(saleModel);

            return ResponseEntity.ok(saleModel);
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
