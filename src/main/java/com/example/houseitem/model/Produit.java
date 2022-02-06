package com.example.houseitem.model;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_produit;

    @Column
    private String name;

    @Column
    private int quantity;

    @Column
    private Long id_house;

    public Produit() {
    }

	public Long getId_produit() {
		return id_produit;
	}

	public void setId_produit(Long id_produit) {
		this.id_produit = id_produit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getId_house() {
		return id_house;
	}

	public void setId_house(Long id_house) {
		this.id_house = id_house;
	}

	@Override
	public String toString() {
		return "Produit [id_produit=" + id_produit + ", name=" + name + ", quantity=" + quantity + ", id_house="
				+ id_house + "]";
	}

}
