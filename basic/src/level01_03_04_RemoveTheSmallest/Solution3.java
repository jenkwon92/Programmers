package level01_03_04_RemoveTheSmallest;

import java.util.ArrayList;

public class Solution3 {
	public int[] solution(int[] arr) {
		int[] answer = { -1 };
		ArrayList<Integer> list = new ArrayList<>();

		for (int a : arr) // Arraylist�� ����
			list.add(a);

		int temp = arr[0];
		for (int a : list) { // �ּҰ� ���ϱ�
			if (a < temp) {
				temp = a;
			}
		}
		list.remove(list.indexOf(temp)); // �ּҰ� ����

		if (list.size() > 1) {
			answer = new int[list.size()]; // Arraylist�� ���� ������ �迭 ����
			for (int i = 0; i < list.size(); i++) { // ����
				answer[i] = list.get(i);
			}
		}

		return answer;
	}
}

