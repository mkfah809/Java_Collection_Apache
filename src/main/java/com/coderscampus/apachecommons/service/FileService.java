package com.coderscampus.apachecommons.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.apachecommons.domain.Recipe;

@Service
public class FileService {

	private String cookingMinutes, dairyFree, glutenFree, instructions, preparationMinutes, pricePerServing,
			readyInMinutes, servings, spoonacularScore, title, vegan, vegetarian;

	public List<Recipe> readAllRecipes(String fileName) throws IOException {
		Reader reader = new FileReader(fileName);
		@SuppressWarnings({ "static-access", "deprecation" })
		Iterable<CSVRecord> records = CSVFormat.RFC4180.newFormat(',').withIgnoreSurroundingSpaces().withQuote('"')
				.withEscape('\\').withQuoteMode(QuoteMode.NONE).withFirstRecordAsHeader().parse(reader);
		Recipe recipe = new Recipe(cookingMinutes, dairyFree, glutenFree, instructions, preparationMinutes,
				pricePerServing, readyInMinutes, servings, spoonacularScore, title, vegan, vegetarian);

		List<Recipe> recipes = new ArrayList<Recipe>();
		for (CSVRecord record : records) {
			recipes.add(recipe);
		}
		return recipes;
	}

//	PUBLIC LIST<RECIPE> READGLUTENFREERECIPES(STRING FILENAME) THROWS IOEXCEPTION {
//		// GRAB ALL RECIPES HERE IN THIS METHOD
//		// THEN WE LOOP THROUGH ALL OF THE RECIPES AGAIN LOOKING UP FOR
//		// GLUTENFREE.EQUAL(TRUE)
//		// GLUTENFREERECIPES.ADD(RECIPE)
//		LIST<RECIPE> GLUTENFREERECIPES = NEW ARRAYLIST<RECIPE>();
//
//		FOR (RECIPE RECIPE : RECIPES) {
//			GLUTENFREERECIPES.ADD(RECIPE);
//			IF (RECIPE.GETGLUTENFREE().EQUALS(TRUE)) {
//			}
//		}
//		RETURN GLUTENFREERECIPES;
//
//	}

}
