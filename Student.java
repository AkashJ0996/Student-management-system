package com.studentmanagement;

public class Student {
   
	private int id;
	private String sName;
	private int age ;
	private String email ;
	private String addr;
	
	
	
	public Student() {
		super();
		
	}

	public Student(int id, String sName, int age, String email, String addr) {
		super();
		this.id = id;
		this.sName = sName;
		this.age = age;
		this.email = email;
		this.addr = addr;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", sName=" + sName + ", age=" + age + ", email=" + email + ", addr=" + addr + "]";
	}
	
	
	
}
