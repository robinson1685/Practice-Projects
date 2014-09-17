package Project4; 
import java.util.Scanner; //import for input 
import java.text.NumberFormat; // import that uses numberformat for price

/** 
 * COP 3503: Project 4 – Computer Class Tester 
 * <p> 
 * This is Geekazoid Inc. program to manage all of the computers that are in inventory.
 * This gives: The name of the Computer’s manufacturer (text) ex. Dell Computers Inc.
 * The computer’s model (text) ex. Inspiron 15
 * The amount of memory in the computer (integer number of GB) ex. 8
 * The amount of disk space (integer number of GB) ex. 500
 * The CPU type (text) ex. Intel Core i5
 * The optical dive type (text) ex. CD/DVD+RW
 * The Operating System (text) ex. Windows 8
 * The computer’s retail price (floating point number) ex. 399.99
 * This will be displayed in joptionpane and the console with for two computers. (comp and comp1)
 * @author Mark Robinson 
 * @version the date you last modified the program 
 */ 
public class Project4 {
	
	private static String manufacturer; //Manufacturer name
	private static String model; //Model name
	private static int memory; // Number of memory
	private static int diskspace; // Number of diskspace
	private static String CPU; //CPU name
	private static String optical; // Optical name
	private static String system; // System name 
	private static float price; //Number of price
	static Computer comp = new Computer(); // Computer 1
	static Computer comp1 = new Computer(); // Computer 2


	/* 
	 * Algorithm: 
	 * 
	 * 1)Set my name, computer class tester, and the empty computer object, and another oject with the computer parts
	 * 2) display a empty computer object from joptionpane, set the values to null, 0, or none
	 * 3) open a scanner for the inputs
	 * 4)ask for the the manufacturer, model, memory, diskspace, cpu, optical, system, and price
	 * in the console and display in console and joptionpane
	 * 5) input the values for each part
	 * 6) set each value in a method
	 * 7) return each value in a method
	 * 8) check for memory if less than 2, set to 2
	 *9) check for diskspace if less 250 then set to 250
	 *10) if price is less than 299.99 then set to 299.99
	 *12) repeat for computer 2
	 *13) give a  message displacing the two computers
	 */
		 
	public static void main(String[] args) {
		
		System.out.println("\nCOP3503: Project 4 Mark Robinson"); // prints my name
		System.out.println("\nComputer Class Tester"); 
		System.out.println("\nDisplaying empty Computer object");
		comp.displayComputer(); // displays the zero or null value
		Scanner input = new Scanner(System.in); // first scanner
		Scanner Nextinput = new Scanner(System.in); // second scanner
		
		System.out.println("\nEnter first computer's information");
		System.out.println("-----------------------------------");
		System.out.print("Enter the computer's manufacturer: "); // name of first manaufacturer
		manufacturer = input.nextLine();
		System.out.print("Enter the computer's model name: "); // name of first model
		model = input.nextLine();
		System.out.print("Enter the computer's memory size: "); // memory number
		memory = Nextinput.nextInt();
		System.out.print("Enter the computer's disk size: "); // disk number
		diskspace = Nextinput.nextInt();
		System.out.print("Enter the computer's CPU type: "); // cpu name
		CPU = input.nextLine();
		System.out.print("Enter the computer's optical drive: "); // drive name
		optical = input.nextLine();
		System.out.print("Enter the computer's OS version: "); // operating system name
		system = input.nextLine();
		System.out.print("Enter the computer's retail price: "); // price number
		price = Nextinput.nextFloat();
			
		comp.setManufacturer(manufacturer); //calls method setManufacturer
		comp.setModel(model); //calls method setModel
		comp.setMemory(memory); //calls method setMemory
		comp.setDisk(diskspace); //calls method setDisk
		comp.setCPU(CPU); //calls method setCPU
		comp.setOptical(optical); //calls method setOptical 
		comp.setSystem(system); //calls method set System
		comp.setRetailPrice(price); //calls method setRetailPrice
		
		System.out.println("\nDisplaying filled Computer object");
		comp.displayComputer(); //calls method that displays the results from the inputed data
		
		System.out.println("\nIntormation retieved using get methods");
		System.out.println("\n--------------------------------------");
		System.out.println("\nManufacturer: " + comp.getManufacturer()); // prints out manufacturer name on console
		System.out.println("Model name: " + comp.getModel()); // prints ouf model name on console 
		System.out.println("Memory size: " + comp.getMemory()); // prints of memory number on console 
		System.out.println("Disk size: " + comp.getDiskspace()); // prints of diskspace number on console
		System.out.println("CPU type: " + comp.getCPU()); // prints out CPU name on console
		System.out.println("Optical drive: " + comp.getOptical()); //prints out optical name on console
		System.out.println("OS version: " + comp.getSystem()); // prints of system name on console
		System.out.println("Retail price: " + NumberFormat.getCurrencyInstance().format(comp.getPrice())); // prints out formated retail price with .00 on the end
		
		System.out.println("\nEnter Second computer's information");
		System.out.println("-----------------------------------");
		System.out.print("Enter the computer's manufacturer: ");
		manufacturer = input.nextLine();
		System.out.print("Enter the computer's model name: ");
		model = input.nextLine();
		System.out.print("Enter the computer's memory size: ");
		memory = Nextinput.nextInt();
		System.out.print("Enter the computer's disk size: ");
		diskspace = Nextinput.nextInt();
		System.out.print("Enter the computer's CPU type: ");
		CPU = input.nextLine();
		System.out.print("Enter the computer's optical drive: ");
		optical = input.nextLine();
		System.out.print("Enter the computer's OS version: ");
		system = input.nextLine();
		System.out.print("Enter the computer's retail price: ");
		price = Nextinput.nextFloat();
			
		comp1.setManufacturer(manufacturer);
		comp1.setModel(model);
		comp1.setMemory(memory);
		comp1.setDisk(diskspace);
		comp1.setCPU(CPU);
		comp1.setOptical(optical);
		comp1.setSystem(system);
		comp1.setRetailPrice(price); 
		
		comp1.displayComputer(); // displays information of second computer
		
		System.out.println("Information retrieved using get methods");
		System.out.println("\n--------------------------------------");
		System.out.println("\nManufacturer:  " + comp1.getManufacturer());
		System.out.println("Model name:    " + comp1.getModel());
		System.out.println("Memory size:   " + comp1.getMemory());
		System.out.println("Disk size:     " + comp1.getDiskspace());
		System.out.println("CPU type:      " + comp1.getCPU());
		System.out.println("Optical drive: " + comp1.getOptical());
		System.out.println("OS version:    " + comp1.getSystem());
		System.out.println("Retail price:  " + NumberFormat.getCurrencyInstance().format(comp1.getPrice()));
		
		System.out.println("\n" + comp.getManufacturer() + ": " + comp.getModel() + ": " + comp.getMemory() + ": " + comp.getDiskspace() + ": " + comp.getCPU() + ": " +
				comp.getOptical() + ": " + comp.getSystem() + ": " + NumberFormat.getCurrencyInstance().format(comp.getPrice())); // prints out brief overview of first computer
		System.out.println(comp1.getManufacturer() + ": " + comp1.getModel() + ": " + comp1.getMemory() + ": " + comp1.getDiskspace() + ": " + comp1.getCPU() + ": " +
				comp1.getOptical() + ": " + comp1.getSystem() + ": " + NumberFormat.getCurrencyInstance().format(comp1.getPrice())); // prints out brief overview of second computer
		
		input.close();
		Nextinput.close();
	}
	
}
