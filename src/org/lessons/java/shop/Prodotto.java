package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private int prezzoBase;
	private int iva;
	
	//costruttore
	public Prodotto(String nome, String descrizione, int prezzo, int iva) {
		
		generateCodice();
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzoBase(prezzo);
		setIva(iva);
	}
	
	//setter e getter per il codice
	private void setCodice(int codice) {
		
		this.codice = codice;
	}
	
	public int getCodice() {
		return codice;
	}
	
	//setter e getter per il nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	//setter e getter per la descrizione
	public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
		
	public String getDescrizione() {
			return descrizione;
		}
	
	//setter e getter per il prezzo base
	public void setPrezzoBase(int prezzo) {
		this.prezzoBase = prezzo;
	}
	
	public int getPrezzoBase() {
		return prezzoBase;
	}
	
	//setter e getter per l'iva
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public String getIva() {
		return iva + "%";
	}
	
	//metodo per generare un codice
	private void generateCodice() {
		Random rnd = new Random();
		
		int rndCodice = rnd.nextInt(0, 10001);
		
		setCodice(rndCodice);
	}
	
	
	//metodo per avere il prezzo compreso di iva
	public String getPrezzoFinale() {
		double prezzoFinale = prezzoBase + (prezzoBase * iva / 100);
		
		return String.format("%.2f", prezzoFinale);
	}
	
	//metodo per aavere il nome esteso
	public String getNomeEsteso() {
		return codice + "-" + nome;
	}
	
	@Override
	public String toString() {
		return "PRODOTTO: \n" 
				+ "Nome: " + getNome() + "\n"
				+ "Descrizione: " + getDescrizione() + "\n"
				+ "Prezzo : " + String.valueOf(getPrezzoFinale());
				
	}
}
