package com.AnormaisEBruna.petshop.services;

import ch.qos.logback.core.net.server.Client;
import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.ClientModel;
import com.AnormaisEBruna.petshop.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public void save(ClientModel client) throws SQLException {
        try {
            this.clientRepository.save(client);
        } catch (Exception error) {
            System.out.println(error.getMessage());
            throw new SQLException("Não foi possível salvar o cliente");
        }
    }

    public List<ClientModel> findAll() throws SQLException {
        try {
            return this.clientRepository.findAll();
        } catch (Exception error) {
            throw new SQLException("Não foi possível buscar os clientes");
        }
    }

    public ClientModel findById(Integer id) throws SQLException {
        try {
            return this.clientRepository.findById(id).get();
        } catch (Exception error) {
            throw new SQLException("Não foi possível buscar o cliente com o id " + id);
        }
    }

    public void delete(ClientModel client) throws  SQLException {
        try {
            this.clientRepository.delete(client);
        } catch (Exception error) {
            System.out.println(error.getMessage());
            throw new SQLException("Não foi possível deletar o cliente");
        }
    }
}
