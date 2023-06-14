package com.AnormaisEBruna.petshop.controllers;

import ch.qos.logback.core.net.server.Client;
import com.AnormaisEBruna.petshop.dtos.GetPetDto;
import com.AnormaisEBruna.petshop.dtos.PostPetDto;
import com.AnormaisEBruna.petshop.models.ClientModel;
import com.AnormaisEBruna.petshop.models.PetModel;
import com.AnormaisEBruna.petshop.services.ClientService;
import com.AnormaisEBruna.petshop.services.PetService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PetController {
    @Autowired
    private ClientService clientService;

    @Autowired
    private PetService petService;

    @GetMapping("pets")
    public ResponseEntity index() {
        try {
            ArrayList<PetModel> pets = (ArrayList<PetModel>) petService.findAll();

            return ResponseEntity.ok(pets);
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    @GetMapping("pet/{id}")
    public ResponseEntity get(@PathVariable int id) {
        try {
            PetModel pet = petService.findById(id);

            GetPetDto getPetDto = new GetPetDto(
                pet.getId(),
                pet.getType(),
                pet.getName(),
                pet.getDescription(),
                pet.getProvidedServices(),
                pet.getClients()
            );

            return ResponseEntity.ok(getPetDto);
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    @PostMapping("pet")
    public ResponseEntity store(@RequestBody @Valid PostPetDto postPetDto) {
        try {
            ClientModel clientModel = clientService.findById(postPetDto.clientId());
            ArrayList<ClientModel> owners = new ArrayList();

            PetModel pet = PetModel.newInstance(
                postPetDto.type(),
                postPetDto.name(),
                postPetDto.description()
            );
            pet.getClients().add(clientModel);
            petService.save(pet);
            clientModel.getPets().add(pet);

            return ResponseEntity.ok(pet);
        } catch (Exception error) {
            System.out.println(error);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    @DeleteMapping("pet/{id}")
    public ResponseEntity destroy(@PathVariable int id) {
        try {
            PetModel pet = petService.findById(id);
            this.petService.delete(pet);

            return ResponseEntity.ok("Deletado com sucesso.");
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
