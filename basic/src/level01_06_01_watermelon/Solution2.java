package level01_06_01_watermelon;

public class Solution2 {
	public String solution(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) { // i =0 �� i=1 �� i=2 ��
			if (i % 2 == 0)
				sb.append("��");
			else
				sb.append("��");
		}
		return sb.toString();
	}
}