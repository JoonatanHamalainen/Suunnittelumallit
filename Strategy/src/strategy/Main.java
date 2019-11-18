package strategy;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Tehtävä a

		List<String> alphabet = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L");

		User case1 = new User(new PrintEveryConverter());

		System.out.println(case1.listToString(alphabet));

		User case2 = new User(new PrintEveryOtherConverter());

		System.out.println(case2.listToString(alphabet));

		User case3 = new User(new PrintEveryThirdConverter());

		System.out.println(case3.listToString(alphabet));
	}
}