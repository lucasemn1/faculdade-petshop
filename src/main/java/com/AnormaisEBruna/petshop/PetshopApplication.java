package com.AnormaisEBruna.petshop;

import com.AnormaisEBruna.petshop.contracts.gui.GUIManager;
import com.AnormaisEBruna.petshop.models.UserModel;
import com.AnormaisEBruna.petshop.repositories.UserRepository;
import com.AnormaisEBruna.petshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PetshopApplication implements CommandLineRunner {
	@Autowired
	GUIManager application;

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(PetshopApplication.class);
		builder.headless(false);
		builder.run(args);
	}

	@Override
	public void run(String[] args) throws Exception {
		this.application.goToRoute("Hello");
		this.application.show();

		this.userService.save(new UserModel("Lucas 2", "lucas@lucas.com", "123"));
	}
}
