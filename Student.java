package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student {
	
	String name;
	String gender;
	String surName;
	String birthDate;
	String photoPath;
	String mark;
	String comment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Student(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	public void saveStudent(){
	Connection conn = DBManager.Connector();
	if (conn==null) System.exit(1);
	else {
	PreparedStatement pst;
	String insertString = "INSERT INTO Student (Name, Gender) VALUES (?, ?)";
	try {
	pst = conn.prepareStatement(insertString);
	String name = this.name;
	String gender = this.gender;
	pst.setString(1, name);
	pst.setString(2, gender);
	pst.executeUpdate();
		 
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
		}

}
