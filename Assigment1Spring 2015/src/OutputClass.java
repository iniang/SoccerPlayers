import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OutputClass extends InputDatasClass{
	
	public void getThePlayerGoals(String soccerPlayers[], int goals[][][], int p) {
		
		//
		StringBuilder builder = new StringBuilder();
		
		//	
		     for (int j = 0; j < 5; j++){
		    	 
		             for (int k = 0; k < 3; k++)
		                       {
	builder.append(" For season " +  seasons [j] + ", " +  soccerPlayers[i] + " had " + stats[k] + " " + goals[p][j][k]); break;
		            	 
		            	        }
    builder.append("\n");
		            	    }
		            	    JOptionPane.showMessageDialog(null, builder,"Arrays",JOptionPane.INFORMATION_MESSAGE); 
		            	    
   }
		
		
	}	
	


		
	
	
