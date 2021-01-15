package module.yearbook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
public class Achievement                   //POJO Class
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
//   @NotNull
//   @Size(min=3, message = "Name should have 2 characters")
	private String name;
	
//	@NotBlank(message = "Year is required")
	private long year;
	
//	@NotBlank(message = "Achievement Description is required")
	private String description;
	
//	@NotBlank(message = "Role is required")
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getYear() {
		return year;
	}
	public void setYear(long year) {
		this.year = year;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public Achievement()
	{
		
	}
	public Achievement(int id, String name, long year, String description, String role) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.description = description;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Achievement [id=" + id + ", name=" + name + ", year=" + year + ", description=" + description
				+ ", role=" + role + "]";
	}
	
	
	

}
