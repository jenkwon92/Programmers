package level01_06_02_FindPrimeNumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Solution_RunTimeError2 solution = new Solution_RunTimeError2();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = solution.solution(n);
		sc.close(); 
		System.out.println(answer);
	}
}
