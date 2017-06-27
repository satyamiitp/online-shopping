package com.sat.shoppingbackend.dao;

import java.util.List;

import com.sat.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();
	
	Category get(int id);
	

}
