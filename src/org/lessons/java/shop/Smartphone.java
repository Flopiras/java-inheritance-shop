package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
	private int codiceIMEI;
	private int memoria;
	
	//costruttore
	public Smartphone(String nome, String descrizione, int prezzo, int iva, int codiceIMEI, int memoria) {
		
		super(nome, descrizione, prezzo, iva);
		
		setCodiceIMEI(codiceIMEI);
		setMemoria(memoria);
	}

	public int getCodiceIMEI() {
		return codiceIMEI;
	}

	public void setCodiceIMEI(int codiceIMEI) {
		this.codiceIMEI = codiceIMEI;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\n"
				+ "Codice IMEI dello smartphone: " + String.valueOf(getCodiceIMEI()) + "\n"
				+ "Memoria smartphone: " + String.valueOf(getMemoria());
	}
	
}
