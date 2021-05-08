package odev2gun;

public class Students {
	public Students() {
		System.out.println("ögrenci giriþ");
	}
	public Students(int id,String name,String surname,String email) {
		this();
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.email=email;
	}
	
	
	int id;
	String name;
	String surname;
	String email;

}
