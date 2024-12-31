package iphone.aparelhotelefonico;

public class AparelhoTelefonico {
	public void Ligar (String numero) {
		System.out.println("Ligando para o numero " + numero);
		int contador = 30;
		if (numero.length() > 11) {
			System.out.println("numero está incorreto");
		} else {
		for (int i = 0; i <= contador; i++) {
			System.out.println("Tocando...");
			if (i+1 > contador) {
				iniciarCorreioVoz();
			}
		}
	
		}
	}
	public void Atender () {
		System.out.println("Atendendo ligação...");
	}
	private void iniciarCorreioVoz () {
		System.out.println("Deixe sua mensagem...");
	}

}
