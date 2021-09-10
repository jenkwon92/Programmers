package level01_07_02_String;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Solution solution = new Solution();
		boolean answer = solution.solution(s);
		System.out.println(answer);
		sc.close();
	}
}
