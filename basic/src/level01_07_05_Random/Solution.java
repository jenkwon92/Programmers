package level01_07_05_Random;

import java.util.Arrays;

public class Solution {
	public String[] solution(String[] strings, int n) {
		/*
		 * ���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. 
		 * ���� ��� strings�� ["sun", "bed", "car"]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� "u", "e", "a"�� strings�� �����մϴ�.
		 * 
		strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
		strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
		strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
		��� strings�� ������ ���̴� n���� Ů�ϴ�.
		�ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
		 */
		String[] answer = {};
		char [] c = {};
		for(int i=0; i<strings.length; i++) {
			c[i] =strings[i].charAt(n);
			System.out.println(c[i]);
			Arrays.sort(c);
		}
		
		
		return answer;
	}

}
