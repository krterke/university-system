package exceptions;

public class EnrollException extends Exception {
	
   
     public EnrollException()
     {
         super("Error");
     
     }
   
     public static String printMessage(int check)
     {
  
         switch (check) {
         case -1:
             return "User does not exist";
         case 0:
        	 return "Login or password is wrong.Please, try again";
         case -2 :
        	 return "Login or password is wrong.Please, try again";
         }
		return "";
     }
}


