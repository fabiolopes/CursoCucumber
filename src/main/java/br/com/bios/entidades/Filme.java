package br.com.bios.entidades;

public class Filme {

	private int estoque;
	
	private int aluguel;
	
	public void setEstoque(int arg1) {
		this.estoque = arg1;
	}

	public void setAluguel(int aluguel) {
		this.aluguel = aluguel;
	}

	public int getAluguel() {
		return aluguel;
	}

	public int getEstoque() {
		return this.estoque;
	}
	
}
