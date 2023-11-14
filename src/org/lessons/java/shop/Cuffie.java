package org.lessons.java.shop;

public class Cuffie  extends Prodotto{
	
	private String colore;
	private String tipo;
	
	//costruttore
	public Cuffie(String nome, String descrizione, int prezzo, int iva, String colore, String tipo) {
		super(nome,descrizione, prezzo, iva);
	}

	//getters and setters
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		
		return super.toString() + "\n"
				+ "Colore delle cuffie: " + getColore() + "\n"
				+ "Tipo: " + getTipo();
	}
}
