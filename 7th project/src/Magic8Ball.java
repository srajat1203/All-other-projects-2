
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball
{
	public static void main ( String[] args )
	{
		
		Scanner sc = new Scanner(System.in);
		String response = "y";
		String question;
		String answer;
		
		String[] arr = new String[20];
		int i = 0;
	
	outerloop:	
	while(response.equalsIgnoreCase("y"))
	{	
		
		Magic8 magic = new Magic8();
		
		System.out.println("What is you question, sire?");
		question = sc.nextLine();
		
		if(question.equalsIgnoreCase("history"))
		{
			if(i == 0)
				break outerloop;
			else
				for(int j=0; j<i; j+=2)
				{
					System.out.println(arr[j]);
					System.out.println(arr[j+1]);
					System.out.println();
				}
		}
		else
		{
			arr[i] = question;
			i++;
			//sc.nextLine();
			
			answer = magic.responseFinder();
			arr[i] = answer;
			i++;
			
			System.out.println( "MAGIC 8-BALL SAYS: " + answer );
			
			//see if user wants to continue
			System.out.print("Continue? (y/n) :");
			response = sc.nextLine();
			System.out.println();
		}
	
	}
	}
}