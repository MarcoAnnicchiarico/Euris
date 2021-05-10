package com.euris.software.model;

import com.euris.software.utils.IMappablePro;

public class Articolo implements IMappablePro{

	private int idCodice;
	private String nome;
	private String prezzo;
	
	public Articolo(int idCodice, String nome, String prezzo) {
		super();
		this.idCodice = idCodice;
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public Articolo() {
		super();
	}

	public int getIdCodice() {
		return idCodice;
	}

	public void setIdCodice(int idCodice) {
		this.idCodice = idCodice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
	public int splittingPound() {
		return Integer.parseInt((prezzo.split("p"))[0]);
	}
	
	public int splittingShilling() {
		return Integer.parseInt((prezzo.split("s"))[1]);
	}
	
	public int splittingPence() {
		return Integer.parseInt((prezzo.split("d"))[2]);
	}
	
}