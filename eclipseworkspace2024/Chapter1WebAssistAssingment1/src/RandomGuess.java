// Mason Walls 1/14/24 Chapter1 Web Assist Assignment 1

import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,"Think of a number between 1 and 10");
		
		JOptionPane.showMessageDialog(null,"The number is "+(1 + (int)(Math.random() * 10)));

	}

}
