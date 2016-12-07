package edu.orangecoastcollege.sbadajoz.ic26;
/*
Badajoz, Seve
CS A170
December 7, 2016

IC26
*/
public class Doctor extends Employee {
	public Doctor(String honorific, String name, double annualSalary,
			int yearHired, String id) {
		super(honorific, name, yearHired, id);
		super.setAnnualSalary(annualSalary);
	}

	public Doctor(Doctor other) {
		super(other.getHonorific(), other.getName(), other.getYearHired(),
				other.getIDNumber());
		super.setAnnualSalary(other.getAnnualSalary());
	}

}
