package br.com.srp.main;

public class CalculadoraDeSalario {
	
	
	public double calcula(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}

}
