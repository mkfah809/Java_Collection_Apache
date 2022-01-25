package com.coderscampus.apachecommons.web;

import java.io.IOException;

import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.apachecommons.domain.Recipe;
import com.coderscampus.apachecommons.service.FileService;

@RestController
public class RecipeConroller {
	@Autowired
	private FileService fileService;

	private String glutenFree;
	private String vegan;
	private String Veggie;

	
	Recipe recipe() {
		return new Recipe(glutenFree, vegan, Veggie);
	}

	@GetMapping("/all-recipes")
	public Iterable<CSVRecord> displayFile() throws IOException {
		return fileService.readFile("data.txt");
	}
}
