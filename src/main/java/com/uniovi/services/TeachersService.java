package com.uniovi.services;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.uniovi.entities.Teacher;
@Service
public class TeachersService {
	
	private List<Teacher> teachers=new LinkedList<Teacher>();

	@PostConstruct
	public void init() {
		teachers.add(new Teacher("123","Koyomi","Araragi","Matematicas"));
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}
	
}
