package org.lessons.java.shop;

public class Televisore extends Prodotto{

	private int altezza;
	private int diagonale;
	private int pollici;
	private boolean smart;
	
	//costruttore
	public Televisore(String nome, String descrizione, int prezzo, int iva, int altezza, int diagonale, int pollici, boolean smart) {
		super(nome, descrizione, prezzo, iva);
	}
	
	//getters and setters
	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getDiagonale() {
		return diagonale;
	}

	public void setDiagonale(int diagonale) {
		this.diagonale = diagonale;
	}

	public int getPollici() {
		return pollici;
	}

	public void setPollici(int pollici) {
		this.pollici = pollici;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString() + "\n"
				+ "Dimensioni televisore: " + getAltezza() + "x" + getDiagonale() + "\n"
				+ "Pollici: " + getPollici() + "''";
	}
}
