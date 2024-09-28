package org.FilaBancaria.service;

import java.util.List;
import java.util.stream.Collectors;

import org.FilaBancaria.model.Cliente;
import org.FilaBancaria.model.Prioridade;

public class FilaNormal implements FiltroFila{

	@Override
	public List<Cliente> filtrarClientes(List<Cliente> clientes) {
		List<Cliente> filaNormaList = clientes.stream()
				.filter(pessoa -> pessoa.getPreferenciaEnum().equals(Prioridade.NORMAL))
				.collect(Collectors.toList());
		
		return filaNormaList;
	}

}
