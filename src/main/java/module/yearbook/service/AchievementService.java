package module.yearbook.service;

import module.yearbook.model.Achievement;

public interface AchievementService 
{
	public void addAchievement(Achievement achievement);
	public void deleteAchievementById(int id);
	public Achievement updateAchievement(int id, Achievement achievement);
	public Iterable<Achievement> getAllAchievement();
	public Achievement getAchievementById(int id);
	public Iterable<Achievement> getAllAchievementByYear(long year);
	public Iterable<Achievement> getAllAchievementByName(String name);

}
