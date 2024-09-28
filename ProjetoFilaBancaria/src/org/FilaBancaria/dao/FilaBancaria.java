package org.FilaBancaria.dao;

import java.util.ArrayList;
import java.util.List;

import org.FilaBancaria.model.Cliente;

public class FilaBancaria {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private static FilaBancaria filaBancaria = new FilaBancaria();
	
	private FilaBancaria() {
		super();
	}
	
	public static FilaBancaria getInsyancia() {
		return filaBancaria;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "FilaBancaria [clientes=" + clientes + "]";
	}
	
	
	
	
}
