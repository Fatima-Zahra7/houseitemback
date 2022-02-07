package com.example.houseitem.repository;

import com.example.houseitem.model.House;
import com.example.houseitem.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
	
	@Query(value="select item from Item item where item.id_item = ?1")
	 Item findByItemId(Long id_item);

}
