package com.example.getresourcesapi;


import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class DataDTO implements Serializable {

	@SerializedName("id")
	private int id;

	@SerializedName("name")
	private String name;

	@SerializedName("year")
	private int year;

	@SerializedName("color")
	private String color;

	@SerializedName("pantone_value")
	private String pantoneValue;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setYear(int year){
		this.year = year;
	}

	public int getYear(){
		return year;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setPantoneValue(String pantoneValue){
		this.pantoneValue = pantoneValue;
	}

	public String getPantoneValue(){
		return pantoneValue;
	}

	@Override
 	public String toString(){
		return 
			"DataDTO{" + 
			"id = '" + id + '\'' + 
			",name = '" + name + '\'' + 
			",year = '" + year + '\'' + 
			",color = '" + color + '\'' + 
			",pantone_value = '" + pantoneValue + '\'' + 
			"}";
		}
}