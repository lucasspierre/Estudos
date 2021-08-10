package Banco;

public class ContaBancaria {
	
	private String cliente;
	private int num_conta;
	protected double saldo;
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public int getNum_conta() {
		return num_conta;
	}
	
	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if ((saldo - valor)>= 0 ) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor +" foi efetuado com Sucesso!");
		}else {
			System.out.println("Saque de R$" + valor +" não foi efetuado! Saldo Insuficiente!");
		}
	}
	
	void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de R$" + valor +" foi efetuado com Sucesso!");
	}
	
}