package org.lessons.java.shop;

public class Cuffie  extends Prodotto{
	
	private String colore;
	private String tipo;
	
	//costruttore
	public Cuffie(String nome, String descrizione, int prezzo, int iva, boolean fidelity, String colore, String tipo) {
		super(nome,descrizione, prezzo, iva, fidelity);
		
		setColore(colore);
		setTipo(tipo);
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
	
	@Override
	public String getPrezzoScontato() {
		
		if(tipo.equals("cablate")) {
			double prezzoScontato = Integer.parseInt(getPrezzoFinale()) * 0.93;
			
			return String.format("%.2f", prezzoScontato);
		}
		else {
			return super.getPrezzoScontato();
		}
	}
}
