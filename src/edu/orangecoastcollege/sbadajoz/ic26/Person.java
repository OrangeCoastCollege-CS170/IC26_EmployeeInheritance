package edu.orangecoastcollege.sbadajoz.ic26;
/*
Badajoz, Seve
CS A170
December 7, 2016

IC26
*/
public class Person {

	protected String mHonorific;
	protected String mName;

	public Person() {
		this.mHonorific = "";
		this.mName = "";
	}

	public Person(String honorific, String name) {
		this.mHonorific = honorific;
		this.mName = name;
	}

	public String getHonorific() {
		return this.mHonorific;
	}

	public String getName() {
		return this.mName;
	}

	// Gets the full name with honorific prefix in front (e.g. Ms. Smart
	// Student)
	public String getFullName() {
		if (this.mHonorific.equals(""))
			return this.mName;
		else
			return this.mHonorific + " " + this.mName;
	}

	public void setHonorific(String newHonorific) {
		this.mHonorific = newHonorific;
	}

	public void setName(String newName) {
		this.mName = newName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Person))
			return false;

		Person otherPerson = (Person) obj;
		return this.mHonorific.equals(otherPerson.mHonorific)
				&& this.mName.equals(otherPerson.mName);
	}

	@Override
	public String toString() {
		return "Person [" + this.getFullName() + "]";
	}

}
