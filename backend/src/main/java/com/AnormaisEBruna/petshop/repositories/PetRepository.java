package com.AnormaisEBruna.petshop.repositories;

import com.AnormaisEBruna.petshop.models.PetModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PetRepository extends CrudRepository<PetModel, Integer> {
    List<PetModel> findAll();
}