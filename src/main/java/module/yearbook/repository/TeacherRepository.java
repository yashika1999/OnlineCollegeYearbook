package module.yearbook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import module.yearbook.model.Teacher;


public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

	public Teacher findByName(String name);

}
