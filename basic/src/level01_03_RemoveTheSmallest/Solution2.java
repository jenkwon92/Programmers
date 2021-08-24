package level01_03_RemoveTheSmallest;

public class Solution2 {
	public int[] solution(int[] arr) {
		// �迭�� ���̰� 1�� ��
		if (arr.length <= 1) {
			int[] answer = { -1 };
			return answer;
		}

		// �迭�� ���̰� 1���� Ŭ ��
		// �־��� �迭���� ���� ���� ���� �� ���̷� �ʱ�ȭ
		int[] answer = new int[arr.length - 1];

		// �ϳ��� ���� �������� ��´�.
		int min = arr[0];

		// Math.min(int, int)�Լ��� ����Ͽ�
		// ���� ���� ���� ���Ѵ�.
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}

		// �ݺ��� index��
		int index = 0;

		// ���� ���� ���� ������ �迭 ������ֱ�
		for (int i = 0; i < arr.length; i++) {
			// �迭�� ���� ���� ���� �����
			if (arr[i] == min) {
				// continue�� �̿��Ͽ� �迭�� �־����� �ʰ� �Ѿ��.
				continue;
			}
			answer[index++] = arr[i];
		}

		return answer;
	}

}
