package kodlamaIo;

public class StudentManager extends UserManager {
	
	public void addStudent(Student student) {
		System.out.println("��renci eklendi: "+student.firstName);
	}
	
	public void rolCall(Student student) {
		System.out.println(student.firstName+ " " + student.lastName +": Yoklaman�z al�nm��t�r. Dersinize geri d�nebilirsiniz");
	}

}

