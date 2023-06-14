package com.AnormaisEBruna.petshop.seeders;

import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSeeder {
    @Autowired
    UserService userService;

    public void run() throws SQLException {
        try {
            this.userService.findByCredentials("exemplo@exemplo.com", "123");
        } catch (Exception error ){
            this.userService.save(UserModel.newInstance("Teste", "exemplo@exemplo.com", "123"));
        }
    }
}
