package level01_07_05_Random;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public String[] solution(String[] strings, int n) {
		/*
		 * ���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�.
		 * ���� ��� strings�� ["sun", "bed", "car"]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� "u", "e", "a"��
		 * strings�� �����մϴ�.
		 * 
		 * strings�� ���� 1 �̻�, 50������ �迭�Դϴ�. 
		 * strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�. 
		 * strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�. 
		 * ��� strings�� ������ ���̴� n���� Ů�ϴ�. 
		 * �ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
		 */
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < strings.length; i++) {
			list.add(strings[i].charAt(n) + strings[i]);
		}

		Collections.sort(list);

		String[] answer = new String[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).substring(1, list.get(i).length());
		}

		return answer;
	}
}
