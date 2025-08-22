package Static;

//By using static variable

public class StaticVariable2 {
	
	int empid;
	String name;
	static String company = "TCS";

	public StaticVariable2(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}

	void display() {
		System.out.println("Empid: "+empid+" "+"Name: "+name+" "+"Company: "+company);
	}

	public static void main(String[] args) {

		StaticVariable2 sv = new StaticVariable2(101, "Shubham");
		sv.display();
		
		StaticVariable2 sv2 = new StaticVariable2(102, "Reena");
		sv2.display();
	}

}
