package Raymond.com.Assessment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Lithium Pricing class uses produces a hashmap in which the set lithium prices are the keys and the 
 * values are a list of lithium grades which fit that price, also able to output all prices
 * 
 * @author Raymond Ward
 * @Version 17/10/2019
 *
 */
public class LithiumPricing extends GenerateLithium 
{
	protected HashMap<Integer,List<Integer>> lithiumPrices = new HashMap<Integer,List<Integer>>();
	
	private List<Integer> cost300 = new ArrayList<Integer>();
	private List<Integer> cost600 = new ArrayList<Integer>();
	private List<Integer> cost900 = new ArrayList<Integer>();
	private List<Integer> cost1250 = new ArrayList<Integer>();
	
	
	/**
	 * setPrice method uses a nested loop and a set of if statements to sort the 
	 * tray of lithium into the price categories
	 */
	public void setPrice()
	{
		for (int i = 0; i < tray.length; i++)
		{
			for (int j = 0; j < tray[i].length; j ++)
				{
					
					if (tray[i][j] <= 9)
					{
						cost300.add(tray[i][j]);
					}
					else if (tray[i][j] > 9 && tray[i][j] <= 19)
					{
						cost600.add(tray[i][j]);
					}
					else if (tray[i][j] > 19 && tray[i][j] <=29)
					{
						cost900.add(tray[i][j]);
					}
					else
					{
						cost1250.add(tray[i][j]);
					}
				}
		}
		
		
		lithiumPrices.put(300,cost300);
		lithiumPrices.put(600,cost600);
		lithiumPrices.put(900,cost900);
		lithiumPrices.put(1250,cost1250);
		
	}
	
	
	/**
	 * Nested loop and then outputs each lithium grade along with associated price
	 */
	public void printPrice ()
	{
		for (Integer price: lithiumPrices.keySet())
		{
			
			for (Integer grade : lithiumPrices.get(price))
			System.out.println( grade  + " " + price);
		}
		
		System.out.println();
	}

}
