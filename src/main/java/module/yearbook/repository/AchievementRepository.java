package module.yearbook.repository;

import org.springframework.data.repository.CrudRepository;

import module.yearbook.model.Achievement;

public interface AchievementRepository extends CrudRepository<Achievement, Integer> 
{
	Achievement findById(int id);
	Iterable<Achievement> findByName(String name);
	Iterable<Achievement> findByYear(long year);
}
