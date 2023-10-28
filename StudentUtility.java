package com.studentmanagement;
import java.util.*;

public class StudentUtility {
	static Scanner sc = new Scanner(System.in);
	//add student
	public static Student addStudent() {
		
		
		Student st = new Student();
		//setting students values from user
		System.out.print("Please enter Student Name :");
		st.setsName(sc.nextLine());
		System.out.print("Please enter Student Id :");
		st.setId(sc.nextInt());
		System.out.print("Please enter Student Age :");
		st.setAge(sc.nextInt());
		System.out.print("Please enter Student Email :");
		st.setEmail(sc.next());
		System.out.print("Please enter Student Address :");
		st.setAddr(sc.next());
		
		return st ;
	}
	
	//update student
	public static void updateStudent(List<Student> students) {
		
		System.out.println("Please enter the details you want to update:");
		System.out.print("Please enter Student Name :");
		String name = sc.next();
		System.out.print("Please enter Student Id :");
		int id = sc.nextInt();
		System.out.print("Please enter Student Age :");
		int age = sc.nextInt();
		System.out.print("Please enter Student Email :");
		String email =sc.next();
		System.out.print("Please enter Student Address :");
		String address = sc.next();
		
		int count=0;
		//actual update in students data
		for(Student s : students) {
			if(id != s.getId()) {
				System.out.println("Id you are updationg doesnt exist");
				break;
			}
			count++ ;
		}
		
		students.get(count).setsName(name);
		students.get(count).setAge(age);
		students.get(count).setEmail(email);
		students.get(count).setAddr(address);
		
	}
	
	
	//display student
	public static void displayAllStudents(List<Student> std) {
	
	      Iterator<Student> st = std.iterator();
	      
	      while(st.hasNext()) {
	    	  System.out.println(st.next().toString());
	      }
	}
	
	
	//delete student
	
	public static void deleteStudent(List<Student> students,int id) {
		Iterator<Student> stdItr = students.iterator();
		while(stdItr.hasNext()) {
			Student s = stdItr.next();
			if(s.getId()==id) {
				stdItr.remove();
			}
		}
		
	}
}
