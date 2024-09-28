package org.FilaBancaria.service;

import java.util.List;

import org.FilaBancaria.dao.FilaBancaria;
import org.FilaBancaria.model.Cliente;

public interface FiltroFila {
	
	public List<Cliente> filtrarClientes(List<Cliente> clientes);

}
