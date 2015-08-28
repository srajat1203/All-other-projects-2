import java.util.Scanner;


public class ThreeCardMonte {

	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		//String response = "y";
		int guess;
		int solution;
		int buyin = 100;
		int bet, left, total;
		total = 100;
	
		
		
		
	while(total <501 && total >4)
	{
		System.out.println("Place your bets");
		bet = sc.nextInt();
	
		while(bet > total || bet < 5 )
		{
			if(bet > total)
			{
				System.out.println("You can't bet more than you have! Try again");
				bet = sc.nextInt();
			}
			else if (bet < 5)
			{
				System.out.println("Bet needs to be more than 5! Try again");
				bet = sc.nextInt();
			}
				
		}
		total = total - bet;
		
		Generator hide = new Generator();
		solution = hide.hidden();
		
		System.out.println("Which one is the ace?" + "\n");
		System.out.println("\t"  + "##  ##  ##");
		System.out.println("\t"  + "1   2   3");
		guess = sc.nextInt();
		
		if(guess != solution)
		{
			System.out.println("Ha! Fast Eddie wins again! The ace was number "
					           + solution + "\n");
			if(solution == 1)
			{
				System.out.println("\t"  + "AA  ##  ##");
				System.out.println("\t"  + "1   2   3");
			}
			
			else if(solution == 2)
			{
				System.out.println("\t"  + "##  AA  ##");
				System.out.println("\t"  + "1   2   3");
			}
			
			else if (solution == 3)
			{
				System.out.println("\t"  + "##  ##  AA");
				System.out.println("\t"  + "1   2   3");
			}
			
			else
			{
				System.out.println("\t" + "err1");
			}
			System.out.println("Your remaining total is :" + total  + "\n");
		}
		else
		{
			System.out.println("You nailed it! Fast eddie reluctantly hands over your winnings "+ "\n");
			if(solution == 1)
			{
				System.out.println("\t"  + "AA  ##  ##");
				System.out.println("\t"  + "1   2   3");
			}
			
			else if(solution == 2)
			{
				System.out.println("\t"  + "##  AA  ##");
				System.out.println("\t"  + "1   2   3");
			}
			
			else if (solution == 3)
			{
				System.out.println("\t"  + "##  ##  AA");
				System.out.println("\t"  + "1   2   3");
			}
			
			else
			{
				System.out.println("\t" + "err2");
			}
			
			total = total + bet + bet;
			System.out.println("Your total is :" + total + "\n");
	
		}
	}	
		
	if(total < 5)
	{
		System.out.println("You lost. Fast Eddie is too fast for you");
	}
	else
	{
		System.out.println("You won! Come back any time");
	}
		
	}
}
