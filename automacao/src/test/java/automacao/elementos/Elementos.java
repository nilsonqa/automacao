package automacao.elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By origem = By.xpath("//div[@class='sbox5-segment--2_IQ3'][1]//input[@placeholder='Insira sua cidade de origem']");
	public By destino = By.xpath("//div[@class='sbox5-segment--2_IQ3'][1]//input[@placeholder='Insira sua cidade de destino']");
	public By lista = By.cssSelector("ul.ac-group-items li");
}
 	
