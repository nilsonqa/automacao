package automacao08.navegadores;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import automacao08.drivers.Drivers;

public class Navegadores extends Drivers {

	/**
	 * ABRIR NAVEGADORES
	 * 
	 * @category UITest
	 * @param tipo
	 */
	public static void iniciarTeste(String tipo) {

		if (tipo.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (tipo.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (tipo.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
	}

	public static void finalizarTeste() {
		driver.quit();
	}
}