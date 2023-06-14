package com.AnormaisEBruna.petshop.seeders;

import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.ServiceTypeModel;
import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.services.ServiceTypeService;
import com.AnormaisEBruna.petshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServiceTypeSeeder {
    @Autowired
    ServiceTypeService serviceTypeService;

    public void run() throws SQLException {
        try {
            ArrayList<ServiceTypeModel> serviceTypeModels = (ArrayList<ServiceTypeModel>) this.serviceTypeService.findAll();

            if (serviceTypeModels.size() == 0) {
                throw new Exception();
            }
        } catch (Exception error ){
            this.serviceTypeService.save(ServiceTypeModel.newInstance("Exemplo 1"));
            this.serviceTypeService.save(ServiceTypeModel.newInstance("Exemplo 2"));
        }
    }
}
