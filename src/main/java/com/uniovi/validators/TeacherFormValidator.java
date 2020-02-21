package com.uniovi.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.uniovi.entities.Mark;
import com.uniovi.entities.Teacher;
import com.uniovi.services.MarksService;

@Component
public class TeacherFormValidator implements Validator{

	@Autowired
	private MarksService teacherService;

	@Override
	public boolean supports(Class<?> clazz) {
		return Mark.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Teacher teacher=(Teacher)target;
		if(teacher.getDni().length()!=9&&Character.isLetter(teacher.getDni().charAt(teacher.getDni().length()-1))){
			errors.rejectValue("dni", "Error.teacher.dni.lenght");
		}
		
	}
}
