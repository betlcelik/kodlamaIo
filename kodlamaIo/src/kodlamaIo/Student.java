package kodlamaIo;

public class Student extends User {
	
	 private String coursesTaken;
	
	
	public Student() {
			System.out.println("Yoklaman�z al�nm��t�r");
	}
	
	public String getCoursesTaken() {
		
		return coursesTaken;
	}
	
	public void setCoursesTaken(String coursesTaken) {
		this.coursesTaken=coursesTaken;
	}
}

