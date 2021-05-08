package odev2gun;

public class Courses {
	
	public Courses() {
		System.out.println("%0 tamamlandı");
	}
	public Courses(int id,String Coursesname,String instructor,String detail) {
		this();
		this.id=id;
		this.Coursesname=Coursesname;
		this.instructor=instructor;
		this.detail=detail;
	};
	
	
	int id;
	String Coursesname;
	String instructor;
	String detail;

}
