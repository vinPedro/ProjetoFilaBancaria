package org.FilaBancaria.service;

import java.util.List;
import java.util.stream.Collectors;

import org.FilaBancaria.model.Cliente;
import org.FilaBancaria.model.Prioridade;

public class FilaPrioritaria implements FiltroFila{

	@Override
	public List<Cliente> filtrarClientes(List<Cliente> clientes) {
		List<Cliente> filaPrioritariaList = clientes.stream()
				.filter(pessoa -> pessoa.getPreferenciaEnum().equals(Prioridade.PRIORITARIO))
				.collect(Collectors.toList());
		
		return filaPrioritariaList;
	}

}
