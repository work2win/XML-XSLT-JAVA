package com.work2win.ikm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Namer{
	final private String firstName, lastName;
	public Namer(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
	

	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}

}

public class Sorter {
	
	
	//List<Namer> names = new ArrayList(Arrays.asList(new Namer("Harry", "Smith"), new Namer("Joe", "Smith").new Namer("Jane", "Doe")))
	
    private static class Student {
        private String name;
        private int age;
        public Student(String name, int age) {
           this.name = name;
           this.age = age;
        }
     }
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> studentList = new ArrayList<Student>();
	      studentList.add(new Student("Raja", 30));
	      studentList.add(new Student("Adithya", 25));
	      studentList.add(new Student("Jai", 20));
	      studentList.removeIf(student -> (student.age <= 20));
	      System.out.println(studentList);
	  

	}

}
