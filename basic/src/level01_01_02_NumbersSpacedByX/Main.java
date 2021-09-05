package level01_01_02_NumbersSpacedByX;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		int n = sc.nextInt();
		
		long[] answer = solution.solution(x, n);
		System.out.println(Arrays.toString(answer));
		
		
	}
}
