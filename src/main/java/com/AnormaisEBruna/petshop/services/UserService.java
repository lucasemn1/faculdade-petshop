package com.AnormaisEBruna.petshop.services;

import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void save(UserModel user) throws SQLException {
        try {
            this.userRepository.save(user);
        } catch (Exception error) {
            throw new SQLException("Não foi possível salvar o usuário");
        }
    }

    public UserModel findById(Integer id) throws SQLException {
        try {
            return this.userRepository.findById(id).get();
        } catch (Exception error) {
            throw new SQLException("Não foi possível salvar o usuário");
        }
    }

    public List<UserModel> findAll() throws SQLException {
        try {
            Iterable<UserModel> usersResponse =  this.userRepository.findAll();
            ArrayList<UserModel> users = new ArrayList();

            for (UserModel user: usersResponse) {
                users.add(user);
            }

            return users;
        } catch (Exception error) {
            throw new SQLException("Não foi possível salvar o usuário");
        }
    }
}
