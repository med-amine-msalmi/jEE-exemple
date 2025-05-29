package com.exemple.models;
import java.time.LocalDate;
public class Person {
	private long Id;
	private String fullName;
	private String email;
	private LocalDate birthdate;
	private String Gender;
	private String MaritalStatus;
	
	public Person(Long Id,String fullName,String email,LocalDate birthdate,String Gender,String MaritalStatus)
	{
		this.Id=Id;
		this.fullName=fullName;
		this.email=email;
		this.birthdate=birthdate;
		this.Gender=Gender;
		this.MaritalStatus=MaritalStatus;
	}
	public Person(String fullName,String email,LocalDate birthdate,String Gender,String MaritalStatus)
	{

		this.fullName=fullName;
		this.email=email;
		this.birthdate=birthdate;
		this.Gender=Gender;
		this.MaritalStatus=MaritalStatus;
	}
	public int getAge()
	{
		return LocalDate.now().getYear()-birthdate.getYear();
	}
	
	public String getFulName()
	{
		return fullName;
	}
	public String getEmail()
	{
		return email;
	}
	public LocalDate getBirthDate()
	{
		return birthdate;
	}
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", fullName=" + fullName + ", email=" + email + ", birthdate=" + birthdate
				+ ", Gender=" + Gender + ", MaritalStatus=" + MaritalStatus + "]";
	}
	public String getMaritalStatus()
	{
		return MaritalStatus;
	}
	public String getGender()
	{
		return Gender;
	}
	
	public long getId()
	{
		return Id;
	}
	
}
