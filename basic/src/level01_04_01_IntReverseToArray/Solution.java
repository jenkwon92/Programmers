package level01_04_01_IntReverseToArray;

import java.util.Arrays;
import java.util.Collections;
//��Ȯ���� ���� ������? 
//long���̴ϱ� ���ڰ� �߸��� �ʵ��� String���� ��ȯ���־��µ� Ʋ��������?
//intDescending ������ ����� �����ε� �ٸ�������?


// int (-2,147,483,648- 2,147,483,647)
// long 
public class Solution {
	public int[]  solution(long n) {
		/*�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.*/
		
		long num = n;
		String str = Long.toString(num);
		
		String[] array = (str).split(""); //������ �迭�� ������ش��� 
		
		for(int i=0; i<array.length; i++) {
			
			System.out.println(array[i]);
		}
		Arrays.sort(array, Collections.reverseOrder()); //sort������� ���� reverseOrder�̿��� ��������
		//Arrays.toString(array);
		
		int[] answer = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			answer[i] = Integer.parseInt(array[i]);
		}
		return answer;
	}
}
