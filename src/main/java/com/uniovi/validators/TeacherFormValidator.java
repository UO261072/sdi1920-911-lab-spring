package com.uniovi.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.uniovi.entities.Mark;
import com.uniovi.services.MarksService;

public class TeacherFormValidator implements Validator{

	@Autowired
	private MarksService teacherService;

	@Override
	public boolean supports(Class<?> clazz) {
		return Mark.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Mark mark=(Mark) target;
		if(mark.getScore()<0||mark.getScore()>10) {
			errors.rejectValue("score", "Error.marks.score.outOfRange");
		}
		if(mark.getDescription().length()<20) {
			errors.rejectValue("description", "Error.marks.description.lenght");
		}
		
	}
}
