package level01_07_04_CountPY;

public class Solution {
	boolean solution(String s) {
		/*
		 * �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False��
		 * return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ����
		 * �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�. ���� ��� s�� "pPoooyY"�� true�� return�ϰ� "Pyy"��� false��
		 * return
		 */
		boolean answer = true;
		;
		String[] str = s.toLowerCase().split("");
		int p_count = 0;
		int y_count = 0;
		
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("p"))
				p_count++;
			if (str[i].equals("y"))
				y_count++;

		}
		if (y_count != p_count)
			answer = false;

		return answer;
	}
}