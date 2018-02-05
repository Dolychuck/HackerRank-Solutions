import java.util.Scanner;

/**
 * Solution to edit distance problem from HackerRank
 * @author Dustin Olychuck
 * @version 5/2/2018
 *
 */
public class EditDistance {
	
	/**
	 * Calculates the Edit distance.
	 * @param str1 The first string.
	 * @param str2 The second string.
	 * @return The number of edits to make strings equal.
	 */
    public static int edit(String str1, String str2) {
		int n = str1.length() + 1;
		int m = str2.length() + 1;
		int[][] table = new int[n][m];
		int i;
		int j;

		for (i = 0; i < n; i++) {
			table[i][0] = i;
		}
		for (i = 0; i < m; i++) {
			table[0][i] = i;
		}

		for (i = 1; i < n; i++) {
			for (j = 1; j < m; j++) {
				if (str1.charAt(i - 1) != str2.charAt(j - 1)) {
					table[i][j] = 1 + Math.min(Math.min(table[i - 1][j], table[i][j - 1]), table[i - 1][j - 1]);
				} else {
					table[i][j] = table[i - 1][j - 1];
				}
			}
		}
		return table[n - 1][m - 1];
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println(edit(sc.next(),sc.next()));
        }
    }
}