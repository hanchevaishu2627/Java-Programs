package Static;

//Without using static variable

public class StaticVariable {

	int empid;
	String name;
	String company;
	
	public StaticVariable(int empid, String name, String company) {
		super();
		this.empid = empid;
		this.name = name;
		this.company = company;
	}

	public void display() {
		System.out.println("Empid: "+empid+" "+"Name: "+name+" "+"Company: "+company);
	}

	public static void main(String[] args) {

		StaticVariable sv = new StaticVariable(101, "Shubham", "TCS");
		sv.display();
		
		StaticVariable sv1 = new StaticVariable(102, "Reena", "TCS");
		sv1.display();
	}

}
