package br.com.srp.main;

public class Notafiscal {
	private Double valor;
	private Double valorCalculado;
	
	
	
	public Notafiscal(Double valor, Double valorCalculado) {
		this.valor = valor;
		this.valorCalculado = valorCalculado;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getValorCalculado() {
		return valorCalculado;
	}
	public void setValorCalculado(Double valorCalculado) {
		this.valorCalculado = valorCalculado;
	}

	
	
}
