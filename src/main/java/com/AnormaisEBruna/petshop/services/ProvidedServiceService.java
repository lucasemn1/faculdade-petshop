package com.AnormaisEBruna.petshop.services;

import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.PetModel;
import com.AnormaisEBruna.petshop.models.ProvidedServiceModel;
import com.AnormaisEBruna.petshop.repositories.ProvidedServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProvidedServiceService {
    @Autowired
    private ProvidedServiceRepository providedServiceRepository;

    public void save(ProvidedServiceModel providedServiceModel) throws SQLException {
        try {
            this.providedServiceRepository.save(providedServiceModel);
        } catch (Exception error) {
            throw new SQLException("Não foi possível salvar o serviço prestado.");
        }
    }

    public ArrayList<ProvidedServiceModel> findAll() throws SQLException {
        try {
            Iterable<ProvidedServiceModel> providedServiceResponses = this.providedServiceRepository.findAll();
            ArrayList<ProvidedServiceModel> providedServices = new ArrayList();

            for (ProvidedServiceModel providedService : providedServiceResponses) {
                providedServices.add(providedService);
            }

            return providedServices;
        } catch (Exception error) {
            throw new SQLException("Não foi possível buscar os servidos prestados.");
        }
    }
}
