package level01_04_IntReverseToArray;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public int[] solution(long n) {
		/*�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.*/
		
		int[] answer = {};
		long num = n;
		String[] arrayNum = (num+"").split("");
		Arrays.sort(arrayNum, Collections.reverseOrder());
		(Long.parseLong)Arrays.toString(arrayNum);
		
		
		
		return answer;
	}
}
