package Banco;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento = 5;
	private int diaDeHoje;
	
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public int getDiaDeHoje() {
		return diaDeHoje;
	}
	
	public void setDiaDeHoje(int diaDeHoje) {
		this.diaDeHoje = diaDeHoje;
	}
	
	public double calcularNovoSaldo() {
		double saldoAtualizado = super.saldo * 0.005;
		if(this.diaDeHoje >= this.diaRendimento) {
			super.saldo += saldoAtualizado;
			return super.saldo;
		}else {
			return super.saldo;
		}
	}
}