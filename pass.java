package upg;
import java.util.Scanner;
public class pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);    // framkalla scanner(s� anv�ndaren kan skriva). 
       
       String pass;                                   
       String l�sen = "marcusjohansson" ;                    // variabel f�r spara info 
       
       System.out.print("Enter password : ");
       pass = input.nextLine();                  // s� att anv�ndaren kan skriva in l�sen o svara p� printen.
       if(pass.equals(l�sen)){       // beroende ifall user skriver r�tt kod f�r han olika svar, d�rav if och else.
       System.out.println("Access Granted, Wellcome sensei.");}
       else {
    	   System.out.println("Access Denied");
    	   System.out.println("Attempt 2");
      
    	   
      System.out.print("Enter password : ");           // resterande �r bara kopia av  den �vre koden med �ndringar i println..
      pass = input.nextLine();
      if(pass.equals(l�sen)){
    	  System.out.println("Access Granted, Wellcome sensei.");}   
      else {
   	   System.out.println("Access Denied");
   	   System.out.println("Attempt 3");
   	   
   	 System.out.print("Enter password : ");
     pass = input.nextLine();
     if(pass.equals(l�sen)){
   	  System.out.println("Access Granted, Wellcome sensei.");}   
     else {
  	   System.out.println("Access Denied" + "\nYour time is up..");
  	   
  	   System. exit(0);               //f�r att avsluta koden..
   
  	   System.out.println("hello");
  	   
  	   
     }
   	   
       }
       
      
	
	}

	}
}
