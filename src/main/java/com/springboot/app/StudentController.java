package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** question 4 et 5 6
	import java.util.ArrayList;
	import java.util.List;
	
	
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	
	
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RestController;
	**/
	
	
	
	@RestController
	public class StudentController {
		
		// build rest API to handle query parameters
		//http://localhost:8080/student/query?firstName=Ramesh&lastName=Fadatare
		
		
		@GetMapping("/student/query")
		public Student studentQueryParam(
		@RequestParam(name = "firstName") String firstName,
		@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
		}
		}
		
		
		
		
		/**
		@GetMapping("/student/{firstName}/{lastName}/")
		public Student studentPathVariable(@PathVariable("firstName") String
		firstName,
		@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
		}
		
	}
	
	// http://localhost:8080/student 
	 * // http://localhost:8080/student/1
		// @PathVariable annotation
		
		
	 @GetMapping("/students") 
	
	public List<Student> getStudents(){
	List<Student> students = new ArrayList<>();
	students.add(new Student("Ramesh", "Fadatare"));
	students.add(new Student("Tony", "Cena"));
	students.add(new Student("Sanjay", "Jadhav"));
	students.add(new Student("Ram", "Jadhav"));
	students.add(new Student("Umesh", "Fadatare"));
	return students;
	question 4
	public Student getStudent() {
	return new Student("Ramesh", "Fadatare");
	**/
	



