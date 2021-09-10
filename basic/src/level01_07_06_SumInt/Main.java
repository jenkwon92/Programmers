package level01_07_06_SumInt;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Solution solution = new Solution();
		long answer = solution.solution(a, b);
		System.out.println(answer);
		sc.close();
	}
}
