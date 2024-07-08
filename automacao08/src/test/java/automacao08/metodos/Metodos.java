package automacao08.metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;

import automacao08.drivers.Drivers;

public class Metodos extends Drivers{
	
	
	
	public static void validarTitle(String title) {
		assertEquals(driver.getTitle(), title);
	}
	
	public static void validarUrl(String url) {
		assertEquals(driver.getCurrentUrl(), url);
	}
	public static void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	public static void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	public static void validar(By elemento ,String texto) {
		String textoCapturado = driver.findElement(By.xpath("//p[@id='name']")).getText();
		assertEquals(textoCapturado, texto);
		System.out.println(textoCapturado);
		
	}
}
