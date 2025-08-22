package Encapsulation;

public class School {

	public static void main(String[] args) {

		Student s = new Student();
		s.setRollNo(101);
		System.out.println("Roll No.: "+s.getRollNo());
		s.setName("Sanju");
		System.out.println("Name: "+s.getName());
		
	}

}
