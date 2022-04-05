package com.clemen.rest.controllers;


import com.clemen.rest.entities.Cliente;
import com.clemen.rest.services.ClienteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
public class ClienteController {

    /**
     * Url de acceso
     * http://localhost:8081/api/clientes
     */


    private final String URL = "/api/clientes";

    @Autowired
    private ClienteService clienteService;


    /**
     *
     * Crear un cliente pasado por JSON
     */
    @PostMapping(URL)
    @ApiOperation("Crear un Cliente")
    public ResponseEntity<Cliente> crearCliente(@RequestBody Cliente cliente){
        if(cliente.getId()!=null)
            return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(clienteService.crearCliente(cliente));
    }

    /**
     * Actualizar un cliente
     */
    @ApiOperation("Actualizar un Cliente")
    @PutMapping(URL)
    public ResponseEntity<Cliente> actualizarCliente(@RequestBody Cliente cliente){
        if(clienteService.buscarPorId(cliente.getId())==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(clienteService.actualizarCliente(cliente));
    }

    /**
     * Ver todos los clientes
     */
    @ApiOperation("Ver todos los Clientes")
    @GetMapping(URL)
    public ResponseEntity<List<Cliente>> verClientes(){
        List<Cliente> clientes = clienteService.verTodosClientes();
        if(clientes.size()>0)
            return ResponseEntity.ok(clientes);
        return ResponseEntity.noContent().build();
    }

    @ApiOperation("Buscar un Cliente por PK, id")
    @GetMapping(URL + "/{id}")
    public ResponseEntity<Cliente> verCliente(@PathVariable Long id){
        if(clienteService.buscarPorId(id)!=null)
            return ResponseEntity.ok(clienteService.buscarPorId(id));
    return ResponseEntity.notFound().build();
    }

    /**
     *
     * @param id PK del cliente a borrar
     * @return ResponseEntity
     */
    @DeleteMapping(URL + "/{id}")
    @ApiOperation("Borrar un Cliente por PK, id")
    public ResponseEntity<Cliente> borrarCliente(@PathVariable Long id){
        Cliente cliente = clienteService.buscarPorId(id);

        if(cliente==null)
            return ResponseEntity.notFound().build();

        clienteService.borrarCliente(clienteService.buscarPorId(id));
        return ResponseEntity.noContent().build();
    }

    @ApiIgnore // ignorar este método para que no aparezca en la documentación de la API Swagger
    @DeleteMapping(URL)
    public ResponseEntity<Cliente> borrarCliente(){
        clienteService.borrarTodos();
        return ResponseEntity.noContent().build();
    }



}
