package com.euris.software.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

import com.euris.software.model.Articolo;
import com.euris.software.utils.BasicDao;

public class DaoMySQL extends BasicDao implements IDao, IDaoCalcoli{
	
	private static final String UPDATE_ARTICOLI_SETTING_VALUES = "UPDATE articoli SET nome = ?, prezzo = ? WHERE idcodice = ?";
	private static final String INSERT_IVALUES_INTO_ARTICOLI = "INSERT INTO articoli (idCodice, nome, prezzo) VALUES (?, ?, ?)";
	private static final String DELETE_ARTICOLO_BY_IDCODICE = "DELETE FROM articoli WHERE idcodice = ?";
	private static final String SELECT_ARTICOLO_BY_IDCODICE = "SELECT * FROM articoli WHERE idcodice = ?";
	private static final String SELECT_ALL_ARTICOLI = "SELECT * FROM articoli";

	public DaoMySQL(
			@Value("${db.address}") String dbAddress,
			@Value("${db.user}") String user,
			@Value("${db.psw}") String password) {
		super(dbAddress, user, password);
	}


	@Override
	public List<Articolo> listaArticoli() {
		List<Articolo> articoli = new ArrayList<>();
		List<Map<String, String>> maps = getAll(SELECT_ALL_ARTICOLI);
		for (Map<String, String> map : maps) {
			Articolo articolo = new Articolo();
			articolo.fromMap(map);
			articoli.add(articolo);
		}
		return articoli;
	}

	@Override
	public Articolo singoloArticolo(int idCodice) {
		Articolo articolo = null;
		Map<String, String> map = getOne(SELECT_ARTICOLO_BY_IDCODICE, idCodice);
		if (map != null) {
			articolo = new Articolo();
			articolo.fromMap(map);
		}
		return articolo;
	}
	
	@Override
	public void aggiungiArticolo (Articolo articolo) {
		execute(INSERT_IVALUES_INTO_ARTICOLI, 
				articolo.getIdCodice(), 
				articolo.getNome(),
				articolo.getPrezzo());
	}

	@Override
	public void eliminaArticolo(int idCodice) {
		execute(DELETE_ARTICOLO_BY_IDCODICE, idCodice);
	}

	@Override
	public void aggiornaArticolo(Articolo articolo) {
		execute(UPDATE_ARTICOLI_SETTING_VALUES, 
				articolo.getNome(),
				articolo.getPrezzo(),
				articolo.getIdCodice());
	}
	
	@Override
	public int somma(Articolo[] articolo) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int differenza(Articolo[] articolo) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int moltiplicazione(Articolo[] articolo) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int divisione(Articolo[] articolo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
