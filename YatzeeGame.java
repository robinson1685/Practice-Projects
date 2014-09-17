import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Project7 - “Yahtzee lite” game using the GUI development techniques that we have studied in class. In 
	this version of Yahtzee, the player rolls five dice to try to make one of thirteen possible combinations. The game 
	consists of thirteen rounds with three dice rolls per round. In each round the player first rolls all five dice, then picks the 
	dice to keep, then rolls the remaining dice a second time. The player again picks the dice to keep, and then rolls the 
	remaining dice a third time. After the third roll, the player marks a valid combination on the score sheet and then moves 
	to the next round.
	
	These are scores related to the dice:
	Ones: the number of 1s rolled 
	Three-of-a-kind:30 points (three dice the same) 
	Twos: 2 times the number of 2s
	 rolled Four of a kind: 40 points (four dice the same) 
	Threes: 3 times the number of 3s
	 rolled Full House: 25 points (three of a kind and a pair) 
	Fours: 4 times the number of 4s 
	rolled Small Straight: 30 points (four numbers in sequence) 
	Fives: 5 times the number of 5s
	 rolled Large straight: 40 points (five numbers in sequence) 
	Sixes: 6 times the number of 6s rolled
	 Yahtzee 50 points (all five dice the same) 
	 Chance 20 points (any combination of dice) 

	If the user selects Roll it will roll the dice, if the user selects new game it will
	reset the paramaters, and if the user selects quit the game would game.
 * 
 * @author Mark Robinson
 * @Date April 22
 *
 */
public class Project7 {

	private static JLabel enter;
	private static JLabel enter1;

	private static int rand1;
	private static int rand2;
	private static int rand3;
	private static int rand4;
	private static int rand5;

	private static JButton button1;
	private static JButton button2;
	private static JButton button3;
	private static JButton button4;
	private static JButton button5;

	private static JLabel roll;
	private static JLabel numberrollround;

	private static JCheckBox one;
	private static JCheckBox twos;
	private static JCheckBox threes;
	private static JCheckBox fours;
	private static JCheckBox fives;
	private static JCheckBox sixes;
	private static JCheckBox threekind;
	private static JCheckBox fourkind;
	private static JCheckBox full;
	private static JCheckBox smstraight;
	private static JCheckBox larstraight;
	private static JCheckBox chance;
	private static JCheckBox yahteez;
	private static JCheckBox none;
	private static JLabel score;
	private static JLabel label;

	private static int incrementroll;
	private static int incrementround;;

	private static JButton answerone;
	private static JButton answertwo;
	private static JButton answerthree;

	private static JLabel winner;
	private static boolean over;
	private static boolean unsave1;
	private static boolean unsave2;
	private static boolean unsave3;
	private static boolean unsave4;
	private static boolean unsave5;

	private static int points = 0;

	private static JCheckBox save1;
	private static JCheckBox save2;
	private static JCheckBox save3;
	private static JCheckBox save4;
	private static JCheckBox save5;

	public static void main(String[] args) {

		myFrame();
	}

	public static void myFrame() {

		JFrame frame = new JFrame("YAHTZEE"); // Creates the title of the Window
		JPanel dice = new JPanel();

		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setSize(560, 410);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jlblName = new JLabel("YAHTZEE lite");
		jlblName.setFont(new Font("Monotype Corsiva", 1, 32)); // Changes the
																// font
		frame.add(jlblName);
		dice.setLayout(new GridLayout(2, 5));
		label = new JLabel("Select the dice to save and press ROLL");

		// Buttons of the Game
		button1 = new JButton("             -           ");
		button2 = new JButton("             -           ");
		button3 = new JButton("             -           ");
		button4 = new JButton("             -           ");
		button5 = new JButton("             -           ");

		enter = new JLabel(
				"                                                                                                                                                                                                                                                            , Jscore.CENTER");
		enter1 = new JLabel(
				"                                                                                                                                                                                                                                                           , Jscore.CENTER ");
		winner = new JLabel("");

		// Add the buttons
		dice.add(button1);
		dice.add(button2);
		dice.add(button3);
		dice.add(button4);
		dice.add(button5);

		// Add dice to the frame
		incrementroll = 0;
		incrementround = 0;
		frame.add(dice);

		// The sentence that tells the roll and the round number
		numberrollround = new JLabel("Roll " + (incrementroll + 1) + " Round "
				+ (incrementround + 1) + " of 13");
		Font font = new Font("Monotype Corsiva", 1, 20);
		numberrollround.setFont(font);

		// Keep Dice
		save1 = new JCheckBox("Keep     ");
		save2 = new JCheckBox("Keep     ");
		save3 = new JCheckBox("Keep     ");
		save4 = new JCheckBox("Keep     ");
		save5 = new JCheckBox("Keep");

		// Add keep dice
		dice.add(save1);
		dice.add(save2);
		dice.add(save3);
		dice.add(save4);
		dice.add(save5);
		frame.add(dice);

		// Decision button
		JPanel choice = new JPanel(new GridLayout(1, 3));
		answerone = new JButton("                  ROLL               ");
		answertwo = new JButton("               New Game              ");
		answerthree = new JButton("               Quit                ");
		choice.add(answerone);
		choice.add(answertwo);
		choice.add(answerthree);
		frame.add(choice);

		
		// How to roll to a next round
		roll = new JLabel("\nPress ROLL to start the next round", JLabel.CENTER);

		frame.add(roll);
		frame.add(enter);
		frame.add(enter1);
		frame.add(numberrollround);

		// Score grid
		JPanel option = new JPanel(new GridLayout(5, 3));
		TitledBorder titledboarder = new TitledBorder("Score Sheet");
		option.setBorder(titledboarder);
		threekind = new JCheckBox("Three of a kind (30)");
		fourkind = new JCheckBox("Four of a kind (40)");
		full = new JCheckBox("Full House(25)");
		smstraight = new JCheckBox("Small Straight (30)");
		larstraight = new JCheckBox("Large Straight (40)");
		chance = new JCheckBox("Chance (20)");
		yahteez = new JCheckBox("Yahtzee (50)");
		none = new JCheckBox("None (0)");
		one = new JCheckBox("Ones (1xN)");
		twos = new JCheckBox("Twos (2xN)");
		threes = new JCheckBox("Threes (3xN)");
		fours = new JCheckBox("Fours (4xN)");
		fives = new JCheckBox("Fives (5xN)");
		sixes = new JCheckBox("Sixes (6xN)");
		score = new JLabel("Score 0");

		// Add the scores to the options grid
		option.add(one);
		option.add(twos);
		option.add(threes);
		option.add(fours);
		option.add(fives);
		option.add(sixes);
		option.add(threekind);
		option.add(fourkind);
		option.add(full);
		option.add(smstraight);
		option.add(larstraight);
		option.add(chance);
		option.add(yahteez);
		option.add(none);
		option.add(score);

		//Disable the option grid
		one.setEnabled(false);
		twos.setEnabled(false);
		threes.setEnabled(false);
		fours.setEnabled(false);
		fives.setEnabled(false);
		sixes.setEnabled(false);
		threekind.setEnabled(false);
		fourkind.setEnabled(false);
		full.setEnabled(false);
		smstraight.setEnabled(false);
		larstraight.setEnabled(false);
		chance.setEnabled(false);
		yahteez.setEnabled(false);
		none.setEnabled(false);
		score.setEnabled(false);
		frame.add(option);

		// Recieves action for event

		Yahtzee listener = new Yahtzee();
		answerone.addActionListener(listener);
		answertwo.addActionListener(listener);
		answerthree.addActionListener(listener);
		one.addActionListener(listener);
		threes.addActionListener(listener);
		fours.addActionListener(listener);	
		fives.addActionListener(listener);	
		sixes.addActionListener(listener);	
		threekind.addActionListener(listener);	
		fourkind.addActionListener(listener);	
		full.addActionListener(listener);	
		smstraight.addActionListener(listener);	
		larstraight.addActionListener(listener);	
		chance.addActionListener(listener);
		yahteez.addActionListener(listener);	
		none.addActionListener(listener);	
		
		
		// Sets the frame to be visible and location to be centers 
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
/**
 * This method has no paramaters but creates 5 random numbers that range from 1-6 and saves them to the buttons.
 */
	public static void randomgenerater()

	{
		//Generates a random number
		rand1 = (int) ((Math.random() * 10) % 6) + 1;
		rand2 = (int) ((Math.random() * 10) % 6) + 1;
		rand3 = (int) ((Math.random() * 10) % 6) + 1;
		rand4 = (int) ((Math.random() * 10) % 6) + 1;
		rand5 = (int) ((Math.random() * 10) % 6) + 1;

		if (save1.isSelected() || unsave1)
			button1.setText("           " + String.valueOf(rand1)
					+ "           ");
		if (!save2.isSelected() || unsave2)
			button2.setText("           " + String.valueOf(rand2)
					+ "            ");
		if (!save3.isSelected() || unsave3)
			button3.setText("           " + String.valueOf(rand3)
					+ "           ");
		if (!save4.isSelected() || unsave4)
			button4.setText("           " + String.valueOf(rand4)
					+ "           ");
		if (!save5.isSelected() || unsave5)
			button5.setText("           " + String.valueOf(rand5)
					+ "           ");
	}
/**
 * This class implements ActionListener which enables any actions for the game to change
 * @author Mark
 *
 */
	public static class Yahtzee implements ActionListener {

		/**
		 * This turns off all of the choices in the game
		 */
		public void allOff() {

			threekind.setEnabled(false);
			fourkind.setEnabled(false);
			full.setEnabled(false);
			smstraight.setEnabled(false);
			larstraight.setEnabled(false);
			chance.setEnabled(false);
			yahteez.setEnabled(false);
			none.setEnabled(false);
			one.setEnabled(false);
			twos.setEnabled(false);
			threes.setEnabled(false);
			fours.setEnabled(false);
			fives.setEnabled(false);
			sixes.setEnabled(false);
			score.setEnabled(true);
		}
/**
 * This turns on all the choices in the game
 */
		public void allon() {

			threekind.setEnabled(true);
			fourkind.setEnabled(true);
			full.setEnabled(true);
			smstraight.setEnabled(true);
			larstraight.setEnabled(true);
			chance.setEnabled(true);
			yahteez.setEnabled(true);
			none.setEnabled(true);
			one.setEnabled(true);
			twos.setEnabled(true);
			threes.setEnabled(true);
			fours.setEnabled(true);
			fives.setEnabled(true);
			sixes.setEnabled(true);
			score.setEnabled(true);

			if (threekind.isSelected()) {
				threekind.setEnabled(false);
			}
			if (fourkind.isSelected()) {
				fourkind.setEnabled(false);
			}
			if (smstraight.isSelected()) {
				smstraight.setEnabled(false);
			}
			if (larstraight.isSelected()) {
				larstraight.setEnabled(false);
			}
			if (chance.isSelected()) {
				chance.setEnabled(false);
			}
			if (yahteez.isSelected()) {
				yahteez.setEnabled(false);
			}
			if (none.isSelected()) {
				none.setEnabled(false);
			}
			if (one.isSelected()) {
				one.setEnabled(false);
			}
			if (twos.isSelected()) {
				twos.setEnabled(false);
			}
			if (threes.isSelected()) {
				threes.setEnabled(false);
			}
			if (fours.isSelected()) {
				fours.setEnabled(false);
			}
			if (fives.isSelected()) {
				fives.setEnabled(false);
			}
			if (sixes.isSelected()) {
				sixes.setEnabled(false);
			}
		}
/**
 * This uncheck all of the options
 */
		public void uncheckAll() {

			threekind.setSelected(false);
			fourkind.setSelected(false);
			full.setSelected(false);
			smstraight.setSelected(false);
			larstraight.setSelected(false);
			chance.setSelected(false);
			yahteez.setSelected(false);
			none.setSelected(false);
			one.setSelected(false);
			twos.setSelected(false);
			threes.setSelected(false);
			fours.setSelected(false);
			fives.setSelected(false);
			sixes.setSelected(false);
			save1.setSelected(false);
			save2.setSelected(false);
			save3.setSelected(false);
			save4.setSelected(false);
			save5.setSelected(false);
		}

		//This starts the action listener
		@Override
		public void actionPerformed(ActionEvent e) {
			Object pick = e.getSource();
			
			if (pick == answerone) {
				roll.setText("Select the dice to save and press ROLL");
				if (incrementroll == 0) {
					unsave1 = true;
					unsave2 = true;
					unsave3 = true;
					unsave4 = true;
					unsave5 = true;
				} 
				else 
				{
					unsave1 = false;
					unsave2 = false;
					unsave3 = false;
					unsave4 = false;
					unsave5 = false;
				}
			
				randomgenerater();
				incrementroll++;
				
				//This is when roll is 3 or greater
				if (incrementroll >= 3) {
					label.setText("Select a box on the score sheet below");
					incrementroll = 0;
					yahteez.setSelected(false);
					answerone.setEnabled(false);
					numberrollround.setText("");
					allon();
				} 
				else
				{
					numberrollround.setText("Roll " + (incrementroll + 1)
							+ " Round " + (incrementround + 1) + " of 13");
				} 
			}
			
			
			else if (pick == larstraight) { //check large straight
				incrementround++;
				points = (points + 40);
				score.setText("Score: " + points);
				over = true;
			} else if (pick == threekind) { // Check 3 kind
				points = (points + 30);
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			} else if (pick == chance) { //Check chance
				points = (points + 20);
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			} else if (pick == fourkind) { //Check four kind
				points = (points + 40);
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			} else if (pick == yahteez) { //Check yahteez
				points = (points + 50);
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			} else if (pick == full) { //Check full
				points = (points + 25);
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			} else if (pick == smstraight) { //check Small Straight
				points = (points + 30);
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			} else if (pick == none) { //check none
				points = (points + 0);
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			} else if (pick == one) { //check 1s
				if (button1.getText().trim().equals("1"))
					points += 1;
				if (button2.getText().trim().equals("1"))
					points += 1;
				if (button3.getText().trim().equals("1"))
					points += 1;
				if (button4.getText().trim().equals("1"))
					points += 1;
				if (button5.getText().trim().equals("1"))
					points += 1;
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			} else if (pick == sixes) { //check 6s
				if (button1.getText().trim().equals("6"))
					points += 6;
				if (button2.getText().trim().equals("6"))
					points += 6;
				if (button3.getText().trim().equals("6"))
					points += 6;
				if (button4.getText().trim().equals("6"))
					points += 6;
				if (button5.getText().trim().equals("6"))
					points += 6;
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			} else if (pick == twos) { //check 2s
				if (button1.getText().trim().equals("2"))
					points += 2;
				if (button2.getText().trim().equals("2"))
					points += 2;
				if (button3.getText().trim().equals("2"))
					points += 2;
				if (button4.getText().trim().equals("2"))
					points += 2;
				if (button5.getText().trim().equals("2"))
					points += 2;
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			} else if (pick == threes) { //check 3s
				if (button1.getText().trim().equals("3"))
					points += 3;
				if (button2.getText().trim().equals("3"))
					points += 3;
				if (button3.getText().trim().equals("3"))
					points += 3;
				if (button4.getText().trim().equals("3"))
					points += 3;
				if (button5.getText().trim().equals("3"))
					points += 3;
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			} else if (pick == fours) { //check 4s
				if (button1.getText().trim().equals("4"))
					points += 4;
				if (button2.getText().trim().equals("4"))
					points += 4;
				if (button3.getText().trim().equals("4"))
					points += 4;
				if (button4.getText().trim().equals("4"))
					points += 4;
				if (button5.getText().trim().equals("4"))
					points += 4;
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			} else if (pick == fives) { //check 5s
				if (button1.getText().trim().equals("5"))
					points += 5;
				if (button2.getText().trim().equals("5"))
					points += 5;
				if (button3.getText().trim().equals("5"))
					points += 5;
				if (button4.getText().trim().equals("5"))
					points += 5;
				if (button5.getText().trim().equals("5"))
					points += 5;
				incrementround++;
				score.setText("Score: " + points);
				over = true;
			}
			else if (pick == answertwo) { //new game
				points = 0;
				incrementroll = 0;
				incrementround = 0;
				uncheckAll();
				over = true;
			}
			else if (pick == answerthree) { //quit
				System.exit(0);
			} 
			//Resets the game
			if (over) {
				allOff();
				incrementroll = 0;
				if (incrementround == 13) {
					answerone.setEnabled(false);
					roll.setText("Game over, press New Game or Quit");
					numberrollround.setText("Game Over");
				} else {
					answerone.setEnabled(true);
					;
					numberrollround.setText("Roll " + (incrementroll + 1) + " Round "
							+ (incrementround + 1) + " of 13");
				}
				over = false;
			}
			
			//Creates a string that displays yateez
			String string1 = button1.getText().trim(), string2 = button2.getText().trim(), string3 = button3.getText().trim(),
			         string4 = button4.getText().trim(), string5 = button5.getText().trim();
			//Check to see if user gets yahtzee
			if (string1.equals(string2) && string2.equals(string3)
					&& string3.equals(string4) && string4.equals(string5)) {
				winner.setText("YAHTZEE");
			}
		}
	}
}
