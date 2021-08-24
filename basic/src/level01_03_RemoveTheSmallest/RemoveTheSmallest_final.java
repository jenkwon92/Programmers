package level01_03_RemoveTheSmallest;

import java.util.ArrayList;

/*
 * ������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. 
 * ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
 * ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
 */
public class RemoveTheSmallest_final {
	//�̷� �� �ڵ尡 �ƴϿ��� ������ ����� ������
	public int[] solution(int[] arr) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(arr.length ==1) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		int ref = arr[0]; // ���ذ�
		for (int i = 0; i < list.size(); i++) {
			if (ref > arr[i]) {
				ref = arr[i];
			}
		}
		list.remove(list.indexOf(ref)); // �ּҰ� ����

		if (list.size() > 1) {
			answer = new int[list.size()]; // answer �迭 ���� ����
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
		return answer;
	}
}
