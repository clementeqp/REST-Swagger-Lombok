package com.clemen.rest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;


@Entity
@Table(name="Cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="fecha")
	private Date fecha;

	@Column(name="dni")
	private String dni;
	

	
}
