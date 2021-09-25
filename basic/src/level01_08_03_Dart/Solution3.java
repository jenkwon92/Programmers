package level01_08_03_Dart;

public class Solution3 {
	public static int solution(String dartResult) {
		int answer = 0;
		int num =0;
		int index =0; //�ε���
		
		String resultChange = dartResult.replace("10", "t"); // 10�� �ɷ��� t�� ��ȯ
		
		int[] score = new int[3]; //3���� ��ȸ�� �ִ� �����̴ϱ� �߶� ���
		
		for(int i=0; i< resultChange.length(); i++) {
			char c = resultChange.charAt(i);
			if((Character.isDigit(c))) {
				num=0;
				if(c=='t') {
					num =10; // t �ϰ�� ���� 10���� �纯ȯ
					i++;
				}else {
					num = Character.getNumericValue(c); //char ���� int������ ��ȯ
				}
			}else {
				switch(c) {
					case 'S':
						score[index++] = (int) Math.pow(num, 1); //�ڹ�: ���� �Լ� Math.pow() //score ����� �ڿ��� index�� �ڷ� �ٲ������
						break;
					
					case 'D':
						score[index++] = (int) Math.pow(num, 2);
						break;
						
					case 'T':
						score[index++] = (int) Math.pow(num, 3);
						break;
						
					case '*':
						
						break;
						
					case '#':
						break;
				}
			}
			
			
			
			
		}
		
	
		
		
		return answer;
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
