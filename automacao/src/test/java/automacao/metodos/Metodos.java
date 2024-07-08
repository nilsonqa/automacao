package automacao.metodos;

import java.text.BreakIterator;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automacao.drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void limparCampo(By elemento) {
		driver.findElement(elemento).clear();

	}
	
	public void aguardarElementoClicavel(By elemento, int segundos) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(segundos)); 
		wait.until(ExpectedConditions.elementToBeClickable(elemento));	
		
	}

	public void selecionarLista(By elemento, String texto) {
		aguardarElementoClicavel(elemento,4);
		List<WebElement> listaItens = driver.findElements(elemento);
		for (WebElement item :listaItens){
			if (item.getText().contains(texto)) {
				item.click();
				break;
			}
		}

	}
	
	public void escreverUmaLetraPorVez(By elemento,String texto) {
		for (int i = 0 ; i < texto.length(); i++) {
			driver.findElement(elemento).sendKeys(String.valueOf(texto.charAt(i)));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
