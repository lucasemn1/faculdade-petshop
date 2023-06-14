package com.AnormaisEBruna.petshop;

import com.AnormaisEBruna.petshop.seeders.ServiceTypeSeeder;
import com.AnormaisEBruna.petshop.seeders.UserSeeder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetshopApplication {
	@Autowired
	private ServiceTypeSeeder serviceTypeSeeder;

	@Autowired
	private UserSeeder userSeeder;

	public static void main(String[] args) {
		SpringApplication.run(PetshopApplication.class, args);
	}
}

