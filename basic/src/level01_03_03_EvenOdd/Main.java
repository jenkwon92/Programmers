package level01_03_03_EvenOdd;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String answer = solution.solution(num);
		System.out.println(answer);
	}
	
}
