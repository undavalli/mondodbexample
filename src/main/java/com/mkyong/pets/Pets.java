package com.mkyong.pets;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pets")
public class Pets {
	
	@Id
	public String id;
	
	public String name;
	public String species;
	public String breed;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	@Override
	public String toString() {
		return "Pets [ObjectId_id=" + id + ", name=" + name + ", species=" + species + ", breed=" + breed
				+ "]";
	}
	
	
	
	


}
