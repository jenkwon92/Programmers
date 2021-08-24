package level01_03_RemoveTheSmallest;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		RemoveTheSmallest_final2 rs = new RemoveTheSmallest_final2();
		//int[] num = { 10 };
		int [] num = {4,3,2,1};
		int[] answer = rs.solution(num);
		System.out.println(Arrays.toString(answer));

	}
}
