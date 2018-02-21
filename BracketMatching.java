import java.util.*;

/**
 * 
 * Solution to Balanced Brackets from hacker rank;
 * 
 * @author Dustin Olychuck
 * @verson 02/21/2018
 *
 */
public class BracketMatching {

	/**
	 * 
	 * @param s
	 *            A string of brackets. eg) {[()]}
	 * @return 'YES' if the brackets are balanced 'NO' if they are not.
	 */
	static String isBalanced(String s) {
		if (s == null || s.isEmpty())
			return "NO";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{')
				stack.push(c);
			else {
				if (!stack.isEmpty()) {
					char top = stack.peek();
					if ((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']'))
						return "NO";
					stack.pop();
				} else {
					return "NO";
				}
			}
		}
		if (stack.isEmpty())
			return "YES";
		return "NO";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			String result = isBalanced(s);
			System.out.println(result);
		}
		in.close();
	}
}
