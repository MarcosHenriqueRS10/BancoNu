package br.com.fiap.banco.model;

public class Corrente extends Conta {

	private double limite;
	
	public Corrente(Cliente cliente, double saldo) {
		super(cliente, saldo);
	}
	
	public Corrente(Cliente cliente, double saldo, double limite) {
		this(cliente,saldo);
		this.limite = limite;
	}
	
}
