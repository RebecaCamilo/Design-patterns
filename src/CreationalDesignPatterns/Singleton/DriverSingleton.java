package CreationalDesignPatterns.Singleton;

public class DriverSingleton { //thread única
	public static void main(String[] args) {
		DatabaseSingleton singleton = DatabaseSingleton.getInstance();
		DatabaseSingleton singleton2 = DatabaseSingleton.getInstance();
		
		singleton.add("Ana");
		singleton2.add("Maria");
		singleton2.add("Raquel");
		
		singleton.show();
		singleton2.show();
	}
}
