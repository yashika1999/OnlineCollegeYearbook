package module.yearbook.service;

import java.util.List;

import module.yearbook.model.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import module.yearbook.exception.InputException;
import module.yearbook.model.Student;
import module.yearbook.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repository;
	
	@Override
	public List<Student> getAllStudentInfo() {
		// TODO Auto-generated method stub
		return (List<Student>)repository.findAll();
	}

	@Override
	public Student createStudent(Student student) {
		return repository.save(student);
	}
	
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	

	public Student save(Student student) {
		// TODO Auto-generated method stub
		if(student.getName()==null) {
			throw new InputException("Please enter Teacher name");
		}
		else if(student.getEmail()==null) {
			throw new InputException("Please Enter email Id");
		}
		else if(student.getAddress()==null) {
			throw new InputException("Please Enter Address");
		}
		else if(student.getContact()==null) {
			throw new InputException("Please enter contact number");
		}
		else if(student.getBranch()==null) {
			throw new InputException("Please enter branch");
		}
		
		
		
		try {
			return repository.save(student);
		}
		catch (DataIntegrityViolationException e) {
			// TODO: handle exception
			throw new InputException("This UserId is already registered....Please Login....");
		}
		
		
	}

	public Student findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);;
		
	}

	@Override
	public Student updateStudentById(int id) {
		// TODO Auto-generated method stub
		Student student=(Student)repository.findById(id).get();
		return repository.save(student);
		
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);;
	}

	
}

	
