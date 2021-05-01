package kodlamaIo;

public class UserManager {
	
	public void logIn(User user) {
		System.out.println("Giriþ yapýldý: "+user.firstName +" " +user.lastName);
	}
	
	public void logOut(User user) {
		System.out.println("Çýkýþ yapýldý: "+user.firstName +" " +user.lastName);
	}

}
