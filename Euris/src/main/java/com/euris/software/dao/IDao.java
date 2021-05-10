package com.euris.software.dao;

import java.util.List;

import com.euris.software.model.Articolo;

public interface IDao {
	
	List<Articolo> listaArticoli();
	Articolo singoloArticolo(int idCodice);
	void aggiungiArticolo(Articolo articolo);
	void eliminaArticolo(int idCodice);
	void aggiornaArticolo(Articolo articolo);
}
