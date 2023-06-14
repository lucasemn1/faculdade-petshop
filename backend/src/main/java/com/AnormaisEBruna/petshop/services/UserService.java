package com.AnormaisEBruna.petshop.services;

import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.PetModel;
import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.repositories.PetRepository;
import com.AnormaisEBruna.petshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

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

    public UserModel findByCredentials(String email, String password) throws SQLException {
        try {
            UserModel user = this.userRepository.findByEmail(email).get(0);

            if (!user.getPassword().equals(password)) {
                throw new Exception("Senha inválida");
            }

            return user;
        } catch (Exception error) {
            System.out.println(error);
            throw new SQLException("Usuário não encontrado.");
        }
    }

    public List<UserModel> findAll() throws SQLException {
        try {
            Iterable<UserModel> usersResponse = this.userRepository.findAll();
            ArrayList<UserModel> users = new ArrayList();

            for (UserModel user : usersResponse) {
                users.add(user);
            }

            return users;
        } catch (Exception error) {
            throw new SQLException("Não foi possível salvar o usuário");
        }
    }

    public void delete(UserModel user) throws SQLException {
        try {
            this.userRepository.deleteById(user.getId());
        } catch (Exception error) {
            throw new SQLException("Usúario não encontrado");
        }
    }

    @Autowired
    PetRepository petRepository;

    public void save(PetModel pet) throws SQLException {
        try {
            this.petRepository.save(pet);
        } catch (Exception error) {
            System.out.println(error.getMessage());
            throw new SQLException("Não foi possível adicionar o pet");
        }
    }
}



