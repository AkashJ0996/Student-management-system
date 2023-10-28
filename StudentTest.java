package com.studentmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Student> stdList=new ArrayList<Student>();
		
		int run = 0;
		while(true) {
		if(run != 0) {
			System.out.print("\n\n\n Do you want to continue Yes or No?:");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("yes")) {
				
			}else {
				System.exit(0);
			}
			
		}
		run++ ;
		System.out.println("\t\t\t\t\tStudent Project Management");
		System.out.println("=====================================================================================================================");
		
		System.out.println("1.Add Student\n2.Update Student\n3.Display Student Data\n4.Delete Studnet data\n5.Exit");
		System.out.print("Enter your choice please:");
		int choice = sc.nextInt();
		System.out.println("=====================================================================================================================");
		
		
		
		switch(choice) {
		case 1 : System.out.println("You chose "+choice);
		         Student s = StudentUtility.addStudent();
		         stdList.add(s);
		         System.out.println("Data added Successfully...");
		         break;
		         
		case 2 : System.out.println("You chose "+choice);
        		 StudentUtility.updateStudent(stdList);
        		 System.out.println("Data updated Successfully...");
        		 break;
		case 3 : System.out.println("You chose "+choice);
        		 StudentUtility.displayAllStudents(stdList);
        		 break;
        case 4 : System.out.println("You chose "+choice);
        		 System.out.print("Please enter Student Id :");
        		 int id = sc.nextInt();
				 StudentUtility.deleteStudent(stdList,id);
				 System.out.println("Data Deleted Successfully...");
				 break;		
        case 5 : System.out.println("You chose "+choice+" Exit successfull ...");
                 break;	
        default:
        	     System.err.println("Invalid Choice");
		}
		
		
		}
	}

}
