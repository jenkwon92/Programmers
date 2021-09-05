package level01_03_IntDescending;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Solution10 solution = new Solution10();
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long answer = solution.solution(n);
		System.out.println(answer);
		
		sc.close();
	}
}
