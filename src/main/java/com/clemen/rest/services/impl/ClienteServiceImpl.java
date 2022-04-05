package com.clemen.rest.services.impl;

import com.clemen.rest.entities.Cliente;
import com.clemen.rest.repositories.ClienteRepository;
import com.clemen.rest.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

	
	@Autowired
	ClienteRepository clienteRepository;
	
	/*
	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	*/
	
	@Override
	public Cliente guardarCliente(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> verTodosClientes() {
		return this.clienteRepository.findAll();
	}

	@Override
	public List<Cliente> buscarNombreApellidos(String nombre, String apellido) {
		return this.clienteRepository.findByNombreAndApellidos(nombre, apellido);
	}

	@Override
	public void borrarCliente(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}

	@Override
	public Cliente buscarPorId(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}


	@Override
	public Cliente crearCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
}
