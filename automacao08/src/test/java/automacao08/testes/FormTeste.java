package automacao08.testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import automacao08.drivers.Drivers;
import automacao08.elementos.ElementosTestBox;
import automacao08.metodos.Metodos;
import automacao08.navegadores.Navegadores;

public class FormTeste extends Drivers {
	
	ElementosTestBox el = new ElementosTestBox();
	Metodos metodos = new Metodos();
	
	@BeforeEach
	public void iniciarTeste(){
		Navegadores.iniciarTeste("Chrome");
		
	}
	@AfterEach
	public void finalizarTeste() {
		Navegadores.finalizarTeste();
		
	}
	
		
	@Test
	public void validarTitle() {
		Metodos.validarTitle("DEMOQA");
	}
	@Test
	public void validarUrl() {
		Metodos.validarUrl("https://demoqa.com/text-box");
	}
	@Test
	public void escrever() throws InterruptedException {
		Metodos.escrever(el.fullName, "Nilson");
		Metodos.escrever(el.Email, "nilson@gmail.com");
		Metodos.escrever(el.currentAddress, "av.");
		Metodos.escrever(el.permanentAddress, "Nilson teste");
		Thread.sleep(3000);
		Metodos.clicar(el.btn);
		Metodos.validar(el.validarName, "Name:Nilson");
			
	}
}


