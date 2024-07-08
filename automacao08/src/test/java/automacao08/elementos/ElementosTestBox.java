package automacao08.elementos;

import org.openqa.selenium.By;

import automacao08.metodos.Metodos;

public class ElementosTestBox extends Metodos{
	
	public By fullName = By.xpath("//input[@id='userName']");
	public By Email = By.xpath("//input[@id='userEmail']");
	public By currentAddress = By.xpath("//textarea[@id='currentAddress']");
	public By permanentAddress = By.xpath("//textarea[@id='permanentAddress']");
	public By btn = By.xpath("//button[@id='submit']");
	public By validarName = By.xpath("//p[@id='name']");
	
	
	
}
