package module.yearbook.repository;

import org.springframework.data.repository.CrudRepository;

import module.yearbook.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	public Student findByBranch(String branch);

}

