package level01_04_03_WeirdWords;

public class Solution {
	public String solution(String s) {
		/*
		 * ���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. �� �ܾ��� ¦����° ���ĺ���
		 * �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
		 * 
		 * 
		 */
		String answer = "";
		String[] list = s.split("");

		int index = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(" ")) {
				index =0;
			} else if (index % 2 == 0) {
				list[i] = list[i].toUpperCase();
				index++;
			} else if (index % 2 != 0) {
				list[i] = list[i].toLowerCase();
				index++;
			}
			answer += list[i];
		}

		return answer;
	}
}
