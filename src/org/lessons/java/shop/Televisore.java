package org.lessons.java.shop;

public class Televisore extends Prodotto{

	private int altezza;
	private int diagonale;
	private int pollici;
	private boolean smart;
	
	//costruttore
	public Televisore(String nome, String descrizione, int prezzo, int iva, boolean fidelity, int altezza, int diagonale, int pollici, boolean smart) {
		super(nome, descrizione, prezzo, iva, fidelity);
		
		setAltezza(altezza);
		setDiagonale(diagonale);
		setPollici(pollici);
		setSmart(smart);
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
				+ "Dimensioni televisore: " + String.valueOf(getAltezza()) + "x" + String.valueOf(getDiagonale()) + "\n"
				+ "Pollici: " + String.valueOf(getPollici()) + "''";
	}
	
	@Override
	public String getPrezzoScontato() {
		
		if(!smart) {
			double prezzoScontato = Integer.parseInt(getPrezzoFinale()) * 0.90;
			
			return String.format("%.2f", prezzoScontato);
		}
		else {
			return super.getPrezzoScontato();
		}
	}
}