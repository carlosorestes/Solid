package br.com.srp.main;

public class DezOuVintePorCento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}

}
