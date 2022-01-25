package com.coderscampus.apachecommons.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.springframework.stereotype.Service;
import com.coderscampus.apachecommons.domain.Recipe;

@Service
public class FileService {

	Recipe recipe;

	public Iterable<CSVRecord> readFile(String fileName) throws IOException {

		System.out.println("Entered readFile method");
		Reader reader = new FileReader(fileName);
		Iterable<CSVRecord> records = CSVFormat.RFC4180.newFormat(',').withIgnoreSurroundingSpaces().withQuote('"')
				.withEscape('\\').withQuoteMode(QuoteMode.NONE).withFirstRecordAsHeader().parse(reader);

		for (CSVRecord record : records) {
			Integer.parseInt(record.get(0));
			Boolean.parseBoolean(record.get(1));
			Boolean.parseBoolean(record.get(2));
			record.get(3);
			Double.parseDouble(record.get(4));
			Double.parseDouble(record.get(5));
			Integer.parseInt(record.get(6));
			Integer.parseInt(record.get(7));
			Double.parseDouble(record.get(8));
			record.get(9);
			Boolean.parseBoolean(record.get(10));
			Boolean.parseBoolean(record.get(11));
			System.out.println(record);
		}
//			Integer.parseInt(record.get(0));
//			Boolean.parseBoolean(record.get(1));
//			Boolean.parseBoolean(record.get(2));
//			record.get(3);
//			Double.parseDouble(record.get(4));
//			Double.parseDouble(record.get(5));
//			Integer.parseInt(record.get(6));
//			Integer.parseInt(record.get(7));
//			Double.parseDouble(record.get(8));
//			record.get(9);
//			Boolean.parseBoolean(record.get(10));
//			Boolean.parseBoolean(record.get(11));

		// recipe.setCookingMinutes(Integer.parseInt(record.get(0)));
//			recipe.setCookingMinutes(parseInt);
//			recipe.setDairyFree(Boolean.parseBoolean(record.get(1)));
//			recipe.setGlutenFree(Boolean.parseBoolean(record.get(2)));
//			recipe.setInstructions(record.get(3));
//			recipe.setPreparationMinutes(Double.parseDouble(record.get(4)));
//			recipe.setPricePerServing(Double.parseDouble(record.get(5)));
//			recipe.setReadyInMinutes(Integer.parseInt(record.get(6)));
//			recipe.setServings(Integer.parseInt(record.get(7)));
//			recipe.setSpoonacularScore(Double.parseDouble(record.get(8)));
//			recipe.setTitle(record.get(9));
//			recipe.setVegan(Boolean.parseBoolean(record.get(10)));
//			recipe.setVegetarian(Boolean.parseBoolean(record.get(11)));

	
		return records;

	}

}
