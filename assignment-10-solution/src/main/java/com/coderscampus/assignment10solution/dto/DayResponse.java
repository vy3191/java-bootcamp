package com.coderscampus.assignment10solution.dto;

import java.util.List;

public class DayResponse {
	
	private List<Meal> meals;
	private Nutients nutrients;
	
	public Nutients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutients nutrients) {
		this.nutrients = nutrients;
	}

	public List<Meal> getMeals() {
		return meals;
	}

	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}

	@Override
	public String toString() {
		return "DayResponse [meals=" + meals + "]";
	}
}
