package level01_03_02_GcdAndLcm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution2 solution = new Solution2();
		
		
		int n = sc.nextInt();
		int m =	sc.nextInt();
		
		int[] answer = solution.solution(n, m);
		 
		
		
		System.out.println(Arrays.toString(answer));
		
		
	}
}
