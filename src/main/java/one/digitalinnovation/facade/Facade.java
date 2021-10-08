package one.digitalinnovation.facade;

import one.digitalinnovation.subsistema1.crm.CrmService;
import one.digitalinnovation.subsistema2.cep.CepApi;

public class Facade {
	public static void run() {
		System.out.println("\n------------------------------ FACADE\n");

		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
