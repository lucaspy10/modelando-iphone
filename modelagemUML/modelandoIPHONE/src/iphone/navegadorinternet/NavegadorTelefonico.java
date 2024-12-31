package iphone.navegadorinternet;

public class NavegadorTelefonico {
	public void exibirPagina(String url) {
		System.out.println("O endereco da pagina é " + url);
		atualizarPagina();
	}
	public void adicionarNovaAba() {
	System.out.println("Abrindo nova aba...");
	}
	private void atualizarPagina() {
		System.out.println("A pagina está sendo atualizada...");
	}
}
