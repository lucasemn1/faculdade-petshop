package com.AnormaisEBruna.petshop.services;

import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.ClientModel;
import com.AnormaisEBruna.petshop.models.PetModel;
import com.AnormaisEBruna.petshop.models.ServiceType;
import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.repositories.PetRepository;
import com.AnormaisEBruna.petshop.repositories.ServiceRepository;
import com.AnormaisEBruna.petshop.repositories.UserRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

  /*  @Autowired
    ServiceRepository serviceRepository;

    public void sale(ServiceType service_types) throws SQLException {
        try {
            this.serviceRepository.findById(service_types.getId());
        } catch (Exception error) {
            throw new SQLException("Serviço indisponivel ou não encontrado");
        }
    }*/
}



