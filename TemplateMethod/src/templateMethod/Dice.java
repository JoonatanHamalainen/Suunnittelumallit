package templateMethod;

import java.io.IOException;

class Dice extends Game {

	 /* Implementation of necessary concrete methods */
	private int die1, die2;
	private boolean end;
	private int winner;
	private int turn;

	 void initializeGame() {
		 turn = 0;
		 end = false;
		 System.out.println("Welcome to Dice!\nEach player takes turns throwing two dice at the same time."
		 		+ "\nThe one who gets two sixes on the same turn first, wins the game and is crowned THE CHAMPION!"
		 		+ "\nGood Luck!");
	 }

	 void makePlay(int player) {
		 player++;
		 turn++;
		 try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 throwDice();
		 System.out.println("Player " + player + " threw " + die1 + " and " + die2);
		 if (die1 == 6 && die2 == 6) {
			 winner = player;
			 end = true;
		 }
	 }

	 boolean endOfGame() {
		return end;
	 }

	 void printWinner() {
		 System.out.println("PLAYER " + winner + " WON!\nThe game lasted " + turn + " turns...\nThanks for playing!!!");
	 }
	 
	 void throwDice() {
		 die1 = (int)(Math.random()*6) + 1;
         die2 = (int)(Math.random()*6) + 1;
	 }
}
