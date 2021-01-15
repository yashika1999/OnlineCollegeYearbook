package module.yearbook.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import module.yearbook.model.Student;
import module.yearbook.repository.StudentRepository;
import module.yearbook.service.StudentService;
import module.yearbook.service.StudentServiceImpl;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/registration")
public class StudentController {

	@Autowired
	private StudentServiceImpl service;
	
	
	@GetMapping(value = "/student")
	public List<Student> findAll() {
		
		return service.getAllStudentInfo();
	}

	
	@PostMapping("/student")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<String> createStudent(@Valid @RequestBody Student newstudent) {
		Student student=service.createStudent(newstudent);
		int id=student.getId();
		return new ResponseEntity<String>("Student with ID:"+id+" is Created Successfully",HttpStatus.OK);
	}

	
	@GetMapping(value = "/student/{id}")
	public Student getStudentById(@PathVariable int id) {
		
		return service.findById(id);
	}
	
	@PutMapping(value= "/student/{id}")
	public Student updateStudent(@RequestBody Student newStudent,@PathVariable int id) {
		return service.updateStudentById(id);
	}
	

	
	@DeleteMapping(value="/student/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteById(id);
	}
	
}