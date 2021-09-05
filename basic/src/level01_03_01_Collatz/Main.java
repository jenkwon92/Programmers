package level01_03_01_Collatz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Solution solution = new Solution();
		int answer = solution.solution(num);
		System.out.println(answer);
	}
}
