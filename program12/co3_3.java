class Person {
	String name;
	String gender;
	String address;
	int age;
	
	Person(String name, String gender, String address, int age) {
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}
}

class Employee extends Person {
	int empId;
	String companyName;
	String qualification;
	double salery;
	
	Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification ,double salery) {
		super(name, gender, address, age);
		this.empId = empId;
		this.companyName = companyName;
		this.qualification = qualification;
		this.salery = salery;
	}
}

class Teacher extends Employee {
	String subject;
	String department;
	String teacherId;
	
	Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification ,double salery, String subject, String department, String teacherId) {
		super(name, gender, address, age, empId, companyName, qualification, salery);
        	this.subject = subject;
        	this.department = department;
        	this.teacherId = teacherId;
    }
	
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Address: " + address);
		System.out.println("Age: " + age);
		System.out.println("Emp ID: " + empId);
		System.out.println("Company Name: " + companyName);
		System.out.println("Qualification: " + qualification);
		System.out.println("Salery: " + salery);
		System.out.println("Subject: " + subject);
		System.out.println("Department: " + department);
		System.out.println("Teacher ID: " + teacherId);
	}
}

public class co3_3 {
	public static void main(String[] args) {
		
		Teacher[] teacher = new Teacher[2];
		teacher[0] = new Teacher("Amal", "male", "vadakara", 32, 1001, "Eduport", "MSc", 45000, "Maths", "Science", "T101");
		teacher[1] = new Teacher("Shahana", "Female", "calicut", 29, 1002, "Xylem", "PhD", 50000, "Pysics", "Science", "T103");
		
		teacher[0].display();
		teacher[1].display();
	}
}
