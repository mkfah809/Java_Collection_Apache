package com.coderscampus.apachecommons.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FileService {
	
	String fileName;
	@Autowired
	public FileService() {}

	public List<String> readFile() throws IOException {
		
		return Files.readAllLines(Paths.get("data.txt"));
	}
	// System.out.println("readFile method " + records);

//	private void burnHeaderLine(Iterable<CSVRecord> records) {
//		for(int i=0; i <12; i++) {
//			for (CSVRecord recordBurnOut : records) {
//				System.out.print(recordBurnOut.get(i));
//				System.out.print(recordBurnOut.get(1));
//				System.out.print(recordBurnOut.get(2));
//				System.out.print(recordBurnOut.get(3));
//				System.out.print(recordBurnOut.get(4));
//				System.out.print(recordBurnOut.get(5));
//				System.out.print(recordBurnOut.get(6));
//				System.out.print(recordBurnOut.get(7));
//				System.out.print(recordBurnOut.get(8));
//				System.out.print(recordBurnOut.get(9));
//				System.out.print(recordBurnOut.get(10));
//				System.out.println(recordBurnOut.get(11));
//				break;
//			}
//			
//		}
//	}
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
