package kodlamaIo;

public class StudentManager extends UserManager {
	
	public void addStudent(Student student) {
		System.out.println("Öğrenci eklendi: "+student.firstName);
	}
	
	public void rolCall(Student student) {
		System.out.println(student.firstName+ " " + student.lastName +": Yoklamanız alınmıştır. Dersinize geri dönebilirsiniz");
	}

}

