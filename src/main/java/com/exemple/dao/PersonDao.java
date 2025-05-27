package com.exemple.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.exemple.models.Person;

public class PersonDao {
	
	public void Save(Person person)
	{
		Connection cnx=DatabaseConnection.getConnection();
		if(cnx==null)
			return;
		String Query="insert into person(fullname,email,birthdate,gender,maritalstatus) values(?,?,?,?,?)";
		try(cnx;PreparedStatement ps=cnx.prepareStatement(Query))
		{
			ps.setString(1,person.getFulName());
			ps.setString(2, person.getEmail());
			ps.setDate( 3,Date.valueOf(person.getBirthDate()));
			ps.setString(4, person.getGender());
			ps.setString(5, person.getMaritalStatus());
			ps.executeUpdate();
		}catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
	}
	public List<Person> getAllPersons()
	{
		List<Person> persons=new ArrayList();
		Connection cnx=DatabaseConnection.getConnection();
		if(cnx==null)
			return persons;
		String Query="select* from person";
		try(cnx;PreparedStatement ps=cnx.prepareStatement(Query))
		{
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
			Person person=new Person(rs.getString("fullname"),rs.getString("email"),rs.getDate("birthdate").toLocalDate(),rs.getString("gender"),rs.getString("maritalstatus"));
			persons.add(person);
			}
			}catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
		return persons;
	}
	
	
	   //test 
	public static void main(String args[])
	{
		Person person=new Person("mohamed","msalmi@gmail.com",LocalDate.of(2001, 2, 19),"male","single");
		Connection cnx=DatabaseConnection.getConnection();
		if(cnx!=null)
			System.out.println("connect succesfully");
		
		PersonDao personDao=new PersonDao();
		try {
		personDao.Save(person);
		}catch(Exception ex)
		{
			System.out.println("failed to save new person");
		}
		
	}
	

	
}
