package com.AnormaisEBruna.petshop.services;

import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.PetModel;
import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
    @Autowired
    PetRepository petRepository;

    public void save(PetModel pet) throws SQLException {
        try {
            this.petRepository.save(pet);
        } catch (Exception error) {
            throw new SQLException("Não foi possível salvar o pet");
        }
    }

    public PetModel findById(Integer id) throws SQLException {
        try {
            return this.petRepository.findById(id).get();
        } catch (Exception error) {
            throw new SQLException("Não foi possível salvar o pet.");
        }
    }

    public List<PetModel> findAll() throws SQLException {
        try {
            Iterable<PetModel> petResponses = this.petRepository.findAll();
            ArrayList<PetModel> pets = new ArrayList();

            for (PetModel pet : petResponses) {
                pets.add(pet);
            }

            return pets;
        } catch (Exception error) {
            throw new SQLException("Não foi possível buscar os pets");
        }
    }

    public void delete(PetModel pet) throws SQLException {
        try {
            this.petRepository.deleteById(pet.getId());
        } catch (Exception error) {
            throw new SQLException("Pet não encontrado.");
        }
    }
}



