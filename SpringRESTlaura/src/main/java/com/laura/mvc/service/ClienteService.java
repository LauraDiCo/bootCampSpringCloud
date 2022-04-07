package com.laura.mvc.service;

import org.springframework.http.ResponseEntity;

import com.laura.mvc.entity.Cliente;

import java.util.List;

public interface ClienteService {

	Cliente guardarCliente(Cliente cliente);

	List<Cliente> verTodosClientes();

	List<Cliente> buscarNombreApellidos(String nombre, String apellido);

	ResponseEntity<String> borrarCliente(Long id);

	Cliente buscarPorId(Object object);

	Cliente crearCliente(Cliente cliente);

	Cliente actualizarCliente(Cliente cliente);

	Cliente buscarPorId(Long id);
}
