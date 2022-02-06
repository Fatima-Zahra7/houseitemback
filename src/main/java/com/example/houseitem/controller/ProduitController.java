package com.example.houseitem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.houseitem.model.Produit;
import com.example.houseitem.service.ProduitService;

@Controller
@CrossOrigin(origins = "*")
public class ProduitController {

	@Autowired
	private ProduitService prdService;
	
	public ProduitController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping(value = "/produit/liste")
	public ResponseEntity<List<Produit>> addUser(@PathVariable Long id_house){
        return ResponseEntity.ok(this.prdService.getListePerHouse(id_house));
    }
}
