package com.clemen.rest;


import com.clemen.rest.entities.Cliente;
import com.clemen.rest.services.impl.ClienteServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.Date;
import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context  = SpringApplication.run(Application.class, args);
		ClienteServiceImpl service = context.getBean(ClienteServiceImpl.class);

		Cliente c1 = new Cliente(null,"Antonio", "Rodriguez", new Date(2010,12,5),"12345678M");
		Cliente c2 = new Cliente(null,"Ana", "Lopez", new Date(2010,12,5),"12345678M");
		Cliente c3 = new Cliente(null,"Teresa", "Marino", new Date(2010,12,5),"12345678M");

		service.crearCliente(c1);
		service.crearCliente(c2);
		service.crearCliente(c3);
	}


}
