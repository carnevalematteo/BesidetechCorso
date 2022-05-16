package com.corso.file;

import java.io.Serializable;

public class Autoveicolo implements Serializable {

	private String targa;
	private String marca;
	private String motore;
	private int numeroPosti;

	public Autoveicolo(String targa, String marca, String motore, int numeroPosti) {
		this.targa = targa;
		this.marca = marca;
		this.motore = motore;
		this.numeroPosti = numeroPosti;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMotore() {
		return motore;
	}

	public void setMotore(String motore) {
		this.motore = motore;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	protected int numeroPorte = 5;
	
	protected int numeroRuote = 4;
	
	public int getnumeroPorte() {return numeroPorte;}

	public int getnumeroRuote() {return 4;}

	@Override
	public String toString() {
		return "Autoveicolo{" +
				"targa='" + targa + '\'' +
				", marca='" + marca + '\'' +
				", motore='" + motore + '\'' +
				", numeroPosti=" + numeroPosti +
				", numeroPorte=" + numeroPorte +
				", numeroRuote=" + numeroRuote +
				'}';
	}
}
