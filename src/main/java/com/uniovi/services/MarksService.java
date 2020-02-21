package com.uniovi.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniovi.entities.Mark;
import com.uniovi.repositories.MarksRepository;



@Service
public class MarksService{
	
	@Autowired
	private MarksRepository marksRepository;
	@Autowired
	private HttpSession httpSession;
	

	public List<Mark> getMarks(){
		List<Mark> marksList=new ArrayList<Mark>();
		this.marksRepository.findAll().forEach(marksList::add);
		return marksList;
	}
	public Mark getMark(Long id){
		Set<Mark> consultedList = (Set<Mark>) httpSession.getAttribute("consultedList");
		if ( consultedList == null ) {
		consultedList = new HashSet<Mark>();
		}
		Mark obtainedmark = marksRepository.findById(id).get();
		consultedList.add(obtainedmark);
		httpSession.setAttribute("consultedList", consultedList);
		return obtainedmark;
		}
	public void addMark(Mark mark){
		// Si en Id es null le asignamos el ultimo + 1 de la lista
		this.marksRepository.save(mark);
	}
	public void deleteMark(Long id){
		this.marksRepository.deleteById(id);
	}
}
