package com.coderscampus.apachecommons.domain;

public class Recipe {
	private Integer cookingMinutes;
	private Boolean dairyFree;
	private Boolean glutenFree;
	private String instructions;
	private Double preparationMinutes;
	private Double pricePerServing;
	private Integer readyInMinutes;
	private Integer servings;
	private Double spoonacularScore;
	private String title;
	private Boolean vegan;
	private Boolean vegetarian;

	public Recipe(String cookingMinutes, String dairyFree, String glutenFree, String instructions,
			String preparationMinutes, String privePerServing, String readyInMinutes, String servings,
			String spoonacularScore, String title, String vegan, String vegetarian) {
		
		this.cookingMinutes = Integer.parseInt(cookingMinutes);
		this.dairyFree = Boolean.parseBoolean(dairyFree);
		this.glutenFree = Boolean.parseBoolean(spoonacularScore);
		this.instructions = instructions;
		this.preparationMinutes = Double.parseDouble(preparationMinutes);
		this.pricePerServing = Double.parseDouble(spoonacularScore);
		this.readyInMinutes = Integer.parseInt(readyInMinutes);
		this.servings = Integer.parseInt(servings);
		this.spoonacularScore = Double.parseDouble(spoonacularScore);
		this.title = title;
		this.vegan = Boolean.parseBoolean(vegan);
		this.vegetarian = Boolean.parseBoolean(vegetarian);
	}

	public Integer getCookingMinutes() {
		return cookingMinutes;
	}

	public void setCookingMinutes(Integer cookingMinutes) {
		this.cookingMinutes = cookingMinutes;
	}

	public Boolean getDairyFree() {
		return dairyFree;
	}

	public void setDairyFree(Boolean dairyFree) {
		this.dairyFree = dairyFree;
	}

	public Boolean getGlutenFree() {
		return glutenFree;
	}

	public void setGlutenFree(Boolean glutenFree) {
		this.glutenFree = glutenFree;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Double getPreparationMinutes() {
		return preparationMinutes;
	}

	public void setPreparationMinutes(Double preparationMinutes) {
		this.preparationMinutes = preparationMinutes;
	}

	public Double getPricePerServing() {
		return pricePerServing;
	}

	public void setPricePerServing(Double pricePerServing) {
		this.pricePerServing = pricePerServing;
	}

	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public Double getSpoonacularScore() {
		return spoonacularScore;
	}

	public void setSpoonacularScore(Double spoonacularScore) {
		this.spoonacularScore = spoonacularScore;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getVegan() {
		return vegan;
	}

	public void setVegan(Boolean vegan) {
		this.vegan = vegan;
	}

	public Boolean getVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(Boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

}
