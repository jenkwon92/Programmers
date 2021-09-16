package level01_08_02_RemoveConsecutiveNum;

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };

		int[] answer = solution(arr);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

	public static int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] != arr[i]) {
				list.add(arr[i]);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
