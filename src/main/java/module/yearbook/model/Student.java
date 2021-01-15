package module.yearbook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
public class Student {

	@Id
	@GeneratedValue
	private int id;
	
	//@NotBlank(message = "Please Enter Name")
	//@Pattern(regexp="^[A-Z][a-z]{2,20}",message = "length must be in between 2 to 20")
	@NotNull
	@Size(min = 2, message= "Name should have atleast 2 characters")
	private String name;
	
	@NotBlank
	@Email
	private String email;
	
	@NotNull
	private String address;
	
	@NotNull
	@Size(max = 10)
	private String contact;
	
	@NotBlank
	private String branch;
	
	@NotNull
	private int year;
	
	private String password;
	
	
	public Student() {
	
	}

	public Student(int id, String name, String email, String address, String contact, String branch, int year, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.contact = contact;
		this.branch = branch;
		this.year = year;
		this.password = password;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", contact="
				+ contact + ", branch=" + branch + ", year=" + year + ", password=" + password + "]";
	}
	
	


	/*@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", contact="
				+ contact + ", branch=" + branch + ", year=" + year + "]";
	}*/
	
}