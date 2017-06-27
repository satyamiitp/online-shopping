package com.sat.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sat.shoppingbackend.dao.CategoryDAO;
import com.sat.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<Category>();
   
	
	static
	{
		Category category = new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Telivision");
		category.setDescription(" This is a good televison Dude");
		category.setImageURL("CAT_1.png");
		category.setActive(true);
		
		categories.add(category);
		
		// adding second category
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription(" This is a good Mobile Dude");
		category.setImageURL("CAT_2.png");
		category.setActive(true);
		
		
		categories.add(category);
		
		
		// adding third category
		
				category = new Category();
				category.setId(3);
				category.setName("Laptop");
				category.setDescription(" This is a good lap Dude");
				category.setImageURL("CAT_3.png");
				category.setActive(true);
				
				
		categories.add(category);
		
	}
   

	
	@Override
	public List<Category> list() {
		 
		return categories;
	}



	@Override
	public Category get(int id) {
		// enhanced for loop
		
		for(Category category:categories)
		{
			if(category.getId()==id)
				return category;
		}
		
		return null;
	}








}
