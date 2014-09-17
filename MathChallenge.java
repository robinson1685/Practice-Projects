import javax.swing.JOptionPane; 

/**
* COP 3503: Project 2 – Math Challenge!
* <p>
*This program will ask the user to choose addition, subtraction, and multiplication by choicing 1,2, or 3.
*The program does error checking by seeing if the user inputed a character or a number less than 1 or 
*greater than 3. Then the program will open a window asking a math question with 2 random numbers in the
*range 1- 9, and the user has to answer the question. After answering the 10 questions, the 
*program will tell the user how many they got correct. 
*into the input. 
*
*
* @author Mark Robinson
* @version January 31, 2014
*/

/*
* Algorithm:
*
*1) Ask the users to pick 1 for Addition, 2 for Subtraction, or 3 for Multiplication.
*2) If the user clicks the X button or Cancel the program will exit.
*3) If the user enters a number greater than 3 or less than 1, the program will play an error message.
*4) If the user enters a string, the program will play an error message.
*5) Once the user picks a math game, the program will ask the user 10 questions from the numbers 1-9.
*6) If the user gets the answer correct, the program will play a correct message.
*7) If the user gets the answer incorrect, the program will play a incorrect message.
*8) Once the user finishes answering the 10 question the program will inform the user how many question the had got right.
*9) The program exits.
*/

public class Project2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int choice;
		int correct = 0;
		int question = 1;

		String st = JOptionPane.showInputDialog( //this saves the string
				 "Take the Math Challenge! \n\n1. Addition\n"
				 + "2.Subtraction\n3. Multiplication \n\n"
				 + "Enter your choice (1-3)");
		choice = Integer.parseInt(st);
		
		if (st == null)
		{
			System.exit(0); //exits the program
		}


		num1 = 1 + (int)(Math.random() * (9-1)); //First random number
		num2 = 1 + (int)(Math.random() * (9-1)); //Second random number
		
		switch (choice) //Switch Statement 
		{
		case 1: for(int count = 0; count < 10; count++) //Addition Challenge
		{
			String st1 = JOptionPane.showInputDialog(null,"Addition Challenge\n\n What is " + num1 + " + " + num2 + "? ", "Question " + question, JOptionPane.QUESTION_MESSAGE);
			int choice1 = Integer.parseInt(st1);
			int choice2 = num1 + num2;
			if (num1 + num2 == choice1)
			{
				JOptionPane.showMessageDialog(null,
						"You got that one",
						"Correct",
						JOptionPane.INFORMATION_MESSAGE);
				correct++;
				num1 = 1 + (int)(Math.random() * (9-1));
				num2 = 1 + (int)(Math.random() * (9-1));
			}
			else
			{
				JOptionPane.showMessageDialog(null,
						"Nope, the answer was "+ choice2,
						"Incorrect",
						JOptionPane.ERROR_MESSAGE);
				num1 = 1 + (int)(Math.random() * (9-1));
				num2 = 1 + (int)(Math.random() * (9-1));
			}
			question++;
		}
		JOptionPane.showMessageDialog(null,
				"Math Challenge results \n\n You answered " + correct + " of 10 questions correctly!",
				"Results",
				JOptionPane.INFORMATION_MESSAGE);
		break;
		case 2: for(int count = 0; count < 10; count++) //Subtraction Challenge
		{
			String st1 = JOptionPane.showInputDialog(null,"Subtraction Challenge\n\n What is " + num1 + " - " + num2 + "? ", "Question " + question, JOptionPane.QUESTION_MESSAGE);
			int choice1 = Integer.parseInt(st1);
			int choice2 = num1 - num2;
			if (num1 - num2 == choice1)
			{
				JOptionPane.showMessageDialog(null,
						"You got that one",
						"Correct",
						JOptionPane.INFORMATION_MESSAGE);
				correct++;
				num1 = 1 + (int)(Math.random() * (9-1));
				num2 = 1 + (int)(Math.random() * (9-1));
			}
			else
			{
				JOptionPane.showMessageDialog(null,
						"Nope, the answer was "+ choice2,
						"Incorrect",
						JOptionPane.ERROR_MESSAGE);
				num1 = 1 + (int)(Math.random() * (9-1));
				num2 = 1 + (int)(Math.random() * (9-1));
			}
			question++;
		}
		JOptionPane.showMessageDialog(null,
				"Math Challenge results \n\n You answered " + correct + " of 10 questions correctly!",
				"Results",
				JOptionPane.INFORMATION_MESSAGE);
		break;
		case 3: for(int count = 0; count < 10; count++) //Multiplication Challenge
		{
			String st1 = JOptionPane.showInputDialog(null, "Multiplication Challenge\n\n What is " + num1 + " x " + num2 + "? ", "Question " + question, JOptionPane.QUESTION_MESSAGE);
			int choice1 = Integer.parseInt(st1);
			int choice2 = num1 * num2;
			if (num1 * num2 == choice1)
			{
				JOptionPane.showMessageDialog(null,
						"You got that one",
						"Correct",
						JOptionPane.INFORMATION_MESSAGE);
				correct++;
				num1 = 1 + (int)(Math.random() * (9-1));
				num2 = 1 + (int)(Math.random() * (9-1));
			}
			else
			{
				JOptionPane.showMessageDialog(null,
						"Nope, the answer was "+ choice2,
						"Incorrect",
						JOptionPane.ERROR_MESSAGE);
				num1 = 1 + (int)(Math.random() * (9-1));
				num2 = 1 + (int)(Math.random() * (9-1));
			}
			question++;
		}
		JOptionPane.showMessageDialog(null,
				"Math Challenge results \n\n You answered " + correct + " of 10 questions correctly!", //Answer
				"Results",
				JOptionPane.INFORMATION_MESSAGE);
		break;
		}
		
	}
		
}
