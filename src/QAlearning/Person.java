package QAlearning;

public class Person {
	
	// Attributes of each person
	private double height;
	private String name;
	private double shoesize;
	private String jobTitle;
	private int age;

	
	
	// greetings
	
	public void greet() {
		System.out.println("Hi i'm "+ height + " foot tall and my name is "+ name +" i am " + age +" years old "
				+ "my foot size is "+ shoesize + " and i work as a " + jobTitle);
	}
	public void greet2() {
		System.out.println("Hi my name is "+ name +" and im "+ height + " foot tall");
	}
	
	// Constructors
	public Person(double height, String name, double shoesize, String jobTitle, int age) {
		this.height = height;
		this.name = name;
		this.shoesize = shoesize;
		this.jobTitle = jobTitle;
		this.age = age;
	}
	public Person(double height, String name) {
		super();
		this.height = height;
		this.name = name;
	}

	
}
