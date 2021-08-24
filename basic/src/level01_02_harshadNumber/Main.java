package level01_02_harshadNumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean b;
		Solution sol = new Solution();
		b=sol.solution(x);
	
		System.out.println(b);
	}
	
}
