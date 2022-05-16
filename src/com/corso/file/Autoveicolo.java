package com.corso.file;

public class Autoveicolo extends Veicolo{

	public Autoveicolo(String t, String m, String mo, int n, String tipo) {
		super(t, m, mo, n, tipo);
		// TODO Auto-generated constructor stub
	}

	protected int numeroPorte = 5;
	
	protected int numeroRuote = 4;
	
	public int getnumeroPorte() {return numeroPorte;}

	public int getnumeroRuote() {return 4;}
	
	public String toString () {
		return super.toString() + "  Numero porte=  " + numeroPorte + "  Numero ruote  " + numeroRuote;
				
	}





}
