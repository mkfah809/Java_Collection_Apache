package com.coderscampus.apachecommons.web;

import java.io.IOException;
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
//	private String cookingMinutes, dairyFree, glutenFree, instructions, preparationMinutes, pricePerServing,
//			readyInMinutes, servings, spoonacularScore, title, vegan, vegetarian;
//
//	@Autowired
//	Recipe recipe() {
//		return new Recipe(cookingMinutes, dairyFree, glutenFree, instructions, preparationMinutes, pricePerServing,
//				readyInMinutes, servings, spoonacularScore, title, vegan, vegetarian);
//	}

	@GetMapping("/all-recipes")
	public List<Recipe> displayAllRecipes() throws IOException {
		return fileServices.readAllRecipes("data.txt");
	}

	@GetMapping("/gluten-free")
	public List<Recipe> displayGlutenFreeRecipes() throws IOException {
		return null;
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