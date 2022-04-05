package com.clemen.rest.entities;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name="Clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty("Clave autoincremental tipo Long")
	private Long id;

	@ApiModelProperty("Nombre del Cliente")
	@Column(name="nombre")
	private String nombre;
	@ApiModelProperty("Apellidos del Cliente")
	@Column(name="apellidos")
	private String apellidos;
	@ApiModelProperty("Fecha de nacimiento del Cliente")
	@Column(name="fecha_alta")
	private Date fechaAlta;

	@ApiModelProperty("DNI del Cliente")
	@Column(name="dni")
	private String dni;
	

	
}
