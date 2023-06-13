package com.AnormaisEBruna.petshop.controllers;

import com.AnormaisEBruna.petshop.dtos.PostUserDto;
import com.AnormaisEBruna.petshop.exceptions.SQLException;
import com.AnormaisEBruna.petshop.interceptors.AuthInterceptor;
import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import java.util.ArrayList;

@RestController
public class UsersController implements WebMvcConfigurer {
    @Autowired
    public UserService userService;

    @GetMapping("users")
    public ResponseEntity<ArrayList<UserModel>> index() {
        try {
            ArrayList<UserModel> users = (ArrayList<UserModel>) this.userService.findAll();

            return ResponseEntity.ok(users);
        } catch (Exception error) {
            System.out.println("error: " + error.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ArrayList<>());
        }
    }

    @PostMapping("user")
    public ResponseEntity<UserModel> store(@RequestBody @Valid PostUserDto userDto) throws SQLException {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDto, userModel);
        this.userService.save(userModel);

        return ResponseEntity.ok(userModel);
    }
}
