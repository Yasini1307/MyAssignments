package orgstudent;

import orgdepartment.Department;

public class Student extends Department{
	public void StudentName() {
		System.out.println("Student name is--Yasini");
	}
	public void StudentDept() {
		System.out.println("student department--CSE");
	}
	public void Studentid() {
		System.out.println("studentid is--2037660");
	}
	public static void main(String[] args) {
		Student obj1=new Student();
		obj1.collegeCode();
		obj1.collegeName();
		obj1.collegeRank();
		obj1.departmentname();
		obj1.StudentDept();
		obj1.Studentid();
		obj1.StudentName();
		
	}

}
