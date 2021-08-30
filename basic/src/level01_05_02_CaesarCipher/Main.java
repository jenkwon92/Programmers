package level01_05_02_CaesarCipher;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String s =scanner.nextLine();
		int n = scanner.nextInt();
		
		Solution solution = new Solution();
		StringBuilder answer = solution.solution(s, n);
		scanner.close();
		System.out.println(answer);
		
	}
	
}
