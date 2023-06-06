package com.AnormaisEBruna.petshop;

import com.AnormaisEBruna.petshop.contracts.gui.GUIManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PetshopApplication implements CommandLineRunner {
	@Autowired
	GUIManager application;

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(PetshopApplication.class);
		builder.headless(false);
		builder.run(args);
	}

	@Override
	public void run(String[] args) throws Exception {
		this.application.goToRoute("Hello");
		this.application.show();
	}
}
