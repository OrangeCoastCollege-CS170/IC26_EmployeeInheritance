package edu.orangecoastcollege.sbadajoz.ic26;
/*
Badajoz, Seve
CS A170
December 7, 2016

IC26
*/
public class Person {

	private String honorific;
	private String name;
	
	public Person()
	{
		this.honorific ="";
		this.name = "";
	}
	
	public Person(String honorific, String name)
	{
		this.honorific = honorific;
		this.name = name;
	}

	public String getHonorific()
	{
		return this.honorific;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	// Gets the full name with honorific prefix in front (e.g. Ms. Smart Student)
	public String getFullName()
	{
		if (this.honorific.equals(""))
			return this.name;
		else
			return this.honorific + " " + this.name;
	}
	
	public void setHonorific(String newHonorific)
	{
		this.honorific = newHonorific;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Person))
			return false;
		
		Person otherPerson = (Person) obj;
		return this.honorific.equals(otherPerson.honorific) && this.name.equals(otherPerson.name);
	}
	
	@Override
	public String toString() {
		return "Person [" + this.getFullName() + "]";
	}



	
	
}
