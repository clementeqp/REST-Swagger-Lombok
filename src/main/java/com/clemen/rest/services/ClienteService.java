package com.clemen.rest.services;

import com.clemen.rest.entities.Cliente;

import java.util.List;

public interface ClienteService {
	
	Cliente guardarCliente(Cliente cliente);

	List<Cliente> verTodosClientes();

	List<Cliente> buscarNombreApellidos(String nombre, String apellido);

	void borrarCliente(Cliente cliente);

	Cliente buscarPorId(Long id);

	Cliente crearCliente(Cliente cliente);

	Cliente actualizarCliente(Cliente cliente);
}
