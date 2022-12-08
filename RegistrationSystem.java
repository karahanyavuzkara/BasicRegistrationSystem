package patika;
import java.util.Scanner;
public class RegistrationSystem {

	public static void main(String[] args) {
		
		String userName , password;
		
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter your username : ");
	     
	    userName = input.nextLine();
	    
	    if(userName.length() < 8 ) {
	      System.out.print("Your username must be at least 8 characters long. "); 
	    
	    }
	    
	    System.out.print("Enter your password : ");
	
	    password = input.nextLine();
	    
	    if(password.length() < 8 ) {
	    	System.out.println("Your password must be at least 8 characters long. ");
	    	
	    }

	    System.out.print("You registered successfully.");
	    
	    	    
	    	
	    }
	}


