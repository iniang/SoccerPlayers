import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

public class MyArraySuperClass { 
	JButton[] buttons = new JButton[5];
	static String [] soccerPlayers = {"Messi", "Ronaldinho", "Ronaldo", "Pele", "Zidane"}; 
	 static String userInput;
     static String [] answer = {"Yes", "No"};
    
     static int i;
     static int j;
     
	
	
    static int [][][] goals =  new int [5][5][3];
    static int []seasons = {1,2};
    static String [] stats = {"goals per game", "Golden ball", "games played"};
    
    	               
	   
	public static void main (String[] args) 
	{   
		 ReadfileIntoArray rfta = new ReadfileIntoArray();
	        try {
				rfta.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		    for ( int i=0; i<2; i++){
		    	
		    	for ( int j=0; j<5; j++){
		    		
		    		for ( int k=0; k<3; k++){	
		    			
		    	//goals[i][j][k] = InputDatasClass.getgoalsScored(seasons[i],soccerPlayers[j], stats[k]);
		    	
		    	
		    }
		}

     }
		      JOptionPane j = new JOptionPane();
		      j.setBackground(Color.blue);
		      
	          JOptionPane.showMessageDialog(null, " Welcome to the club of world best Soccer Players! \n");    
	          String s = (String)JOptionPane.showInputDialog(
	                              null,
	                              "Which one of these player is your favorite player?",
	                              "World best Soccer Players",
	                              JOptionPane.PLAIN_MESSAGE,
	                              null,
	                              soccerPlayers,
	                              soccerPlayers[i]);
	         /* switch(s) {
	              case "Messi" : JOptionPane.showMessageDialog(null, "You have chosen " + soccerPlayers[0]); i=0; break;
	              case  "Ronaldinho"  : JOptionPane.showMessageDialog(null, "You have chosen " + soccerPlayers[1]); i=1; break;
	              case "Ronaldo" :  JOptionPane.showMessageDialog(null, "You have chosen " + soccerPlayers[2]); i=2; break;
	              case "Pele" :  JOptionPane.showMessageDialog(null, "You have chosen " + soccerPlayers[3]); i=3; break;
	              case "Zidane" :  JOptionPane.showMessageDialog(null, "You have chosen " + soccerPlayers[4]); i=4; break;
	          }*/
	            if (s == soccerPlayers[0]){
	            	
	            	 JOptionPane.showMessageDialog(null, "You have chosen " + soccerPlayers[0]); i=0; 
	            } else if (s == soccerPlayers [1]){
	            	JOptionPane.showMessageDialog(null, "You have chosen " + soccerPlayers[1]); i=1;
	            } else if(s == soccerPlayers[2]){
	            	JOptionPane.showMessageDialog(null, "You have chosen " + soccerPlayers[2]); i=2;
	            } else if (s == soccerPlayers[3]){
	            	JOptionPane.showMessageDialog(null, "You have chosen " + soccerPlayers[3]); i=3;
	            } else if (s == soccerPlayers[4]){
	            	JOptionPane.showMessageDialog(null, "You have chosen " + soccerPlayers[4]); i=4;
	            }
	              
	              
	              JOptionPane.showMessageDialog(null,"Do you want to see " + soccerPlayers[i] + "'s records " + " ? "); 
	    
	            		  String response = (String)JOptionPane.showInputDialog(
	                              null,
	                              "Please Confirm!",
	                              "Confirmation",
	                              JOptionPane.PLAIN_MESSAGE,
	                              null,
	                              answer,
	                              answer[i]);
	            		  
	            if (response == answer[0]){
	            	JOptionPane.showMessageDialog(null, "\n Oh Yeah! Master " + " Here you are the records of " + soccerPlayers[i]);
	            	OutputClass showRecord = new OutputClass();
		            showRecord.getThePlayerGoals(soccerPlayers, goals, i);
		           
		            
	            	
	            } else if (response == answer[1]){
	            	JOptionPane.showMessageDialog(null, " Alright! /n This is your choice. /n Have a great day! \n Come Back anytime soon! ");
	            }
	            		  
	           
	          }
	        }
	
	


	          
	          
	          
	    
	

	


		 
      	    	
		    
			
			
			
                         
	      
	
	
	



