package module.yearbook.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import module.yearbook.model.Achievement;
import module.yearbook.service.AchievementServiceImpl;

@CrossOrigin(origins ="http://localhost:3000")
@Component
@RestController
@RequestMapping(value="/teacher")
public class AchievementController 
{		
	@Autowired
	private AchievementServiceImpl service;
	
	@PostMapping("/addAchievement")
	@ResponseStatus(HttpStatus.CREATED)
	public void addAchievement(@RequestBody Achievement achievement) 
	{
		service.addAchievement(achievement);
	}
		
	@DeleteMapping(value = "/deleteAchievement/{id}")
	public void deleteAchievementById(@PathVariable int id)
	{
		service.deleteAchievementById(id);
	}
	
	@PutMapping(value = "/updateAchievement/{id}")
	@ResponseBody
	public Achievement updateAchievement(@RequestBody Achievement achievement, @PathVariable int id)
	{
		return service.updateAchievement(id,achievement);
	}
	
	@GetMapping(value = "/getAllAchievement")
	public Iterable<Achievement> getAllAchievement()
	{
		return service.getAllAchievement();
	}
	
	@GetMapping(value = "/getAchievementById/{id}")
	public Achievement getAchievementById(@PathVariable int id)
	{
		return service.getAchievementById(id);
	}
	
	@GetMapping(value = "/getAllAchievementByYear/{year}")
	public Iterable<Achievement> getAllAchievementByYear(@PathVariable long year)
	{
		return service.getAllAchievementByYear(year);
	}
		
	@GetMapping("/getAllAchievementByName/{name}")
	public Iterable<Achievement> getAllAchievementByName(@PathVariable String name)
	{
				return service.getAllAchievementByName(name);
	}
	
}

