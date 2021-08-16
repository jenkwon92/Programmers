package level01.Average;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int col = 0;
		double answer=0;
		
		Scanner sc = new Scanner(System.in);
		col = sc.nextInt();
		int[] arr = new int[col];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Solution solution = new Solution();
		answer = solution.solution(arr);
		System.out.println(answer);
		    
	}
}
