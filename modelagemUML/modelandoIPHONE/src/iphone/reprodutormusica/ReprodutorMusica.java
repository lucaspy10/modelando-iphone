package iphone.reprodutormusica;

import java.util.Scanner;

public class ReprodutorMusica {
	Scanner scanner = new Scanner(System.in);
	public void Tocar () {
		selecionarMusica("");
		System.out.println("Tocar musica");
	}
	public void Pausar () {
		System.out.println("Pausar musica");
	}
	private void selecionarMusica (String musica) {
		String selecionada = musica;
		if (selecionada == "") {
				System.out.println("Digite o nome da musica que voce gostaria de ouvir: ");
				selecionada = scanner.nextLine();
			
		}else {
			System.out.println("Musica selecionanda foi " + selecionada );
			musica += selecionada;
		}
	}

}
