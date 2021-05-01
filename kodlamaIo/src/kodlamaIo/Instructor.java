package kodlamaIo;

public class Instructor extends User{
	
	String profession;
	String coursesGiven;
	
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession=profession;
	}
	public String getCoursesGiven() {
		return coursesGiven;
	}
	public void setCoursesGiven(String coursesGiven) {
		this.coursesGiven=coursesGiven;
	}
}