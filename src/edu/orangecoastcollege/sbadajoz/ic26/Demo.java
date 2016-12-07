package edu.orangecoastcollege.sbadajoz.ic26;

import java.util.ArrayList;

/*
Badajoz, Seve
CS A170
December 7, 2016

IC26
*/
public class Demo {
	public static void main(String[] args) {
		Person mj = new Person("Mr.", "Micheal Jordan");
		Employee diwght = new Employee("Mr.", "Dwight Shroot", 25000.0, 2011, "1");
		Doctor strangeLove = new Doctor("Strange Love", 125000.0, 2, "2", "Backalley Surgery", 5.0);
		
		ArrayList<Person>people = new ArrayList<Person>();
		people.add(mj);
		people.add(diwght);
		people.add(strangeLove);
		
		for (Person person : people) {
			System.out.println(person);
		}
		
	}
}
