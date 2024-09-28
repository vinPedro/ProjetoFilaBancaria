package org.FilaBancaria.model;

public class Cliente {
	
	private String nomeString;
	private Prioridade preferenciaEnum;
	
	public Cliente(String nomeString, Prioridade preferenciaPrioridade) {
		this.nomeString  = nomeString;
		this.preferenciaEnum = preferenciaPrioridade;
	}
	
	public String getNomeString() {
		return nomeString;
	}
	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}
	public Prioridade getPreferenciaEnum() {
		return preferenciaEnum;
	}
	public void setPreferenciaEnum(Prioridade preferenciaEnum) {
		this.preferenciaEnum = preferenciaEnum;
	}
	
	@Override
	public String toString() {
		return "Cliente [nomeString=" + nomeString + ", preferenciaEnum=" + preferenciaEnum + "]";
	}
	
	


}
