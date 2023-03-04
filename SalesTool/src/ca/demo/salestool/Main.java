package ca.demo.salestool;
/* Where is the documentation! */
public class Main
{
	public static void main(String[] args)
	{
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
	}
	
	private static void displayGreeting()
	{
		System.out.println("Hello Happy Sales People!");
		System.out.println("This App Shows Sales Data");
		System.out.println("-------------------------");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
		System.out.println("Test 3");
	}
}
