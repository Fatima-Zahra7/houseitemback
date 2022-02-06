package com.example.houseitem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.houseitem.model.Produit;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
	@Query("select prd from Produit prd where prd.id_house = ?1")
    List<Produit> findById_house(Long id_house);
}
