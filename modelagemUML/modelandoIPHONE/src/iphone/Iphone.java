package iphone;

import iphone.aparelhotelefonico.AparelhoTelefonico;
import iphone.navegadorinternet.NavegadorTelefonico;
import iphone.reprodutormusica.ReprodutorMusica;

public class Iphone {
	public static void main(String[] args) {
		AparelhoTelefonico iphone1 = new AparelhoTelefonico();
		ReprodutorMusica iphone = new ReprodutorMusica();
		NavegadorTelefonico iphone2 = new NavegadorTelefonico();
		iphone.Tocar();
		iphone.Pausar();
		
		iphone1.Atender();
		iphone1.Ligar("11958957454");
		
		iphone2.exibirPagina("google.com");
		iphone2.adicionarNovaAba();
		
	}
}
