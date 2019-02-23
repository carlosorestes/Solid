package br.com.srp.main;

public class GeradorDeNotaFiscal {

	private final EnviadorDeEmail email;
	private final NotaFiscalDao dao;
	
	public GeradorDeNotaFiscal(EnviadorDeEmail email, NotaFiscalDao dao) {
		this.email = email;
		this.dao = dao;
	}
	
	public Notafiscal gera(Fatura fatura) {
		
		double valor  = fatura.getValorMensal();
		
		Notafiscal nf = new Notafiscal(
			valor,
			impostoSimplesSobre0(valor)
				);
		email.enviarEmail(nf);
		dao.persiste(nf);
		
		return nf;
	}

	private Double impostoSimplesSobre0(double valor) {
		return valor * 0.0;
	}
}
