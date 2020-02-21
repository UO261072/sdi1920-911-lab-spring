package com.uniovi.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue
	private Long id;
	
	private String description;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private Set<Teacher> teachers;

	public Department(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public Department(String description) {
		super();
		this.description = description;

	}
	public Department() {}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", description=" + description + ", teachers=" + teachers + "]";
	}
	
	
}
