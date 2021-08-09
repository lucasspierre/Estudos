package Empresa;

public class TestaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
				cliente.setNome("Vanderlei Silva");
				cliente.setIdade(67);
				cliente.setSexo("Masculino");
				cliente.setValorDivida(365.00);
				cliente.setAnoNascim(1954);
				
				System.out.println("Cliente: "+ cliente.getNome());
				System.out.println("Idade: "+ cliente.getIdade() + " anos");
				System.out.println("Sexo: "+ cliente.getSexo());
				System.out.println("Valor de Divida: R$"+ cliente.getValorDivida());
				System.out.println("Data de Nascimento: "+ cliente.getAnoNascim());
				
		Gerente gerente = new Gerente();
				gerente.setNome("Lucas Pierre");
				gerente.setSalario(3512.00);
				gerente.setValorVendas(75000);
				gerente.setQntVendas(322);
				
				System.out.println("");
			
				System.out.println("Gerente: "+ gerente.getNome());
				System.out.println("Salário: R$"+ gerente.getSalario());
				System.out.println("Valor total de vendas: R$"+ gerente.getValorVendas());
				System.out.println("Total de vendas concluídas: "+ gerente.getQntVendas());
				
		Diretor	diretor = new Diretor();
				diretor.setNome("Luis Philipe");
				diretor.setIdade(20);
				diretor.setMatricula("2548");
				diretor.setSalario(8450.00);
				diretor.setNomeDiretoria("Diretor de Vendas");
				
				System.out.println("");
				
				System.out.println("Diretor: "+ diretor.getNome());
				System.out.println("Idade: "+ diretor.getIdade() + " anos");
				System.out.println("Matricula: "+ diretor.getMatricula());
				System.out.println("Nome da Diretoria: "+ diretor.getNomeDiretoria());
				System.out.println("Valor do INSS: R$"+ diretor.valorInss());				
	}

}