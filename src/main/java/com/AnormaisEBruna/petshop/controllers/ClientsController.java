package com.AnormaisEBruna.petshop.controllers;

import com.AnormaisEBruna.petshop.dtos.GetClientDto;
import com.AnormaisEBruna.petshop.dtos.PostClientDto;
import com.AnormaisEBruna.petshop.dtos.PostUserDto;
import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.AddressModel;
import com.AnormaisEBruna.petshop.models.ClientModel;
import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.services.AddressService;
import com.AnormaisEBruna.petshop.services.ClientService;
import com.AnormaisEBruna.petshop.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ClientsController {
    @Autowired
    private ClientService clientService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private UserService userService;

    @GetMapping("/clients")
    public ResponseEntity index() {
        try {
            ArrayList<ClientModel> clients = (ArrayList<ClientModel>) this.clientService.findAll();

            return ResponseEntity.ok(clients);
        } catch (Exception error) {
            System.out.println("error: " + error.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }

    @GetMapping("/clients/{id}")
    public ResponseEntity<GetClientDto> get(@PathVariable int id) throws SQLException {
        ClientModel clientModel = this.clientService.findById(id);
        clientModel.getPets();
        clientModel.getAddress();
        clientModel.getRegisteredBy();

        GetClientDto getClientDto = new GetClientDto(
            clientModel.getId(),
            clientModel.getName(),
            clientModel.getEmail(),
            clientModel.getPhoneNumber(),
            clientModel.getAddress(),
            clientModel.getRegisteredBy(),
            clientModel.getPets()
        );

        try {
            return ResponseEntity.ok(getClientDto);
        } catch (Exception error) {
            System.out.println(error.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("client")
    public ResponseEntity<ClientModel> store(@RequestBody @Valid PostClientDto clientDto) throws SQLException {
        ClientModel clientModel = new ClientModel();
        clientModel.setName(clientDto.name());
        clientModel.setEmail(clientDto.email());
        clientModel.setPhoneNumber(clientDto.phoneNumber());
        clientModel.setPets(new ArrayList<>());

        AddressModel address = AddressModel.newInstance(
                clientDto.addressCep(),
                clientDto.addressCity(),
                clientDto.addressState(),
                clientDto.addressNumber(),
                clientDto.addressStreet(),
                clientDto.addressComplement()
        );

        this.addressService.save(address);
        clientModel.setAddress(address);

        UserModel userModel = this.userService.findById(clientDto.userId());
        clientModel.setRegisteredBy(userModel);

        this.clientService.save(clientModel);

        return ResponseEntity.ok(clientModel);
    }

    @DeleteMapping("client/{id}")
    public ResponseEntity destroy(@PathVariable int id) throws SQLException {
        try {
            ClientModel clientModel = this.clientService.findById(id);
            this.clientService.delete(clientModel);

            return ResponseEntity.ok("Cliente deletado com sucesso!");
        } catch (SQLException error){
            System.out.println("error: " + error.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error.getMessage());
        }
    }
}
