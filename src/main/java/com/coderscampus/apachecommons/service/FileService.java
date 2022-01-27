package com.coderscampus.apachecommons.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.springframework.stereotype.Service;

import com.coderscampus.apachecommons.domain.Recipe;

@Service
public class FileService {


	public List<Recipe> readAllRecipes(List<Recipe> recipes) throws IOException {
		Reader reader = new FileReader("data.txt");
		@SuppressWarnings({ "static-access", "deprecation" })
		Iterable<CSVRecord> records = CSVFormat.RFC4180.newFormat(',').withIgnoreSurroundingSpaces().withQuote('"')
				.withEscape('\\').withQuoteMode(QuoteMode.NONE).withFirstRecordAsHeader().parse(reader);
		for (CSVRecord record : records) {
			Recipe recipe = new Recipe(record.get(0), record.get(1), record.get(2), record.get(3), record.get(4),
					record.get(5), record.get(6), record.get(7), record.get(8), record.get(9), record.get(10),
					record.get(11));
			recipes.add(recipe);
		}
		return recipes;
	}

	public List<Recipe> readGlutenFreeRecipes(List<Recipe> recipes) throws IOException {
		
		List<Recipe> glutenFreeRecipes = new ArrayList<Recipe>();
		for (Recipe recipe : recipes) {
			if (recipe.getGlutenFree().equals(true)) {
				glutenFreeRecipes.add(recipe);
			}
		}
		return recipes;
	}
	
	public List<Recipe> readVeganRecipes(List<Recipe> recipes) throws IOException {
		List<Recipe> veganRecipes = new ArrayList<Recipe>();
		for(Recipe recipe : recipes) {
			if(recipe.getVegan().equals(true)) {
				veganRecipes.add(recipe);
			}
		}
		return veganRecipes;
	}
	
	public List<Recipe> readVegetarianRecipes(List<Recipe> recipes) throws IOException {
		List<Recipe> vegetarianRecipes = new ArrayList<Recipe>();
		for(Recipe recipe : recipes) {
			if(recipe.getVegetarian().equals(true)) {
				vegetarianRecipes.add(recipe);
			}
		}
		return vegetarianRecipes;
	}
	
	public List<Recipe> readVeganAndGlutenFreeRecipes(List<Recipe> recipes) throws IOException {
		List<Recipe> veganAndGlutenfreeRecipes = new ArrayList<Recipe>();	
		 for(Recipe recipe : recipes) {
			 if(recipe.getGlutenFree().equals(true) && recipe.getVegan().equals(true)) {
				 veganAndGlutenfreeRecipes.add(recipe);
			 }
		 }
		 return veganAndGlutenfreeRecipes;
	}
	
	
}
