package com.uniovi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique=true)
	private String dni;
	private String name;
	private String surname;
	private String category;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	public Teacher(Long id, String dni, String name, String surname, String category,Department department) {
		super();
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.category = category;
		this.department=department;
	}
	
	public Teacher(String dni, String name, String surname, String category,Department department) {
		super();
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.category = category;
		this.department=department;
	}

	public Teacher(){
	}
	@Override
	public String toString() {
		return "Teacher [id=" + dni + ", nombre=" + name + ", apellidos=" + surname + "categoria="+category+"]";
	}
	
	public Long getId() {
		return id;
	}
	public String getDni() {
		return dni;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
