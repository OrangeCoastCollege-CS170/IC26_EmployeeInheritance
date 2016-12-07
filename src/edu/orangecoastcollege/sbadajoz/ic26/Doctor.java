package edu.orangecoastcollege.sbadajoz.ic26;
/*
Badajoz, Seve
CS A170
December 7, 2016

IC26
*/
public class Doctor extends Employee {
	String mSpecialty;
	double mOfficeFee;

	public Doctor(String name, double annualSalary, int yearHired, String id,
			String specialty, double officeFee) {
		super("Dr.", name, annualSalary, yearHired, id);
		mSpecialty = specialty;
		mOfficeFee = officeFee;
	}

	public Doctor(Doctor other) {
		super(other.mHonorific, other.mName, other.mAnnualSalary,
				other.mYearHired, other.mIDNumber);
		mSpecialty = other.mSpecialty;
		mOfficeFee = other.mOfficeFee;
	}

	public String getSpecialty() {
		return mSpecialty;
	}

	public void setSpecialty(String specialty) {
		this.mSpecialty = specialty;
	}

	public double getOfficeFee() {
		return mOfficeFee;
	}

	public void setOfficeFee(double officeFee) {
		this.mOfficeFee = officeFee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(mOfficeFee);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((mSpecialty == null) ? 0 : mSpecialty.hashCode());
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
		Doctor other = (Doctor) obj;
		if (Double.doubleToLongBits(mOfficeFee) != Double
				.doubleToLongBits(other.mOfficeFee))
			return false;
		if (mSpecialty == null) {
			if (other.mSpecialty != null)
				return false;
		} else if (!mSpecialty.equals(other.mSpecialty))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [" + super.toString() + ", specialty=" + mSpecialty
				+ ", officeFee=" + mOfficeFee + "]";
	}

}
