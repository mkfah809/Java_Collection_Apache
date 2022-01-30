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
		recipes.clear();
		return fileServices.readAllRecipes(recipes);
	}

	@GetMapping("/gluten-free")
	public List<Recipe> displayGlutenFreeRecipes() throws IOException {
		List<Recipe> glutenFree = new ArrayList<Recipe>();
		recipes.clear();
		return fileServices.readGlutenFreeRecipes(recipes, glutenFree);
	}

	@GetMapping("/vegan")
	public List<Recipe> displayVeganRecipes() throws IOException {
		List<Recipe> vegan = new ArrayList<Recipe>();
		recipes.clear();
		return fileServices.readVeganRecipes(recipes, vegan);
	}

	@GetMapping("/vegetarian")
	public List<Recipe> displayVegetarianRecipes() throws IOException {
		List<Recipe> vegetarian = new ArrayList<Recipe>();
		recipes.clear();
		return fileServices.readVeganRecipes(recipes, vegetarian);
	}

	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe> displayVeganAndGlutenFreeRecipes() throws IOException {
		List<Recipe> veggieAndGlutenFreeRecipes = new ArrayList<Recipe>();
		recipes.clear();
		return fileServices.readVeganRecipes(recipes, veggieAndGlutenFreeRecipes);
	}
}