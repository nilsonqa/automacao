package automacao.steps;

import org.junit.jupiter.api.Test;

import automacao.pages.BuscarPassagensPage;
import automacao.runner.Executa;

public class BuscarPassagemTest {
	
	BuscarPassagensPage buscar = new BuscarPassagensPage();
	
	@Test
	public void idaVoltaTeste() {
		Executa.iniciarTeste();
		buscar.idaVolta("São Paulo", "São Jose do Rio Preto");
	}

}
