package ca.demo.salestool;

public class SalesData
{
	int data[] = {-1, 0, 4, 42, 84};
	
	public void display()
	{
		System.out.println("Data:");
		int sum =0;
		for (int i = 0; i < data.length; i++)
		{
			System.out.println("Next value: " + data[i]);
			sum += i;
		}
		
		System.out.println("Sum is: " + sum);
	}
}
