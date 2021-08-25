package level01_04_03_WeirdWords;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		String answer = sol.solution(n);
		System.out.println(answer);
	}
}
