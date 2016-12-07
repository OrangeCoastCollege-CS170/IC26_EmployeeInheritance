# IC26_EmployeeInheritance
Define a class named Employee, which will store data about each employee at a company.  Inherit from the Person class (Person.java file attached to this assignment).  An Employee inherits its name and honorific (title prefixing a person's name, such as Mr., Ms., Mrs., Dr., Sir, Lady, or Lord) from the Person class.  In addition, an employee has instance variables to store annual salary (double), year hired (int), and identification number (String).  

The Employee class should have 3 constructors:

1. Parameterized constructor (honorific, name, annualSalary, yearHired, id)
2. Parameterized constructor (name, annualSalary, yearHired, id )
3. Copy constructor

Give your class a reasonable complement accessor methods and mutator methods (do not create a setId( ) method, since the id must be unique), as well as an equals( ) and toString( ) method.  Write a demo (driver) program to fully test your class definitions.


Now, define another class named Doctor which will be derived (inherit from) the Employee class.  The Doctor class should contain two additional instance variables: specialty (a String, such as Pediatrician, Obstetrician, General Practitioner, etc) and office fee (double).  

The Doctor should have 2 constructors:

1. Parameterized constructor (name, annualSalary, yearHired, id, specialty, officeFee)
2. Copy constructor

Give your class a reasonable set of accessors and mutators, as well as an equals( ) and toString( ) method.

Below is an inheritance diagram in UML (Unified Modeling Language) of the three classes:

![person inheritance](https://github.com/S33V/IC26_EmployeeInheritance/blob/master/images/PersonInheritance.png "person inheritance")
