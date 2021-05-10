package com.euris.software.dao;

import java.util.List;

import com.euris.software.model.Articolo;

public interface IDaoCalcoli {
	
	int somma(Articolo articolo[]);
	int differenza(Articolo articolo[]);
	int moltiplicazione(Articolo articolo[]);
	int divisione(Articolo articolo[]);
}
