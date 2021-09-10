package level01_05_01_SumDivisor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = new Solution().solution(n);
		
		System.out.println(answer);
		sc.close();
	}
}
