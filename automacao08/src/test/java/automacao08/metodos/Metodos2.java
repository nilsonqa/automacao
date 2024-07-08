package automacao08.metodos;

import org.openqa.selenium.By;

import automacao08.drivers.Drivers;

public class Metodos2 extends Drivers{
	
	public void clicarPorTexto(String atributo, String texto) {
		driver.findElement(By.xpath("//"+atributo+"[text()='"+texto+"']"));
		
	}
	

}
