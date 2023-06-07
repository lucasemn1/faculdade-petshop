package com.AnormaisEBruna.petshop.services;

import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void save(UserModel user) {
        try {
            this.userRepository.save(user);
        } catch (Exception error) {
            new SQLException("Não foi possível salvar o usuário");
        }
    }
}
