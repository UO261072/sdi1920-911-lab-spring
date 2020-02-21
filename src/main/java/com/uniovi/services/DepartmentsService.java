package com.uniovi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniovi.entities.Department;
import com.uniovi.repositories.DepartmentsRepository;

@Service
public class DepartmentsService {

	@Autowired
	private DepartmentsRepository departmentsRepository;
	
	public List<Department> getDepartments(){
		List<Department> departmentsList=new ArrayList<Department>();
		this.departmentsRepository.findAll().forEach(departmentsList::add);
		return departmentsList;
	}
	public Department getDepartment(Long id){
		return this.departmentsRepository.findById(id).get();
	}
	public void addDepartment(Department department){
		this.departmentsRepository.save(department);
	}
	public void deleteDepartment(Long id){
		this.departmentsRepository.deleteById(id);
	}
}
