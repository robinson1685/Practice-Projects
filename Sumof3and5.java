public class Sumof3and5
{
	public static void main (String [] args)
	{
			int total = 0;
			
			for (int i = 0; i < 1000; i++)
				if (i % 3 == 0 || i % 5 == 0) {
					System.out.println( i );
					total = total + i;
				}
			System.out.println("\nTotal:"  + total);
	}
}
	