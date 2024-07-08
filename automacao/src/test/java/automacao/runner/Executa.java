package automacao.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;

import automacao.drivers.Drivers;

public class Executa extends Drivers{
	
	public static void iniciarTeste() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.decolar.com");
		
	}
	
	public static void encerrarTeste() {
		//driver.quit();
	}
}
