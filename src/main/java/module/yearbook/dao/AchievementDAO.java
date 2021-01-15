package module.yearbook.dao;

import module.yearbook.model.Achievement;

public interface AchievementDAO 
{
	public void addAchievement(Achievement achievement);
	public void deleteAchievementById(int id);
	public Achievement updateAchievement(int id, Achievement achievement);
	public Iterable<Achievement> getAllAchievement();

	public Iterable<Achievement> getAllAchievementByYear(long year);
	public Iterable<Achievement> getAllAchievementByName(String name);
	public Achievement getAchievementById(int id);


}
