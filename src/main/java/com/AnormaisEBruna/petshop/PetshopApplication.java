package com.AnormaisEBruna.petshop;

import com.AnormaisEBruna.petshop.contracts.gui.GUIManager;
import com.AnormaisEBruna.petshop.models.*;
import com.AnormaisEBruna.petshop.services.AddressService;
import com.AnormaisEBruna.petshop.services.ClientService;
import com.AnormaisEBruna.petshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PetshopApplication implements CommandLineRunner {
	@Autowired
	GUIManager application;

	@Autowired
	UserService userService;

	@Autowired
	ClientService clientService;
	@Autowired
	AddressService addressService;

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(PetshopApplication.class);
		builder.headless(false);
		builder.run(args);
	}

	@Override
	public void run(String[] args) throws Exception {
		this.application.goToRoute("Painel Principal");
		this.application.show();

//
		AddressModel address = AddressModel.newInstance("12345123", "Equador", "RN", 10, "Teste", "Teste");
		addressService.save(address);
//
// 		ClientModel client = ClientModel.newInstance("Cliente 01", "#", "()90000-0000", address, userModel);
//		clientService.save(client);
//		UserModel userModel = this.userService.findById(1);

//		UserModel userModel = UserModel.newInstance("bruna", "bruna@gmail", "1234");
//		this.userService.delete(userModel);
		PetModel petModel = PetModel.newInstance("shnauzer", "frida", "1234", "pequenininho fofinho");
		this.userService.save(petModel);

//		ServiceType service_types = ServiceType.newInstance("banho");
//		this.serviceRepository.getId();
//		System.out.println(this.userService.findAll());
	}
}

