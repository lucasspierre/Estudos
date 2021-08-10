package Banco;

public class ContaEspecial extends ContaBancaria{
    
    private double limite;
    
    public boolean sacarContaEspecial(double valor){
        if((super.saldo - valor)>= limite){
            super.saldo -= valor;
            System.out.println("Saque de R$" + valor +" foi efetuado com Sucesso!");
            return true;}
        else{
            System.out.println("Saque de R$" + valor +" não foi efetuado! Saldo Insuficiente!");
            return false;
            }
        }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}