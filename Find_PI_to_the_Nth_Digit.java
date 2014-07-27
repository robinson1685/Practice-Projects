import java.io.*;

import javax.swing.JOptionPane;


public class Find_PI_to_the_Nth_Digit {

	public class convertion{
		
	}
	public static void main(String[] args) throws IOException {
		System.out.println("What number of digits of PI be shown?");
		
		String nth = new String();
		nth = "1415926535897932384626433832795028841971693993751058209749445";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String number = reader.readLine();
		int temp = Integer.parseInt(number);
		String upToNCharacters = nth.substring(0, Math.min(nth.length(), temp));

		int n = Integer.parseInt(upToNCharacters);

		System.out.println("Pi to the Nth Decimal Place is: 3." + upToNCharacters );
		}
		//String pie = String.valueOf(Math.PI);
		
		// JOptionPane.showMessageDialog(null, "Your answer is 3." , digit);

	}
