package level01_07_03_StringDesc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Solution solution = new Solution();
		String answer = solution.solution(s);
		System.out.println(answer);
		sc.close();
	}
}
