package com.AnormaisEBruna.petshop;

import com.AnormaisEBruna.petshop.gui.views.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.AnormaisEBruna.petshop")
public class PetshopApplication implements CommandLineRunner {
	@Autowired
	Application application;

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(PetshopApplication.class);
		builder.headless(false);
		builder.run(args);
	}

	@Override
	public void run(String[] args) throws Exception {
		this.application.goToRoute("MainView");
		this.application.show();
	}
}

