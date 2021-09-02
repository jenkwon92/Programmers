package level01_05_02_CaesarCipher;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String s =scanner.nextLine();
		int n = scanner.nextInt();
		
		Solution2 solution = new Solution2();
		//StringBuilder answer = solution.solution(s, n);
		String answer = solution.solution(s, n);
		scanner.close();
		System.out.println(answer);
		
	}
	
}
