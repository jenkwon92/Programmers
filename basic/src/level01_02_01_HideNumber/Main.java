package level01_02_01_HideNumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String phone_number =null;
		String answer = null;
		
		Scanner sc = new Scanner(System.in);
		phone_number =sc.next();
		
		Solution solution = new Solution();
		answer = solution.solution(phone_number);
		
		System.out.println(answer);
		sc.close();
	}
}
