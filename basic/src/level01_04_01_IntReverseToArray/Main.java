package level01_04_01_IntReverseToArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		Solution solution = new Solution();
		int[] answer = solution.solution(n);

		System.out.println(Arrays.toString(answer));
		sc.close();
	}
}
