package belajarInterface;

//class Santri implements class Profile
public class Santri implements Profile {
	//initation string name and school
	String name="Zainal Fahrudin",school="Pondok Programmer";
	
	//method name, no parameter
	public void name() {
		System.out.println("Name : "+name);
		
	}
	//method school, no parameter
	public void school() {
		System.out.println("School : "+school);
	}
	//method age with parameter int
	public void age(int umur) {
		System.out.println("Age : "+umur+" years old");
	}

}
