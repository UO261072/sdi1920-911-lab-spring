package com.uniovi.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Teacher {

	@Id
	@GeneratedValue
	private String dni;
	private String name;
	private String surname;
	private String category;
	
	public String getId() {
		return dni;
	}
	public Teacher(String dni, String name, String surname, String category) {
		super();
		this.dni = dni;
		this.name=name;
		this.surname=surname;
		this.category=category;
	}
	public Teacher(){
	}
	@Override
	public String toString() {
		return "Teacher [id=" + dni + ", nombre=" + name + ", apellidos=" + surname + "categoria="+category+"]";
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}