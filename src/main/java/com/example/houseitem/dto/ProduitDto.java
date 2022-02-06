package com.example.houseitem.dto;

public class ProduitDto {
	
	private String name;
    private int quantity;
    private Long id_house;
    
    public ProduitDto() {
    }

	public ProduitDto(String name, int quantity, Long id_house) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.id_house = id_house;
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

}
