package kodlamaIo;

public class Main {
public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id= 1;
		course1.name= "C# & ANGULAR";
		course1.instructor = "ENGİN DEMİROĞ";
		course1.detail="Sektörde aranan yazılımcılar yetiştiriyoruz";
		
		Course course2 = new Course();
		course2.id=2;
		course2.name = "JAVA & REACT";
		course2.instructor = "ENGİN DEMİROĞ";
		course2.detail="Sıfırdan JAVA öğreniyoruz";
		
		Course[] courses = {course1,course2};
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		
		Student student1 = new Student();
		student1.id=1;
		student1.firstName="BETÜL";
		student1.lastName= "ÇELİK";
		student1.setCoursesTaken("JAVA & React");
		
		Instructor instructor1 = new Instructor();
		instructor1.id=1;
		instructor1.firstName="ENGİN";
		instructor1.lastName="DEMİROĞ";
		instructor1.coursesGiven=course2.name;
		
		
	
		UserManager userManager = new UserManager();
		userManager.logIn(student1);
		userManager.logIn(instructor1);
		
		StudentManager studentManager= new StudentManager();
		studentManager.addStudent(student1);
		studentManager.rolCall(student1);
		
		System.out.println(student1.getCoursesTaken());
}

}
