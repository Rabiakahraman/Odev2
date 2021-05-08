package odev2gun;

public class Main {

	public static void main(String[] args) {
		

		Courses courses1= new Courses();
		courses1.id=1;
		courses1.Coursesname="java";
		courses1.instructor="engin demirog";
		courses1.detail="java ile kodlamayı ögren";
		
		
		Courses courses2= new Courses();
		courses2.id=1;
		courses2.Coursesname="programlama giriş";
		courses2.instructor="engin demirog";
		courses2.detail="programlama mantıgını ögren";
		
		Courses courses3= new Courses();
		courses3.id=1;
		courses3.Coursesname="c#";
		courses3.instructor="engin demirog";
		courses3.detail="c# ile kodlamayı ögren";
		
		Courses[] coursess = {courses1,courses2,courses3};
		for (Courses courses : coursess){ 
			System.out.println(courses.Coursesname);
		}
		System.out.println(coursess.length);
		
		Students students1= new Students();
		students1.id=1;
		students1.name="rabia";
		students1.surname="korkmaz";
		students1.email="rabia@email";
		
		Students students2= new Students();
		students2.id=2;
		students2.name="ramazan";
		students2.surname="korkmaz";
		students2.email="ramazan@email";
		
		CoursesManager coursesManager = new CoursesManager();
		coursesManager.addToCourses(courses1);
		
		coursesManager.addToCourses(courses2);
		
		coursesManager.addToCourses(courses3);
		

		StudentsManager studentsManager = new StudentsManager();
		studentsManager.addToStudents(students1);
		
		studentsManager.addToStudents(students2);
		
		
		

	}

}
