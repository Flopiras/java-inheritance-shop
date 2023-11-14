package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
	
	static final int PRODOTTI_COUNT = 3;

	public static void main(String[] args) {
		
		//apertura Scanner
		Scanner in = new Scanner(System.in);
		
		boolean isFinish = false;
		
		Prodotto[] prodotti = new Prodotto[PRODOTTI_COUNT];
		
		do {
			
		System.out.println("Vuoi aggiungere qualcosa al carrello? si/no");
		String strFinish = in.nextLine();
		if(strFinish.equals("no")) {
			isFinish = true;
			break;
		}
			
		System.out.println("Che elemento vuoi inserire? smartphone / televisore / cuffie");
		String strProduct = in.nextLine();
		
		
		
		//chiedere all'utente i dati per la creazione di un nuovo prodotto
		System.out.println("Nome: ");
		String strNome = in.nextLine();
		
		System.out.println("Descrizione: ");
		String strDescrizione = in.nextLine();
		
		System.out.println("Prezzo: ");
		String strPrezzo = in.nextLine();
		int prezzo = Integer.valueOf(strPrezzo);
		
		System.out.println("Iva: ");
		String strIva = in.nextLine();
		int iva = Integer.valueOf(strIva);
		
		//smartphone
		if(strProduct.equals("smartphone")) {
			
			System.out.println("Codice IMEI Smartphone: ");
			String strCodiceIMEI = in.nextLine();
			int codiceIMEI = Integer.valueOf(strCodiceIMEI);
			
			System.out.println("Memoria Smartphone: ");
			String strMemoria = in.nextLine();
			int memoria = Integer.valueOf(strMemoria);
		
			//creazione smartphone
			prodotti[0] = new Smartphone(strNome, strDescrizione, prezzo, iva, codiceIMEI, memoria);
		
		} else if(strProduct.equals("televisore")) {
			
			System.out.println("Altezza televisore: ");
			String strAltezza = in.nextLine();
			int altezza = Integer.valueOf(strAltezza);
			
			System.out.println("Diagonale televisore: ");
			String strDiagonale = in.nextLine();
			int diagonale = Integer.valueOf(strDiagonale);
			
			System.out.println("Pollici televisore: ");
			String strPollici = in.nextLine();
			int pollici = Integer.valueOf(strPollici);
			
			System.out.println("E' un televisore smart? si/no ");
			String strSmart = in.nextLine();
			boolean smart = strSmart == "si" ? true : false;
			
			//creazione televisore
			prodotti[1] = new Televisore(strNome, strDescrizione, prezzo, iva, altezza, diagonale, pollici, smart);
			
		} else if(strProduct.equals("cuffie")) {
			
			System.out.println("Colore cuffie: ");
			String colore = in.nextLine();
			
			System.out.println("Tipo cuffie: wireless/cablate");
			String tipo = in.nextLine();
			
			//creazione cuffie
			prodotti[2] = new Cuffie(strNome, strDescrizione, prezzo, iva, colore, tipo);
		}
		
		} while(!isFinish);
		
		System.out.println(
				"Nel carrello sono presenti:" + "\n"
				+ prodotti[0] + "\n"
				+ prodotti[1] + "\n"
				+ prodotti[2]
				);
		
		
		//chiusura scanner
		in.close();
		
	}

}
