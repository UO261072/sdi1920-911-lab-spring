package com.uniovi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uniovi.entities.Teacher;
import com.uniovi.services.TeachersService;

@RestController
@Controller
public class TeachersController {

	@Autowired //Inyectar el servicio
	private TeachersService teachersService;
	
	@RequestMapping("/teacher/list")
	public String getList() {
		return this.teachersService.getTeachers().toString();
	}
	
	@RequestMapping(value="/teacher/add",method=RequestMethod.POST)
	public String setTeacher(@ModelAttribute Teacher teacher) {
		this.teachersService.addTeacher(teacher);
		return "Ok";
	}
	@RequestMapping(value="/teacher/{dni}",method=RequestMethod.POST)
	public String deleteTeacher(@ModelAttribute Teacher teacher) {
		this.teachersService.addTeacher(teacher);
		return "Ok";
	}
}
