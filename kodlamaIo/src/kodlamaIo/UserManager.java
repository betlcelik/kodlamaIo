package kodlamaIo;

public class UserManager {
	
	public void logIn(User user) {
		System.out.println("Giri� yap�ld�: "+user.firstName +" " +user.lastName);
	}
	
	public void logOut(User user) {
		System.out.println("��k�� yap�ld�: "+user.firstName +" " +user.lastName);
	}

}
