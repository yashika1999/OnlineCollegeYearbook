package module.yearbook.dao;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import module.yearbook.model.Achievement;
import module.yearbook.repository.AchievementRepository;

@Repository
public class AchievementDAOImpl implements AchievementDAO 
{
	
	@Autowired
	private AchievementRepository repository;
	
	Scanner sc = new Scanner(System.in);
	
	public void addAchievement(Achievement achievement)
	{
		repository.save(achievement);
	}
	public void deleteAchievementById(int id)
	{
		repository.deleteById(id);
	}
	public Achievement updateAchievement(int id, Achievement achievement)
	{
		repository.save(achievement);
		return achievement;
	}

	public Iterable<Achievement> getAllAchievement()
	{
		Iterable<Achievement> iterable=repository.findAll();
		return iterable;
	}
	public Achievement getAchievementById(int id)
	{
		Achievement iterable=repository.findById(id);
		return iterable;
	}
	public Iterable<Achievement> getAllAchievementByYear(long year)
	{
		Iterable<Achievement> iterable2 = repository.findByYear(year);
		return iterable2;
	}
	
	public Iterable<Achievement> getAllAchievementByName(String name)
	{
		Iterable<Achievement> iterable3  = repository.findByName(name);
		return iterable3;
	}
		
	
}
