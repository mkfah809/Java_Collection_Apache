package com.coderscampus.apachecommons.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.apachecommons.domain.Recipe;
import com.coderscampus.apachecommons.service.FileService;

@RestController
public class RecipeConroller {
	@Autowired
	private FileService fileServices;

	List<Recipe> recipes = new ArrayList<Recipe>();
	
	@GetMapping("/all-recipes")
	public List<Recipe> displayAllRecipes() throws IOException {
		return fileServices.readAllRecipes(recipes);
	}

	@GetMapping("/gluten-free")
	public List<Recipe> displayGlutenFreeRecipes() throws IOException {
		List<Recipe> readAllRecipes = fileServices.readAllRecipes(recipes);
		return fileServices.readGlutenFreeRecipes(readAllRecipes);
	}

	@GetMapping("/vegan")
	public List<Recipe> displayVeganRecipes() {
		return null;
	}

	@GetMapping("/vegetarian")
	public List<Recipe> displayVegetarianRecipes() {
		return null;
	}

	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe> displayVeganAndGlutenFreeRecipes() {
		return null;
	}
}