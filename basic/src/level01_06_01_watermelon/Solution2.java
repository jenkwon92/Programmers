package level01_06_01_watermelon;

public class Solution2 {
	public String solution(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) { // i =0 수 i=1 박 i=2 수
			if (i % 2 == 0)
				sb.append("수");
			else
				sb.append("박");
		}
		return sb.toString();
	}
}