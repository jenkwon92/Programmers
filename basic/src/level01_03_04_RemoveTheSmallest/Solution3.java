package level01_03_04_RemoveTheSmallest;

import java.util.ArrayList;

public class Solution3 {
	public int[] solution(int[] arr) {
		int[] answer = { -1 };
		ArrayList<Integer> list = new ArrayList<>();

		for (int a : arr) // Arraylist에 복사
			list.add(a);

		int temp = arr[0];
		for (int a : list) { // 최소값 구하기
			if (a < temp) {
				temp = a;
			}
		}
		list.remove(list.indexOf(temp)); // 최소값 제거

		if (list.size() > 1) {
			answer = new int[list.size()]; // Arraylist와 같은 길이의 배열 생성
			for (int i = 0; i < list.size(); i++) { // 복사
				answer[i] = list.get(i);
			}
		}

		return answer;
	}
}

