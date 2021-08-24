package level01_03_SquareRoot_discrimination;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		Solution solution = new Solution();
		long answer = solution.solution(n);
		System.out.println(answer);
		sc.close();
	}
}
