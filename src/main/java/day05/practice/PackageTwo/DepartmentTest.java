package day05.practice.PackageTwo;

public class DepartmentTest {
	  public static void main(String[] args) {
	        Department department = new Department("Bio Maths", 983);
	        Student student = new Student("Sathya Moorthy", 786, department);
	        System.out.println(student);
	    }
}
