import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class InputDatasClass extends MyArraySuperClass
{
	     
	     static Scanner input = new Scanner(System.in);
	     
      // two-arguments constructor initializes myCities and temperature array
        public InputDatasClass (){
        
        	 }
        public static int getgoalsScored( int seasons, String soccerPlayers, String stats){
        	
            boolean valid = false;
                 int a = 0;
            	while(valid == false){	
            		
        	try
        	{   
        		System.out.println("How many " + stats + " for " + soccerPlayers  + " for year  " + seasons + " ?");      	  
        	  //nextInt will throw InputMismatchException
        	  //if the next token does not match the Integer
        	  //regular expression, or is out of range
        		    
    	           a = input.nextInt();
    	           valid = true; 
    	           
        	}
        	catch(InputMismatchException exception)
        	
        	{	
        	  //Print "This is not an integer"
        	  //when user put other than integer
        	  System.out.println("This is not an integer! Please enter a valid enter!");
        	   input.next();
        	}
        }
            	return a;
        }
     
}


        	     
        	    
	    		
	    	
	    
   
