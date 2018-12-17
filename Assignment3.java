import java.util.Scanner;

public class Assignment3 
{
	public static void main(String[] args)
	{
		int trackNum = 0;
		double storeSum = 0.0;
		double holdLast = 0.0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in a number. Type 0 to quit.");
		double value = scan.nextDouble();
		double lowVal = value;
		double highVal = value;
		while(value!=0)
		{
			storeSum = value + storeSum;
			trackNum++;
			if(value>highVal)
			{
				highVal = value;
			}
			if(value<lowVal)
			{
				lowVal = value;
			}
			System.out.println("Please type in a number. Type 0 to quit.");
			value = scan.nextDouble();
		}
		if(trackNum == 0)
		{
			System.out.println("You didn't type anything in.");
		}
		else
		{
			System.out.println("The sum of your inputs is: " + storeSum);
			System.out.println("The total number of inputs you provided is: " + trackNum);
			System.out.println("The average of your inputs is: " + (storeSum/trackNum));
			System.out.println("The highest number you input was: " + highVal);
			System.out.println("The lowest number you input was: " + lowVal);
		}
	}
}
