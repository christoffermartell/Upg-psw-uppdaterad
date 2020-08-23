package upg;
import java.util.Scanner;
public class pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);    // framkalla scanner(så användaren kan skriva). 
       
       String pass;                                   
       String lösen = "marcusjohansson" ;                    // variabel för spara info 
       
       System.out.print("Enter password : ");
       pass = input.nextLine();                  // så att användaren kan skriva in lösen o svara på printen.
       if(pass.equals(lösen)){       // beroende ifall user skriver rätt kod får han olika svar, därav if och else.
       System.out.println("Access Granted, Wellcome sensei.");}
       else {
    	   System.out.println("Access Denied");
    	   System.out.println("Attempt 2");
      
    	   
      System.out.print("Enter password : ");           // resterande är bara kopia av  den övre koden med ändringar i println..
      pass = input.nextLine();
      if(pass.equals(lösen)){
    	  System.out.println("Access Granted, Wellcome sensei.");}   
      else {
   	   System.out.println("Access Denied");
   	   System.out.println("Attempt 3");
   	   
   	 System.out.print("Enter password : ");
     pass = input.nextLine();
     if(pass.equals(lösen)){
   	  System.out.println("Access Granted, Wellcome sensei.");}   
     else {
  	   System.out.println("Access Denied" + "\nYour time is up..");
  	   
  	   System. exit(0);               //för att avsluta koden..
   
  	   System.out.println("hello");
  	   
  	   
     }
   	   
       }
       
      
	
	}

	}
}
