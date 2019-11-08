import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Menu 
{
	int size;
	static Tab tab = new Tab();
	
	Scanner cin = new Scanner(System.in);
	
	public void menuDisplay(String currentTab)
	{
		System.out.println("********Menu********");
		System.out.println("1. Appetizers\n2. Salads\n3. Sandwhiches\n4. Burgers\n" +
				"5. Tacos\n6. Sides\n7. Kids Meals\n8. Beverages\n\n0. Send");
		System.out.println("********************");
		System.out.print("--> ");
		int choice = cin.nextInt();
		cin.nextLine();
		if (choice == 0)
		{
			Driver.displayWelcome();
		}
		else
		{
			readFile(choice, currentTab);	
		}
		
	}
	
	public void readFile(int choice, String currentTab)
	{
		switch (choice)
		{
		case 1:
			appMenu(currentTab);
			break;
		case 2:
			saladMenu(currentTab);
			break;
		case 3:
			swMenu(currentTab);
			break;
		case 4:
			burgerMenu(currentTab);
			break;
		case 5:
			tacoMenu(currentTab);
			break;
		case 6:
			sideMenu(currentTab);
			break;
		case 7:
			kidsMenu(currentTab);
			break;
		case 8:
			bevMenu(currentTab);
			break;
		default:
			System.out.println("Invalid choice...");
			break;
		}
	}
	
	public void appMenu(String currentTab)
	{
		Scanner cin = new Scanner(System.in);
		Scanner fileIn = null;
		String[] item = new String[10];
		double[] price = new double[10];
		
		try
		{
			fileIn = new Scanner(new FileInputStream("Appetizer.txt"));
		} catch (FileNotFoundException e)
		{
			System.out.println("\nFile Not Found...\n");
		}
		
		int index = 0;
		String appMenu = null;
		while (fileIn.hasNext())
		{
			appMenu = fileIn.nextLine();
			String[] strSplit = appMenu.split(",");
			item[index] = strSplit[0];
			price[index] = Double.parseDouble(strSplit[1]);
			index++;
		}
		
		int choice;
		do
		{
			System.out.println("***Appetizers***");
			for (int i = 0; i < index; i++)
			{
				System.out.println((i + 1) + ". " + item[i] + " $" + price[i]);
			}
			System.out.println("\n0. Done");
			System.out.println("****************");
			System.out.print("--> ");
			choice = cin.nextInt();
			cin.nextLine();
			
			if (choice != 0)
			{
				String itemOfChoice = item[choice - 1];
				double priceOfItem = price[choice - 1];
				
				String data = (itemOfChoice + "\t$" + priceOfItem);
				tab.writeInTab(data, currentTab);
				continue;
			}
			else
				break;
			
		} while (choice != 0);
		
		menuDisplay(currentTab);
		
		cin.close();
	}
	public void saladMenu(String currentTab)
	{
		Scanner cin = new Scanner(System.in);
		Scanner fileIn = null;
		String[] item = new String[10];
		double[] price = new double[10];
		
		try
		{
			fileIn = new Scanner(new FileInputStream("Salad.txt"));
		} catch (FileNotFoundException e)
		{
			System.out.println("\nFile Not Found...\n");
		}
		
		int index = 0;
		String saladMenu = null;
		while (fileIn.hasNext())
		{
			saladMenu = fileIn.nextLine();
			String[] strSplit = saladMenu.split(",");
			item[index] = strSplit[0];
			price[index] = Double.parseDouble(strSplit[1]);
			index++;
		}
		
		int choice;
		do
		{
			System.out.println("***Salads***");
			for (int i = 0; i < index; i++)
			{
				System.out.println((i + 1) + ". " + item[i] + " $" + price[i]);
			}
			System.out.println("\n0. Done");
			System.out.println("****************");
			System.out.print("--> ");
			choice = cin.nextInt();
			cin.nextLine();
			
			if (choice != 0)
			{
				String itemOfChoice = item[choice - 1];
				double priceOfItem = price[choice - 1];
				
				String data = (itemOfChoice + "\t$" + priceOfItem);
				tab.writeInTab(data, currentTab);
				continue;
			}
			else
				break;
			
		} while (choice != 0);
		
		menuDisplay(currentTab);
		
		cin.close();
	}
	public void swMenu(String currentTab)
	{
		Scanner cin = new Scanner(System.in);
		Scanner fileIn = null;
		String[] item = new String[10];
		double[] price = new double[10];
		
		try
		{
			fileIn = new Scanner(new FileInputStream("Sandwhich.txt"));
		} catch (FileNotFoundException e)
		{
			System.out.println("\nFile Not Found...\n");
		}
		
		int index = 0;
		String swMenu = null;
		while (fileIn.hasNext())
		{
			swMenu = fileIn.nextLine();
			String[] strSplit = swMenu.split(",");
			item[index] = strSplit[0];
			price[index] = Double.parseDouble(strSplit[1]);
			index++;
		}
		
		int choice;
		do
		{
			System.out.println("***Sandwhiches***");
			for (int i = 0; i < index; i++)
			{
				System.out.println((i + 1) + ". " + item[i] + " $" + price[i]);
			}
			System.out.println("\n0. Done");
			System.out.println("****************");
			System.out.print("--> ");
			choice = cin.nextInt();
			cin.nextLine();
			
			if (choice != 0)
			{
				String itemOfChoice = item[choice - 1];
				double priceOfItem = price[choice - 1];
				
				String data = (itemOfChoice + "\t$" + priceOfItem);
				tab.writeInTab(data, currentTab);
				continue;
			}
			else
				break;
			
		} while (choice != 0);
		
		menuDisplay(currentTab);
		
		cin.close();
	}
	public void burgerMenu(String currentTab)
	{
		Scanner cin = new Scanner(System.in);
		Scanner fileIn = null;
		String[] item = new String[10];
		double[] price = new double[10];
		
		try
		{
			fileIn = new Scanner(new FileInputStream("Burger.txt"));
		} catch (FileNotFoundException e)
		{
			System.out.println("\nFile Not Found...\n");
		}
		
		int index = 0;
		String burgerMenu = null;
		while (fileIn.hasNext())
		{
			burgerMenu = fileIn.nextLine();
			String[] strSplit = burgerMenu.split(",");
			item[index] = strSplit[0];
			price[index] = Double.parseDouble(strSplit[1]);
			index++;
		}
		
		int choice;
		do
		{
			System.out.println("***Burgers***");
			for (int i = 0; i < index; i++)
			{
				System.out.println((i + 1) + ". " + item[i] + " $" + price[i]);
			}
			System.out.println("\n0. Done");
			System.out.println("****************");
			System.out.print("--> ");
			choice = cin.nextInt();
			cin.nextLine();
			
			if (choice != 0)
			{
				String itemOfChoice = item[choice - 1];
				double priceOfItem = price[choice - 1];
				
				String data = (itemOfChoice + "\t$" + priceOfItem);
				tab.writeInTab(data, currentTab);
				continue;
			}
			else
				break;
			
		} while (choice != 0);
		
		menuDisplay(currentTab);
		
		cin.close();
	}
	public void tacoMenu(String currentTab)
	{
		Scanner cin = new Scanner(System.in);
		Scanner fileIn = null;
		String[] item = new String[10];
		double[] price = new double[10];
		
		try
		{
			fileIn = new Scanner(new FileInputStream("Taco.txt"));
		} catch (FileNotFoundException e)
		{
			System.out.println("\nFile Not Found...\n");
		}
		
		int index = 0;
		String tacoMenu = null;
		while (fileIn.hasNext())
		{
			tacoMenu = fileIn.nextLine();
			String[] strSplit = tacoMenu.split(",");
			item[index] = strSplit[0];
			price[index] = Double.parseDouble(strSplit[1]);
			index++;
		}
		
		int choice;
		do
		{
			System.out.println("***Tacos***");
			for (int i = 0; i < index; i++)
			{
				System.out.println((i + 1) + ". " + item[i] + " $" + price[i]);
			}
			System.out.println("\n0. Done");
			System.out.println("****************");
			System.out.print("--> ");
			choice = cin.nextInt();
			cin.nextLine();
			
			if (choice != 0)
			{
				String itemOfChoice = item[choice - 1];
				double priceOfItem = price[choice - 1];
				
				String data = (itemOfChoice + "\t$" + priceOfItem);
				tab.writeInTab(data, currentTab);
				continue;
			}
			else
				break;
			
		} while (choice != 0);
		
		menuDisplay(currentTab);
		
		cin.close();
	}
	public void sideMenu(String currentTab)
	{
		Scanner cin = new Scanner(System.in);
		Scanner fileIn = null;
		String[] item = new String[10];
		double[] price = new double[10];
		
		try
		{
			fileIn = new Scanner(new FileInputStream("Sides.txt"));
		} catch (FileNotFoundException e)
		{
			System.out.println("\nFile Not Found...\n");
		}
		
		int index = 0;
		String sidesMenu = null;
		while (fileIn.hasNext())
		{
			sidesMenu = fileIn.nextLine();
			String[] strSplit = sidesMenu.split(",");
			item[index] = strSplit[0];
			price[index] = Double.parseDouble(strSplit[1]);
			index++;
		}
		
		int choice;
		do
		{
			System.out.println("***Sides***");
			for (int i = 0; i < index; i++)
			{
				System.out.println((i + 1) + ". " + item[i] + " $" + price[i]);
			}
			System.out.println("\n0. Done");
			System.out.println("****************");
			System.out.print("--> ");
			choice = cin.nextInt();
			cin.nextLine();
			
			if (choice != 0)
			{
				String itemOfChoice = item[choice - 1];
				double priceOfItem = price[choice - 1];
				
				String data = (itemOfChoice + "\t$" + priceOfItem);
				tab.writeInTab(data, currentTab);
				continue;
			}
			else
				break;
			
		} while (choice != 0);
		
		menuDisplay(currentTab);
		
		cin.close();
	}
	public void kidsMenu(String currentTab)
	{
		Scanner cin = new Scanner(System.in);
		Scanner fileIn = null;
		String[] item = new String[10];
		double[] price = new double[10];
		
		try
		{
			fileIn = new Scanner(new FileInputStream("KidsMeal.txt"));
		} catch (FileNotFoundException e)
		{
			System.out.println("\nFile Not Found...\n");
		}
		
		int index = 0;
		String kmMenu = null;
		while (fileIn.hasNext())
		{
			kmMenu = fileIn.nextLine();
			String[] strSplit = kmMenu.split(",");
			item[index] = strSplit[0];
			price[index] = Double.parseDouble(strSplit[1]);
			index++;
		}
		
		int choice;
		do
		{
			System.out.println("***Kids Meals***");
			for (int i = 0; i < index; i++)
			{
				System.out.println((i + 1) + ". " + item[i] + " $" + price[i]);
			}
			System.out.println("\n0. Done");
			System.out.println("****************");
			System.out.print("--> ");
			choice = cin.nextInt();
			cin.nextLine();
			
			if (choice != 0)
			{
				String itemOfChoice = item[choice - 1];
				double priceOfItem = price[choice - 1];
				
				String data = (itemOfChoice + "\t$" + priceOfItem);
				tab.writeInTab(data, currentTab);
				continue;
			}
			else
				break;
			
		} while (choice != 0);
		
		menuDisplay(currentTab);
		
		cin.close();
	}
	public void bevMenu(String currentTab)
	{
		Scanner cin = new Scanner(System.in);
		Scanner fileIn = null;
		String[] item = new String[10];
		double[] price = new double[10];
		
		try
		{
			fileIn = new Scanner(new FileInputStream("NABeverage.txt"));
		} catch (FileNotFoundException e)
		{
			System.out.println("\nFile Not Found...\n");
		}
		
		int index = 0;
		String bevMenu = null;
		while (fileIn.hasNext())
		{
			bevMenu = fileIn.nextLine();
			String[] strSplit = bevMenu.split(",");
			item[index] = strSplit[0];
			price[index] = Double.parseDouble(strSplit[1]);
			index++;
		}
		
		int choice;
		do
		{
			System.out.println("***NA Beverages***");
			for (int i = 0; i < index; i++)
			{
				System.out.println((i + 1) + ". " + item[i] + " $" + price[i]);
			}
			System.out.println("\n0. Done");
			System.out.println("****************");
			System.out.print("--> ");
			choice = cin.nextInt();
			cin.nextLine();
			
			if (choice != 0)
			{
				String itemOfChoice = item[choice - 1];
				double priceOfItem = price[choice - 1];
				
				String data = (itemOfChoice + "\t$" + priceOfItem);
				tab.writeInTab(data, currentTab);
				continue;
			}
			else
				break;
			
		} while (choice != 0);
		
		menuDisplay(currentTab);
		
		cin.close();
	}
}
