package com.AnormaisEBruna.petshop.repositories;

import com.AnormaisEBruna.petshop.models.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
    UserModel findByEmail(String email);
}
