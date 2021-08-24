package level01_03_intDescending;

import java.util.Arrays;

public class Solution {
	public long solution(long n) {
		/*
		 * n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
		 */

		long answer = 0;
		
		//String.valueOf() - �Ķ���Ͱ� null�̸� ���ڿ� "null"�� ���� ��ȯ�Ѵ�.
		String i = String.valueOf(n); // Returns the string representation of the long argument. 
		
		char[] sol = i.toCharArray(); //Converts this string to a new character array
		Arrays.sort(sol);
		
		i = new StringBuilder(new String(sol)).reverse().toString();
		answer = Long.parseLong(i);
		return answer;

	}
}
