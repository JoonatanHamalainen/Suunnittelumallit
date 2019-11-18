package chainOfResponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		Boss boss = new Boss();
		Chief chief = new Chief();
		CEO ceo = new CEO();
		
		boss.setSuccessor(chief);
		chief.setSuccessor(ceo);
		
		// Press Ctrl+C to end.
		try {
		while (true) {
		System.out.println("Enter your current salary");
		System.out.print(">");
		
		double current = Double.parseDouble(new BufferedReader(new
		InputStreamReader(System.in)).readLine());
		
		System.out.println("Enter your salary request");
		System.out.print(">");
		
		double request = Double.parseDouble(new BufferedReader(new
		InputStreamReader(System.in)).readLine());
		boss.handle(current, request);
		}
		} catch(Exception e) {
		System.exit(1);
		}
		}

}
