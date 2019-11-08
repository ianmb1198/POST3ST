import java.util.Scanner;
import java.io.*;

public class Tab 
{
	private String[] existingTabs = new String[5];
	static Menu menu = new Menu();
	
	private String currentTab;
	int numOfTabs;
	
	Scanner cin = new Scanner(System.in);
	
	

	public void tabOptions(int choice)
	{
		if (choice == 1)
		{
			System.out.print("Enter the table number: ");
			String tableNum = cin.nextLine();
			tableNum += ".txt";
			createTab(tableNum);
			
		}
		else if (choice == 2)
		{
			System.out.println("Existing Tabs: ");
			for (int i = 0; i < numOfTabs; i++)
			{
				System.out.println(existingTabs[i]);
			}
			System.out.print("Enter tab you'd like to open: ");
			int tabChoice = cin.nextInt();
			cin.nextLine();
//			String tabChoiceStr = Integer.toString(tabChoice);
//			
//			for (int i = 0; i < numOfTabs; i++)
//			{
//				if (existingTabs[i].contentEquals(tabChoiceStr))
//				{
//					System.out.println("\nTab: " + tabChoice);
//					break;
//				}
//				else
//					continue;
//			}
			
			for (int i = 0; i < numOfTabs; i++)
			{
				int existingTabInt = Integer.parseInt(existingTabs[i]);
				if (tabChoice == existingTabInt)
				{
					openExistingTab(tabChoice);
					break;
				}
				else
					continue;
			}
		}
	}
	

	
	public void createTab(String tabNum)
	{
		try
		{
			
			File file = new File(tabNum);
			
			if (file.createNewFile())
			{
				String[] strSplit = tabNum.split(".txt");
				existingTabs[numOfTabs] = strSplit[0];
				numOfTabs++;
				System.out.println("Tab has been created...\n");
				menu.menuDisplay(tabNum);
				
			}
			else
			{
				System.out.println("Tab for that table is already open...\n");
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	
	}
	
	public void openExistingTab(int tabNumber)
	{
		
		
		String existingTab = Integer.toString(tabNumber) + ".txt";
		
		BufferedReader reader = null;
		try
		{
			reader = new BufferedReader(new FileReader(existingTab));
			String line = reader.readLine();
			System.out.println("\n-------------------------------" + "\nTab: " + tabNumber);
			
			while (line != null)
			{
				System.out.println(line);
				line = reader.readLine();
			}
			
			System.out.println("-------------------------------\n");
			menu.menuDisplay(existingTab);
			
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} finally {
			try { 
				if (reader != null)
					reader.close(); 
				} catch (Exception e) {
					
				}
		}
	
	}
	
	public void writeInTab(String data, String currentTab)
	{
		
		String tab = currentTab;
		
		System.out.println(tab);
		

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try
		{
			try {
				fw = new FileWriter(tab, true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			pw.println(data);
			System.out.println("Data successfully appended into file");
			pw.flush();
		} finally {
			try {
				pw.close();
				bw.close();
				fw.close();
			} catch (IOException e) {}
				
		}
	}



	public String getCurrentTab() {
		return currentTab;
	}

	public void setCurrentTab(String currentTab) {
		this.currentTab = currentTab;
	}
		
}
