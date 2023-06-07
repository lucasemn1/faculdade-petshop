package com.AnormaisEBruna.petshop.repositories;

import com.AnormaisEBruna.petshop.models.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Long> {
    @Query("SELECT u FROM UserModel as u WHERE u.email LIKE :email AND :password LIKE :password")
    UserModel findByCredentials(String email, String password);
}
