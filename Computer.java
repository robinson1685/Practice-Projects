package Project4; 
import java.awt.*;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.plaf.FontUIResource;
 
/** 
 * COP 3503: Project 5 – Computer Class 
 * <p> 
 * This class has methods for the manufacturer, model, memory, diskspace, cpu, optical, system, and price, to set and get the number that is either being changed/evaluated
 * or has nothing changed. The computer class has all of these parts, at first set to null, none, or 0.
 * Memory cannot be less than 2 GB or it will be set to 2 GB and display an error message.
 * Disksize cannot be less than 250 GB or it will be set to 250 GB and display an error message.  
 * Price cannot equal to or getter than $299.99 or it will be set to $299.99 and display an error message.
 * This program inputs two separate computers and outputs them to an organized Joptionalpane and console output.
 * Lastly this program combines the two computers and gives a brief output of all the user entered data.
 * 
 * 
 * @author Mark Robinson
 * @version the date you last modified the program 
 */ 


public class Computer {

	private String manufacturer;
	private String model;
	private int memory;
	private int diskspace;
	private String CPU;
	private String optical;
	private String system;
	private float price;

	/**
	 * The computer class inputs the manufacturer, model, memory, diskspace, cpu, optical, system, and price, as a private class, that is either string , float, or int.
	 */

	
	Computer()
	{
		manufacturer = "None";
		model = "None";
		memory = 0;
		diskspace = 0;
		system = "null";
		price = (float) 0.00;
	}
	/**
	 * 
	 * @param manufacturer set to none
	 * @param model set to  none
	 * @param memory set to 0
	 * @param diskspace set to 0
	 * @param System set to null
	 * @param price set to 0
	 * This is a blank class due to inheritance so they can be fulled with variables to be used like an object
	 */
	
	Computer(String manufacturer, String model, int memory, int diskspace, String CPU, String optical, String System, float price)
	{
		this.manufacturer = manufacturer;
		this.model = model;
		this.memory = memory;
		this.diskspace = diskspace;
		this.CPU = CPU;
		this.optical = optical;
		this.system = System;
		this.price = price;
	}
	
	/**
	 * 
	 * @param sets the name for manufacturer
	 */
	public void setManufactrer(String maufacture)
	{
		manufacturer = maufacture;
	}	
	
	/**
	 * 
	 * @param sets the name for the model
	 */
	public void setModel(String mod)
	{
		model = mod;
	}
	
	/**
	 * sets the name for the memore and does error checking for the size
	 * @param mem
	 */
	public void setMemory(int mem)
	{
		memory = mem;
		
		if (memory < 2)
		{
			memory = 2;
			JOptionPane.showMessageDialog ( 
			null, "Invalid Memory Size Entered: " + mem + " GB"
			+ "\nSetting memory size to " + memory + " GB", "Error", JOptionPane.ERROR_MESSAGE); 
		}
		
	}
	/**
	 * does error checking for the disk and sets the name for the disk
	 * @param disk
	 */
	
	public void setDisk(int disk)
	{
		diskspace = disk;
		javax.swing.UIManager.put("OptionPane.messageFont",
				new FontUIResource(new Font("Courier New", Font.BOLD, 16)));
		if(diskspace < 250)
		{
			diskspace = 250;
			JOptionPane.showMessageDialog ( 
					null, "Invalid Disk Size Entered: " + disk + " GB"
					+ "\nSetting disk size to " + diskspace + " GB", "Error", JOptionPane.ERROR_MESSAGE); 
		}
	}
	
	/**
	 * sets the name for the cpu
	 * @param newCPU
	 */
	public void setCPU(String newCPU)
	{
		CPU = newCPU;
	}
	
	/**
	 * sets the name for the optical
	 * @param optic
	 */
	public void setOptical(String optic)
	{
		optical = optic;
	}
	/**
	 * sets the name for the system
	 * @param os
	 */
	
	public void setsystem(String os)
	{
		system = os;
	}
	/**SetRetailPrice
	 * sets the number for the price, changes the font to courier ew, bold, 16, formats the price to currency and checks to make price equal to 299.99 if less than that number
	 * @param newPrice
	 */
	
	public void setRetailPrice(float newPrice)
	{
		price = newPrice;
		javax.swing.UIManager.put("OptionPane.messageFont",
				new FontUIResource(new Font("Courier New", Font.BOLD, 16)));
		if (price < 299.99)
		{
			price = (float) 299.99;
			JOptionPane.showMessageDialog ( 
					
					null, "Invalid Price Entered: " + NumberFormat.getCurrencyInstance().format(newPrice) 
					+ "\nSetting Price to " + NumberFormat.getCurrencyInstance().format(price), "Error", JOptionPane.ERROR_MESSAGE); 
		}

	}
	/**
	 * getManufacturer
	 * This returns manufacturer
	 * @return manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/** setManufactutrer
	 * This sets the data for manufacturer
	 * @param manufacturer
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**getDiskspace
	 * This returns the data for diskspace
	 * @return diskspace
	 */
	public int getDiskspace() {
		return diskspace;
	}
	
	/**setDiskspace
	 * This sets the data from diskspace to diskspace
	 * @param diskspace
	 */
	public void setDiskspace(int diskspace) {
		this.diskspace = diskspace;
	}
	/**getSystem
	 * This method returns system
	 * @return system
	 */
	public String getSystem() {
		return system;
	}

	/**
	 * setSystem
	 * this method this the price
	 * @param system
	 */
	public void setSystem(String system) {
		this.system = system;
	}
	
	/**
	 * setPrice
	 * float class that sets the price
	 */

	public float getPrice() {
		return price;
	}
	/**
	 * getModel
	 * string class that returns model
	 */

	public String getModel() {
		return model;
	}
	/**
	 * getMemory
	 * int class that returns memory
	 */
	public int getMemory() {
		return memory;
	}
	/**
	 * getCPU
	 * string class that returns cpu
	 */
	public String getCPU() {
		return CPU;
	}
	/**
	 * String class that returns optical
	 * @return optical
	 */
	public String getOptical() {
		return optical;
	}
	
	/** DisplayComputer
	 * This changes the font to Courier New, Bold, 16, and shows a joptionpane that tells the computers parts for Geekazoid Inc
	 */
	
	public void displayComputer()
	{
		javax.swing.UIManager.put("OptionPane.messageFont",
				new FontUIResource(new Font("Courier New", Font.BOLD, 16)));
		JOptionPane.showMessageDialog(null, "Inventory Computer Detail\n\n" + 
				"Manufacturer:  " +  manufacturer + "\nModel Name:    " + model +
				"\nMemory Size:   " + memory + " GB" + "\nDisk Size:     " + diskspace 
				+  " GB" + "\nCPU Type:      " + CPU + "\nOptical Drive: " + optical 
				+ "\nOS Version:    " + system + "\nRetail Price:  " + NumberFormat.getCurrencyInstance().format(price), "Geekazoid Inc.", JOptionPane.INFORMATION_MESSAGE); 
	}
	
	/** toString
	 *  This method formats the given specs of the computer with the correct spaces
	 */
	public String toString(){
		return String.format("%-25s%-20s%-10d%-10d%-25s%-20s%-20s$ %10.2f", 
				 manufacturer, model, memory, diskspace, CPU,
				 optical, system, price);
	}

	/**
	 * This method formats the getPrice to be a currency with 2 decimal places to the left.
	 * @param computer
	 * @return the string format of the computer.get of each specification for the computer
	 */
	
	public static String formatComp(Computer computer)
	{
		DecimalFormat fmt = new DecimalFormat("####.00");
		
		return String.format("\n%-25s%-20s%-10s%-10s%-25s%-20s%-20s%-20s", computer.getManufacturer(), computer.getModel(), computer.getMemory(), computer.getDiskspace(),
				computer.getCPU(), computer.getOptical(), computer.getSystem(), fmt.format(computer.getPrice()));	
	}
}
