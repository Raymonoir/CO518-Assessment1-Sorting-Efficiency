package Raymond.com.Assessment1;

import java.util.ArrayList;


/**
 * This class seperates the tray of lithium into two arraylists depending on the grade. 
 * On top of this the class uses bubble sort to sort the 
 * 
 * @author Raymond Ward
 * @version 17/10/2019
 *
 */

public class LithiumGrading extends GenerateLithium 
{
	private ArrayList <Integer> lowGrade  = new ArrayList<Integer>();
	private ArrayList <Integer> highGrade  = new ArrayList<Integer>();

	
	public void generateGrades(int [][] tray)
	{
		for (int i = 0; i < tray.length; i++)
		{
			for (int j = 0; j < tray[i].length; j ++)
			{
				if (tray[i][j] > 25)
				{
					highGrade.add(tray[i][j]);
				}
				else
				{
					lowGrade.add(tray[i][j]);
				}
			}
		}
	}
	
	/**]
	 * This method will sort both arrays using the bubble sort method
	 */
	
	public void sortingLithium()
	{
		bubbleSort (lowGrade);
		bubbleSort (highGrade);
		
	}
	
	/**
	 * Implements bubble sort in ascending order
	 * @param array, the given arraylist that is to be sorted
	 */
	public void bubbleSort (ArrayList<Integer> array)
	{
		for (int i = 0; i < array.size(); i ++)
		{
			for (int j = 0; j < array.size() - 1; j ++ )
			{
				
				if (array.get(j) > array.get(j+1))
				{
					int placeHold = array.get(j);
					array.set(j, array.get(j+1));
					array.set(j+1, placeHold);
				}
			}
		}
	}
	
	
	/**
	 * Used to check the bubble sort method works, just outputs both array lists
	 */
	public void printLithium()
	{
		System.out.println("HighGrade");
		for (int i : highGrade)
		{
			System.out.println(i);
		}
		
		System.out.println("LowGrade");
		for (int i : lowGrade)
		{
			System.out.println(i);
		}
		
	}
	
	
}
