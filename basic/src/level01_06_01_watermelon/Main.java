package level01_06_01_watermelon;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String answer = solution.solution(n);
		sc.close();
		System.out.println(answer);
	}
}
