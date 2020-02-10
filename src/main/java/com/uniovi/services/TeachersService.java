package com.uniovi.services;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniovi.entities.Teacher;
import com.uniovi.repositories.TeachersRepository;
@Service
public class TeachersService {
	
	@Autowired
	private TeachersRepository teacherRepository;

	public List<Teacher> getTeachers() {
		List<Teacher> teachers=new ArrayList<Teacher>();
		this.teacherRepository.findAll().forEach(teachers::add);
		return teachers;
	}
	public Teacher getTeacher(String dni) {
		return teacherRepository.findById(dni).get(); 
	}
	public void addTeacher(Teacher teacher) {
		this.teacherRepository.save(teacher);
	}
	public void deleteTeacher(String dni) {
		this.teacherRepository.deleteById(dni);
	}
}
