package level01_07_04_CountPY;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Solution solution = new Solution();
		System.out.println(solution.solution(s));
		sc.close();
	}
}
