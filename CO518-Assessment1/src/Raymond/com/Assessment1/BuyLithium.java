package Raymond.com.Assessment1;

import java.util.Scanner;


/**
 * @author Raymond Ward
 * @version 17/10/2019
 * 
 * BuyLithium class allows the user to find a selection of lithium based on its price or its grade
 * 
 */
public class BuyLithium extends LithiumPricing 
{
	
	private Scanner input;
	
	
	/**
	 * Finds pieces of lithium with an acceptable price for the user
	 * @param price, lithium with a price lower or equal to this parameter will be output
	 */
	public void findBestPrice(int price)
	{
		
		int lithiumCounter = 0;
		for (Integer lithiumPrice :  lithiumPrices.keySet())
		{	
				for (Integer grade : lithiumPrices.get(lithiumPrice))
				{
					if (lithiumPrice <= price)
					{
						System.out.println(grade + " " + lithiumPrice);
						lithiumCounter++;
					}
				}
		}
		
		System.out.println("There are " + lithiumCounter + " Options for you");

	}
	/**
	 * Finds pieces of lithium with an acceptable grade once the user has input this grade
	 */
	public void findHighQuality() 
	{
		input = new Scanner (System.in);
		int wantedGrade = 100;
		
		while (wantedGrade < 0 || wantedGrade > 50)
		{
			System.out.println("Please enter highest quality grade between 1-50");
			
			wantedGrade = input.nextInt();
			
		}
		
		int lithiumCounter = 0;
		
		for (Integer lithiumPrice :  lithiumPrices.keySet())
		{
			for (Integer grade : lithiumPrices.get(lithiumPrice))
			{
				if (grade >= wantedGrade)
				{
					System.out.println(grade + " " + lithiumPrice );
					lithiumCounter++;
				}
			}
		}
		
		System.out.println("There are " + lithiumCounter + " Options for you");
		
		
	}

}