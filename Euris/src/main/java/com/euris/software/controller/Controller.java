package com.euris.software.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.euris.software.dao.IDao;
import com.euris.software.model.Articolo;

@RestController
@RequestMapping("/articoli")
public class Controller {
	
	@Autowired
	private IDao dao;
	
	@GetMapping
	public List<Articolo> get(){
		return dao.listaArticoli();
	}
	
	@GetMapping("/{idcodice}")
	public Articolo articolo(@PathVariable int idCodice) {
		return dao.singoloArticolo(idCodice);
	}
	
	@PostMapping
	public void add(@RequestBody Articolo articolo) {
		dao.aggiungiArticolo(articolo);
	}
	
	@DeleteMapping("/{idcodice}")
	public void delete(@PathVariable int idCodice) {
		dao.eliminaArticolo(idCodice);
	}
	
	@PutMapping
	public void update(@RequestBody Articolo articolo) {
		dao.aggiornaArticolo(articolo);
	}
}
