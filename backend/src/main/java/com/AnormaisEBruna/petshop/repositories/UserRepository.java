package com.AnormaisEBruna.petshop.repositories;

import com.AnormaisEBruna.petshop.models.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
    List<UserModel> findByEmail(String email);
}
