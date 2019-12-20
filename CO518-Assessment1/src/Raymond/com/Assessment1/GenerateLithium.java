package Raymond.com.Assessment1;

import java.util.Random;

/**
 * GenerateLithium is responsible for generating a tray of lithium with gradings 0-50, 
 * as well as outputting the tray
 * 
 * @author Raymond Ward
 *
 */
public class GenerateLithium 
{
	//you may alter this code accordingly as there may be some anomalies 
	    int tray [][] = new int [5][3];
	    private int grading = 0;
	    private Random randomGenerator;
	    
	    
	    /**
	     * Constructor for objects of class GenerateLithium
	     */
	    public GenerateLithium()
	    {
	        randomGenerator = new Random();
	    }
	    
	    public void generateSample()
	    {
	        for (int i = 0; i < tray.length; i++)
	        {
	            for (int j = 0; j < tray[i].length; j++)
	            {
	            	
	                grading = randomGenerator.nextInt(49) + 1;
	//Student to continue coding from here
	                
	                tray[i][j] = grading;


	            }
	        }
	    }
	    
	    /**
	     * Outputs the tray of lithium in required format
	     */
	    
	    public void printTray()
	    {
	    	for (int i = 0; i < tray.length; i ++)
	    	{
	    		for (int j = 0; j < tray[i].length; j ++)
	    		{
	    			System.out.print(tray[i][j] + "||");
	    		}
	    		
	    		System.out.println();
	    	}
	    	
	    }
}
