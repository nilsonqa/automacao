package automacao.pages;

import automacao.elementos.Elementos;
import automacao.metodos.Metodos;

public class BuscarPassagensPage {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	public void idaVolta(String origem , String destino) {
		metodos.clicar(el.origem);
		metodos.limparCampo(el.origem);
		metodos.escrever(el.origem, origem);
		metodos.selecionarLista(el.lista, origem);
		
		
		metodos.limparCampo(el.destino);
		metodos.clicar(el.destino);
		metodos.escreverUmaLetraPorVez(el.destino, destino);
		metodos.selecionarLista(el.lista, destino);
		
		
		
	}

}
