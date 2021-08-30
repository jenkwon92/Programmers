package level01_05_03_StringToInt;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		Solution solution = new Solution();
		int answer = solution.solution(s);
		
		scanner.close();
		System.out.println(answer);
	}
}
