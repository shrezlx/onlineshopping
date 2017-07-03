package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")

public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	static{
	Category category = new Category();
	category.setId(1);
	category.setName("Abhishek");
	category.setDescription("This guy is awesome!!!");
	category.setImageURL("me.jpg");
	categories.add(category);
	
	category = new Category();
	category.setId(2);
	category.setName("GG");
	category.setDescription("Its a GG!!!");
	category.setImageURL("gg.jpg");
	categories.add(category);
	
	category = new Category();
	category.setId(3);
	category.setName("dota");
	category.setDescription("The International is near!!!");
	category.setImageURL("dota2.jpg");
	categories.add(category);
	
	
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop
		for(Category category : categories){
			if(category.getId()==id)
				return category;
		}
		return null;
	}
}