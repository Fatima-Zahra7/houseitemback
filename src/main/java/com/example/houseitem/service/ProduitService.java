package com.example.houseitem.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.houseitem.dto.ProduitDto;
import com.example.houseitem.model.Produit;
import com.example.houseitem.repository.HouseRepository;
import com.example.houseitem.repository.ProduitRepository;

public class ProduitService {
	
	@Autowired
    private HouseRepository houseRepository;
	
	@Autowired
	private ProduitRepository prdRepository;
	
	public ProduitService() {
	}
	
	public ArrayList<Produit> getListePerHouse(Long id_house) {
		Produit prd = new Produit(); 
		prd.setId_house(id_house);
		
		ArrayList<Produit> listePrd = new ArrayList<Produit>(); 
		listePrd.add(this.prdRepository.save(prd));
		
		return listePrd;
	}
}
