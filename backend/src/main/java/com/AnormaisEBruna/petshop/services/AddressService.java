package com.AnormaisEBruna.petshop.services;

import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.AddressModel;
import com.AnormaisEBruna.petshop.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public void save(AddressModel address) throws SQLException {
        try {
            this.addressRepository.save(address);
        } catch (Exception error) {
            throw new SQLException("Não foi possível salvar o endereço.");
        }
    }
}
