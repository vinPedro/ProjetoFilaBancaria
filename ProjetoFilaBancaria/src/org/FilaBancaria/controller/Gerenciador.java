package org.FilaBancaria.controller;

import java.util.List;

import org.FilaBancaria.dao.FilaBancaria;
import org.FilaBancaria.model.Cliente;
import org.FilaBancaria.service.FiltroFila;

public class Gerenciador {

	public List<Cliente> filtrarFila(List<Cliente> clientes, FiltroFila filtro) {
		return filtro.filtrarClientes(clientes);
	}
}
