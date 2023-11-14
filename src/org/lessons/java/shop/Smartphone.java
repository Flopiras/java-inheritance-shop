package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
	private int codiceIMEI;
	private int memoria;
	
	//costruttore
	public Smartphone(String nome, String descrizione, int prezzo, int iva, int codiceIMEI, int memoria) {
		
		super(nome, descrizione, prezzo, iva);
	}
}
