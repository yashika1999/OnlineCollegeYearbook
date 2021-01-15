package module.yearbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import module.yearbook.dao.AchievementDAO;
import module.yearbook.model.Achievement;

@Service
public class AchievementServiceImpl implements AchievementService {

	@Autowired
	private AchievementDAO dao;
	public void addAchievement(Achievement achievement)
	{
		dao.addAchievement(achievement);
	}
	public void deleteAchievementById(int id)
	{
		dao.deleteAchievementById(id);
	}
	public Achievement updateAchievement(int id, Achievement achievement)
	{
		return dao.updateAchievement(id, achievement);
	}
	public Iterable<Achievement> getAllAchievement()
	{
		return dao.getAllAchievement();
	}
	public Achievement getAchievementById(int id) 
	{
		return dao.getAchievementById(id);
	}
	public Iterable<Achievement> getAllAchievementByYear(long year)
	{
		return dao.getAllAchievementByYear(year);
	}
	public Iterable<Achievement> getAllAchievementByName(String name)
	{
		return dao.getAllAchievementByName(name);
	}
	


}

