

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
	public static void main(String[] args) {

		Stack<Character> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String palinString = sc.nextLine();

		for (int i = 0; i < palinString.length(); i++) {

			Character element = palinString.charAt(i);

				if (stack.contains(element)) {
					
					System.out.println("removed character "+element);
					stack.remove(stack.indexOf(element));
					continue;
				}
			
			stack.push(element);

		}

		System.out.println(
				(stack.size() == 1 || stack.size() == 0) ? "String can be palindrome" : "String cannot be palindrome");

		sc.close();
	}
}
