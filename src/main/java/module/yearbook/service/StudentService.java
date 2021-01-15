package module.yearbook.service;

import java.util.List;

import module.yearbook.model.Student;

public interface StudentService {

	public List<Student> getAllStudentInfo();

	public Student createStudent(Student student);

	public Student save(Student student);

	public Student getStudentById(int id);
	
	public void deleteStudent(int id);
	
	public Student updateStudentById(int id);
	
}
