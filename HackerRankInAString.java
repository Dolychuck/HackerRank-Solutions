package StringAndArray;

import java.util.*;

/**
 * 
 * Solution to HackerRank in a String! from hacker rank;
 * @author Dustin Olychuck
 * @verson 02/16/2018
 *
 */
public class HackerRankInAString {
	
	/**
	 * 
	 * @param s String being tested whether or not it contains "hackerrank";
	 * @return YES if true and NO if false.
	 */
	static String hackerrankInString(String s) {
		String hack = "hackerrank";
		int m = hack.length() - 1;
		int n = s.length() - 1;

		for (int i = n; i >= 0; i--) {
			if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(hack.charAt(m)))
				m--;
			if (m < 0)
				return "YES";

		}
		return "NO";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			String result = hackerrankInString(s);
			System.out.println(result);
		}
		in.close();
	}
}
