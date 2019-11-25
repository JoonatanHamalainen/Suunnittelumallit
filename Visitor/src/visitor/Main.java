package visitor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		LevelingVisitor visitor = new LevelingVisitor();
		Fighter fighter = new Fighter();
		Tank tank = new Tank();
		Marksman marksman = new Marksman();
		
		while (true) {
        	System.out.println(
        			"1. Level up your Fighter\n"
        			+ "2. Level up your Tank\n"
        			+ "3. Level up your Marksman\n");
        	int choice = s.nextInt();
        	
        	switch(choice) {
        	case 1:
        		System.out.println("\nYou chose to level your Fighter\n");
        		visitor.visit(fighter);
        		break;
        	case 2:
        		System.out.println("\nYou chose to level your Tank\n");
        		visitor.visit(tank);
        		break;
        	case 3:
        		System.out.println("\nYou chose to level your Marksman\n");
        		visitor.visit(marksman);
        		break;
        	default:
        		System.out.println("Not a valid choice!");
        	}
        }
	}

}
