package Project4;

import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.plaf.FontUIResource;

/**
 * COP 3503: Project 5 - Array of Objects
 * <p>
 * This program allows the user to view a file and organize the data using
 * JOptionPanes for its output. First, it scans for a file named "computers".
 * Then it displays how many computers are read from the file and asks the user
 * to input one of five choices. These choices are to display all of the
 * computers, display computers with a given manufacturer, display computers
 * with a given CPU type, display computers at or below a given price, or quit.
 * This program also hands the close or cancel buttons. This program performs
 * error checking for an invalid input in the input dialog by giving an error
 * message in the form of a JOptionPane.
 * 
 * @author Mark Robinson
 * @version 3/14/2014
 * 
 */

public class Project6 {

	/*
	 * Algorithms:
	 * 
	 * 1. Read the file
	 * 2. Display a dialog asking the user to choose one of the five options
	 * 3. Read the users input and display the number of computers in the file
	 * 4. If the user presses the Cancel button or the Close window button,
	 * exit the program
	 * 5. If the user does not enter 1, 2, 3, 4, or 5, display an error message in a dialog and
	 * go to step 2
	 * 6. If the user enters 1, it will display all the computers in the file
	 * 7. If the user enters 2, it will open a display to ask the user to input a
	 * manufacturer name, then it will display all of the computers with that name.
	 * 8. If the user enters 3, it will open a display to ask the user to input a
	 * CPU name, then it will display all of the computers with that name.
	 * 9. If the user enters 4, it will open a display to ask the user to input a
	 * price, then it will display all of the computers below or at that price.
	 * 10. If the user enters 5, the program will exit. 
	 * 
	 */

	static String choice; //User's input
	static int count = 0; //Counter use to find number of computers
	static Computer[] array = new Computer[50]; // Array of data

	public static void main(String[] args) throws FileNotFoundException {

		// Displays the font
		javax.swing.UIManager.put("OptionPane.messageFont", new FontUIResource(
				new Font("Courier New", Font.BOLD, 14))); 

		// Calls the file
		File();
		// Loop until the user enters 1, 2, 3, 4, 5, Cancel or Close and
		//	has a switch statement that calls a methods based on the string choice with 
		// a default error message
		
		do {
			choice();
			switch (choice) {
			case "1":
				displayAll();
				break;
			case "2":
				displayManu();
				break;
			case "3":
				displayCPU();
				break;
			case "4":
				displayprice();
				break;
			case "5":
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null,
						"Invaild choice, please enter 1-5",
						"Geekazoid Inc. Computer Inventory",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (choice != null);

	}

/**File
 * This method opens a scanner to read the file called computers.txt. Then has a loop that 
 * separates the text in the file by each ":" and put it into an array that adds up to 7.
 * Then for each array it increases the counter. This method always has a error handler
 * that catches if a file is not found to display a JOptionaPane. 
 * 
 */
	
	public static void File() {

		try {
			File input = new File("computers.txt");
			Scanner file = new Scanner(input);

			while (file.hasNext()) {
				String num = file.nextLine();
				String[] cutArray = num.split(":");

				Computer object = new Computer(cutArray[0], cutArray[1],
						Integer.parseInt(cutArray[2]),
						Integer.parseInt(cutArray[3]), cutArray[4],
						cutArray[5], cutArray[6], Float.parseFloat(cutArray[7]));
				array[count] = object;
				count++;

			}
			file.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File Not Found");
		}
	}

	/** Choice
	 * The method displays a JOptionPane that inputs a string and if choice is null
	 * the program exits which is when the user enters cancel or exit.
	 * 
	 */
	public static void choice() {
		choice = JOptionPane.showInputDialog(null,
				"COP3503: Project 5 Mark Robinson \n\n"
						+ "Computer Inventory Manager \n\n" + "There were "
						+ count
						+ " computers read from the inventory file.\n\n"
						+ "What would you like to do?\n"
						+ " 1. Display all of the computers\n"
						+ " 2. Display computers with a given manufacturer\n"
						+ " 3. Display computers with a given CPU type.\n"
						+ " 4. Display computers at or below a given price.\n"
						+ " 5. Quit\n" + "Enter your choice:",
				"Geekazoid Inc. Computer Inventory", JOptionPane.PLAIN_MESSAGE);

		if (choice == null) {
			System.exit(1);
		}
	}
	
	/** DisplayAll
	 *  This method formats the data in the text file into a string called title. Then I create a string
	 *  called line,then combine the two. Then combine my string and the array of data and display all of the data
	 *  to a JOptionPane. This 
	 */
	public static void displayAll() {
		String title = String.format(
				"%-25s%-20s%-10s%-10s%-25s%-20s%-20s%-20s", "Manufacturer",
				"Model name", "Memory", "Disk", "CPU type", "Optical drive",
				"OS version", "Retail price");
		String line = ("----------------------------------------------------------------------------------------------------------------------------------------------\n");
		String combine = title + "\n" + line;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				combine += array[i].toString() + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, combine,
				"Geekazoid Inc. Computer Inventory", JOptionPane.PLAIN_MESSAGE);
	}

	/** DisplayManu
	 *  This method formats the data in the text file into a string called title. Then I create a string
	 *  called line,then combine the two. Then combine my string and the array of data and display all of the data
	 *  to a JOptionPane. Then it asks for the user to enter the manufacturer name, with error handling. Then it searches
	 *  the array of the manufacturer and return a JOptionPane of the computers with that same manufacturer.
	 */
	public static void displayManu() {
		String title = String.format(
				"%-25s%-20s%-10s%-10s%-25s%-20s%-20s%-20s", "Manufacturer",
				"Model name", "Memory", "Disk", "CPU type", "Optical drive",
				"OS version", "Retail price");
		String line = ("----------------------------------------------------------------------------------------------------------------------------------------------\n");
		String combine = title + "\n" + line;

		String manu = JOptionPane.showInputDialog(null,
				"Enter the manufacturer name.",
				"Geekazoid Inc. Computer Inventory", JOptionPane.PLAIN_MESSAGE);
		if (manu == null) {
			choice();
		}

		String newmanu = manu.toLowerCase();

		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if ((array[i].getManufacturer().toLowerCase().indexOf(newmanu)) != -1) {
					combine += array[i].toString() + "\n";
				}
			}
		}

		JOptionPane.showMessageDialog(null,
				"Computers with manufacturer field that contains: " + manu
						+ "\n\n" + combine,
				"Geekazoid Inc. Computer Inventory", JOptionPane.PLAIN_MESSAGE);

	}
	/**
	 * 	This method formats the data in the text file into a string called title. Then I create a string
	 *  called line,then combine the two. Then combine my string and the array of data and display all of the data
	 *  to a JOptionPane. Then it asks for the user to enter the CPU name, with error handling. Then it searches
	 *  the array of the CPU and return a JOptionPane of the computers with that same CPU.
	 */

	public static void displayCPU() {
		String title = String.format(
				"%-25s%-20s%-10s%-10s%-25s%-20s%-20s%-20s", "Manufacturer",
				"Model name", "Memory", "Disk", "CPU type", "Optical drive",
				"OS version", "Retail price");
		String line = ("----------------------------------------------------------------------------------------------------------------------------------------------\n");
		String combine = title + "\n" + line;

		String cpu = JOptionPane.showInputDialog(null,
				"Enter the processor type.",
				"Geekazoid Inc. Computer Inventory", JOptionPane.PLAIN_MESSAGE);
		if (cpu == null) {
			choice();
		}
		String newcpu = cpu.toLowerCase();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if ((array[i].getCPU().toLowerCase().indexOf(newcpu)) != -1) {
					combine += array[i].toString() + "\n";
				}
			}
		}
		JOptionPane.showMessageDialog(null,
				"Computers with CPU field that contains: " + cpu + "\n\n"
						+ combine, "Geekazoid Inc. Computer Inventory",
				JOptionPane.PLAIN_MESSAGE);
	}
	/**
	 *  This method formats the data in the text file into a string called title. Then I create a string
	 *  called line,then combine the two. Then combine my string and the array of data and display all of the data
	 *  to a JOptionPane. Then it asks for the user to enter the price. I put the string price as a float price. 
	 *  Then compares float with any price in the file that is equal or below that given price. The price numbers are also formated
	 *  in the JOptionPane.
	 */
	public static void displayprice() {
		String title = String.format(
				"%-25s%-20s%-10s%-10s%-25s%-20s%-20s%-20s", "Manufacturer",
				"Model name", "Memory", "Disk", "CPU type", "Optical drive",
				"OS version", "Retail price");
		String line = ("----------------------------------------------------------------------------------------------------------------------------------------------\n");
		String combine = title + "\n" + line;

		String price = JOptionPane.showInputDialog(null, "Enter the price.",
				"Geekazoid Inc. Computer Inventory", JOptionPane.PLAIN_MESSAGE);
		float newprice = Float.parseFloat(price);
		if (price == null) {
			choice();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if ((array[i].getPrice()) <= Float.parseFloat(price)) {
					combine += array[i].toString() + "\n";
				}
			}
		}
		DecimalFormat fmt = new DecimalFormat("####.00");
		JOptionPane.showMessageDialog(null,
				"Computers with price at or below: " + "$" + fmt.format(newprice) + "\n\n"
						+ combine, "Geekazoid Inc. Computer Inventory",
				JOptionPane.PLAIN_MESSAGE);
	}
}
