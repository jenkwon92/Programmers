package level01_08_03_Dart;

public class Solution2 {
	public static int solution(String dartResult) {
		int answer = 0;
		String resultChange = dartResult.replace("10", "t"); // 10�� �ɷ��� t�� ��ȯ

		char[] array = resultChange.toCharArray();// �迭�� ������

		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]>=65 || array[i]<=90) {
				
				switch(array[i]) {
					case 'S':
						answer = answer ^1;
						break;
					case 'D':
						answer = answer ^2;
						break;
					case 'T':
						answer = answer ^3;
						break;
				}
			}
		}
		
		return (1^1)+(2^2);
	}
	//unSolved
	// �������̳� *�� ���ð�� ��� �պκп� ������ �߰� ���̳ʽ����ٲ��� 
	public static void main(String[] args) {
		/*
		 * ������ 0���� 10 ������ �����̴�. ���ʽ��� S, D, T �� �ϳ��̴�. �ɼ��� *�̳� # �� �ϳ��̸�, ���� ���� �ִ�.
		 */
		String dartResult = "1S2D*10T";
		int answer = solution(dartResult);
		System.out.println(answer);
	}
}
