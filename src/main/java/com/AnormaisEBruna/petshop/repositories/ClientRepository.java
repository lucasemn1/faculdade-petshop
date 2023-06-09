package com.AnormaisEBruna.petshop.repositories;

import com.AnormaisEBruna.petshop.models.ClientModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<ClientModel, Integer> {
    List<ClientModel> findAll();
}
