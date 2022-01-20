package com.coderscampus.apachecommons.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;


@Service
public class FileService {


	public Iterable<CSVRecord> readFile(String fileName) throws IOException {
		Reader in = new FileReader(fileName);
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
	
		burnHeaderLine(records);
		
		for (CSVRecord record : records) {
			Integer.parseInt(record.get(0));
			Boolean.parseBoolean(record.get(1));
			Boolean.parseBoolean(record.get(2));
			Boolean.parseBoolean(record.get(10));
			Boolean.parseBoolean(record.get(11));
			System.out.println(record.toString());
		}
		return records;
	}

	private void burnHeaderLine(Iterable<CSVRecord> records) {
		for (CSVRecord recordBurnOut : records) {
			recordBurnOut.get(0); recordBurnOut.get(1); recordBurnOut.get(2); 
			recordBurnOut.get(3); recordBurnOut.get(4); recordBurnOut.get(5); 
			recordBurnOut.get(6); recordBurnOut.get(7); recordBurnOut.get(8);
			recordBurnOut.get(9); recordBurnOut.get(10);recordBurnOut.get(11);
			break;
		}
	}
}

//recipe.setCookingMinutes(Integer.parseInt(record.get(0)));
//recipe.setDairyFree(Boolean.parseBoolean(record.get(1)));
//recipe.setGlutenFree(Boolean.parseBoolean(record.get(2)));
//recipe.setInstructions(record.get(3));
//recipe.setPreparationMinutes(Double.parseDouble(record.get(4)));
//recipe.setPricePerServing(Double.parseDouble(record.get(5)));
//recipe.setReadyInMinutes(Integer.parseInt(record.get(6)));
//recipe.setServings(Integer.parseInt(record.get(7)));
//recipe.setSpoonacularScore(Double.parseDouble(record.get(8)));
//recipe.setTitle(record.get(9));
//recipe.setVegan(Boolean.parseBoolean(record.get(10)));
//recipe.setVegetarian(Boolean.parseBoolean(record.get(11)));
