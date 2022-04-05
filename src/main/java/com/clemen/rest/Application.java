package com.clemen.rest;


import com.clemen.rest.entities.Cliente;
import com.clemen.rest.services.impl.ClienteServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Clase principal de la aplicación
 * @author Clemente Quintana
 * @version 1.0
 * Base de datos http://localhost:8081/h2-console
 * Swagger http://localhost:8081/swagger-ui/
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
