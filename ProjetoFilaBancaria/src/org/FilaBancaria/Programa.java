package org.FilaBancaria;

import org.FilaBancaria.controller.Gerenciador;
import org.FilaBancaria.dao.FilaBancaria;
import org.FilaBancaria.model.Cliente;
import org.FilaBancaria.model.Prioridade;
import org.FilaBancaria.service.FilaNormal;
import org.FilaBancaria.service.FilaPrioritaria;
import org.FilaBancaria.service.FiltroFila;

public class Programa {

	public static void main(String[] args) {
		
		//Criando o gerenciador que abstrai a filtragem da lista
		Gerenciador gerenciador = new Gerenciador();
		
		//Filtros que serão usados
		FiltroFila prioridadeFila = new FilaPrioritaria();
		FiltroFila prioridadeNormal = new FilaNormal();
		
		//Criando a instancia da fila
		FilaBancaria filaBancaria = FilaBancaria.getInsyancia();
		
		//Criando e inserindo os clientes na fila
		Cliente cliente = new Cliente("Pedro", Prioridade.PRIORITARIO);
		filaBancaria.getClientes().add(cliente);		
		cliente = new Cliente("João", Prioridade.NORMAL);
		filaBancaria.getClientes().add(cliente);
		cliente = new Cliente("Renan", Prioridade.PRIORITARIO);
		filaBancaria.getClientes().add(cliente);
		
		System.out.println(filaBancaria);
		System.out.println(gerenciador.filtrarFila(filaBancaria.getClientes(), prioridadeNormal));
		System.out.println(gerenciador.filtrarFila(filaBancaria.getClientes(), prioridadeFila));
		
		System.out.println("\n----------------------------------------\n");
		
		System.out.println(FilaBancaria.getInsyancia());
		System.out.println(gerenciador.filtrarFila(FilaBancaria.getInsyancia().getClientes(), prioridadeNormal));
		System.out.println(gerenciador.filtrarFila(FilaBancaria.getInsyancia().getClientes(), prioridadeFila));
		
		
	}

}
