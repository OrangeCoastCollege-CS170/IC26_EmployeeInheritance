package edu.orangecoastcollege.sbadajoz.ic26;
/*
Badajoz, Seve
CS A170
December 7, 2016

IC26
*/
public class Employee extends Person {
	protected double mAnnualSalary;
	protected int mYearHired;
	protected String mIDNumber;

	public Employee(String honorific, String name, double AnnualSalary,
			int yearHired, String id) {
		super(honorific, name);
		mAnnualSalary = AnnualSalary;
		mYearHired = yearHired;
		mIDNumber = id;
	}

	public Employee(String name, double annualSalary, int yearHired,
			String id) {
		this("", name, annualSalary, yearHired, id);
	}

	public Employee(Employee other) {
		this(other.mHonorific, other.mName, other.mAnnualSalary,
				other.mYearHired, other.mIDNumber);
	}

	public double getAnnualSalary() {
		return mAnnualSalary;
	}

	public int getYearHired() {
		return mYearHired;
	}

	public String getIDNumber() {
		return mIDNumber;
	}

	public void setAnnualSalary(double annualSalary) {
		this.mAnnualSalary = annualSalary;
	}

	public void setYearHired(int yearHired) {
		this.mYearHired = yearHired;
	}

	@Override
	public String toString() {
		return "Employee [" + super.toString() + ", mAnnualSalary="
				+ mAnnualSalary + ", mYearHired=" + mYearHired + ", mIDNumber="
				+ mIDNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(mAnnualSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((mIDNumber == null) ? 0 : mIDNumber.hashCode());
		result = prime * result + mYearHired;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(mAnnualSalary) != Double
				.doubleToLongBits(other.mAnnualSalary))
			return false;
		if (mIDNumber == null) {
			if (other.mIDNumber != null)
				return false;
		} else if (!mIDNumber.equals(other.mIDNumber))
			return false;
		if (mYearHired != other.mYearHired)
			return false;
		return true;
	}

}
