import java.util.Scanner;

/**
 * Solution to HackerRank max sub array problem.
 * @author Dustin Olychuck
 * @version 4/2/2018
 *
 */
public class MaxSubArray_Solution {

	/**
	 * 
	 * @param arr
	 *            An array of integers either positive or negative.
	 * @return A two element array with index 0 the max sub array and index 1
	 *         the max total sum
	 */
	static int[] maxSubarray(int[] arr) {
		int result[] = new int[2];
		int curMax = 0;
		int maxValue = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				result[1] += arr[i];
			if ((arr[i] + curMax) > 0) {
				curMax += arr[i];
				result[0] = Math.max(curMax, result[0]);
			} else {
				curMax = 0;
			}
			maxValue = Math.max(maxValue, arr[i]);
		}
		if (maxValue < 0) {
			result[0] = maxValue;
			result[1] = maxValue;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int arr_i = 0; arr_i < n; arr_i++) {
				arr[arr_i] = in.nextInt();
			}
			int[] result = maxSubarray(arr);
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
			}
			System.out.println("");

		}
		in.close();
	}
}