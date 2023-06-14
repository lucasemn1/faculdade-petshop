package com.AnormaisEBruna.petshop.services;

import ch.qos.logback.core.net.server.Client;
import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.ClientModel;
import com.AnormaisEBruna.petshop.models.PetModel;
import com.AnormaisEBruna.petshop.models.ServiceTypeModel;
import com.AnormaisEBruna.petshop.repositories.ClientRepository;
import com.AnormaisEBruna.petshop.repositories.ServiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceTypeService {
    @Autowired
    ServiceTypeRepository serviceTypeRepository;

    public void save(ServiceTypeModel serviceTypeModel) throws SQLException {
        try {
            this.serviceTypeRepository.save(serviceTypeModel);
        } catch (Exception error) {
            System.out.println(error.getMessage());
            throw new SQLException("Não foi possível salvar o tipo de serviço");
        }
    }

    public List<ServiceTypeModel> findAll() throws SQLException {
        try {
            Iterable<ServiceTypeModel> serviceTypeResponses = this.serviceTypeRepository.findAll();
            ArrayList<ServiceTypeModel> serviceTypes = new ArrayList();

            for (ServiceTypeModel serviceType: serviceTypeResponses) {
                serviceTypes.add(serviceType);
            }

            return serviceTypes;
        } catch (Exception error) {
            throw new SQLException("Não foi possível buscar os tipos de serviço.");
        }
    }
}
