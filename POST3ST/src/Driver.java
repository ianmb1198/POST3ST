import java.util.Scanner;

/** TODO
 *  	- Add a payment option that will close out tab.
 *		- Keep track of sales.
 *		- Option to end the program.
 */

public class Driver 
{
	static Tab tab = new Tab();
	
	public static void main(String[] args)
	{
			displayWelcome();
	}
	
	public static void displayWelcome()
	{
		int userChoice;
		Scanner cin = new Scanner(System.in);
		
		
		System.out.println("Welcome!");
		
		do 
		{
			System.out.print("Would you like to (1)Begin Tab or (2)Open Existing Tab: ");
			userChoice = cin.nextInt();
			cin.nextLine();
			if (userChoice == 1 || userChoice == 2)
			{
				tab.tabOptions(userChoice);
			}
			else
			{
				System.out.println("ERROR: Enter either option (1) or option (2)...");
				continue;
			}			
		} while (userChoice != 1 || userChoice != 2);
		
		cin.close();
	}
	
}
