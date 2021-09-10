package level01_04_02_AddDigit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = sol.solution(n);
		System.out.println(answer);
		sc.close();
	}
}
