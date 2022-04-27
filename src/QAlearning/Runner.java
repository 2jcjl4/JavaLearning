package QAlearning;

public class Runner {

	public static void main(String[] args) {
		
		Person james = new Person(6.0,"james",10.5,"software specialist",19);
		Person aaron = new Person(5.0,"aaron",6,"warehouse foreman",22);
		Person betty = new Person(3.6,"betty");
		Person hunter = new Person(8.2,"hunter");
		
		james.greet();
		aaron.greet();
		betty.greet2();
		hunter.greet2();
	}
}
