package level01_06_02_findPrimeNumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Solution_fail solution = new Solution_fail();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = solution.solution(n);
		sc.close();
		System.out.println(answer);
	}
}
