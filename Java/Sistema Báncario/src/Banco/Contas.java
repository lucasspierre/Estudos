package Banco;

public class Contas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///Conta Normal
		ContaBancaria contaNormal = new ContaBancaria();
		System.out.println("Conta Corrente\n");
		
					  contaNormal.setCliente("Lucas Pierre");
					  contaNormal.setNum_conta(14442);
					  contaNormal.depositar(1000);
					  contaNormal.sacar(400);
					  
		System.out.println("Saldo atual: R$"+ contaNormal.saldo);
		System.out.println("Cliente: "+ contaNormal.getCliente());
		System.out.println("Conta: "+ contaNormal.getNum_conta());
		
		///Conta Especial
		ContaEspecial contaEspecial = new ContaEspecial();
		System.out.println("\nConta Especial\n");
		
					  contaEspecial.setCliente("Jailson Mendes");
					  contaEspecial.setNum_conta(47784);
					  contaEspecial.setLimite(-300);
					  contaEspecial.depositar(600);
					  contaEspecial.sacarContaEspecial(800);
					  
		System.out.println("Saldo atual: R$"+ contaEspecial.saldo);
		System.out.println("Valor total de limite emergêncial: R$" + (0 - contaEspecial.getLimite()));
		System.out.println("Cliente: "+ contaEspecial.getCliente());
		System.out.println("Conta: "+ contaEspecial.getNum_conta());
	
		///Conta Poupanca
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		System.out.println("\nConta Poupança\n");
		
				      contaPoupanca.setDiaDeHoje(7);
				      contaPoupanca.setCliente("Ricardo Diaz");
				      contaPoupanca.setNum_conta(78451);
				      contaPoupanca.depositar(800);
				      contaPoupanca.calcularNovoSaldo();
				      contaPoupanca.sacar(300);
				      
		System.out.println("saldo atualizado com rendimento: R$"+ contaPoupanca.getSaldo());
		System.out.println("Cliente: "+ contaPoupanca.getCliente());
		System.out.println("Conta: "+ contaPoupanca.getNum_conta());
		System.out.println("Dia de rendimento: "+ contaPoupanca.getDiaRendimento());
		System.out.println("Taxa de rendimento mensal: 0.5%");
	}

}