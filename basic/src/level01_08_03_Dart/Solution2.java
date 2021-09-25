package level01_08_03_Dart;

public class Solution2 {
	public static int solution(String dartResult) {
		int answer = 0;
		String resultChange = dartResult.replace("10", "t"); // 10을 걸러서 t로 변환

		char[] array = resultChange.toCharArray();// 배열로 끊어줌

		
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
	// 아차상이나 *이 나올경우 어떻게 앞부분에 점수를 추가 마이너스해줄껀지 
	public static void main(String[] args) {
		/*
		 * 점수는 0에서 10 사이의 정수이다. 보너스는 S, D, T 중 하나이다. 옵선은 *이나 # 중 하나이며, 없을 수도 있다.
		 */
		String dartResult = "1S2D*10T";
		int answer = solution(dartResult);
		System.out.println(answer);
	}
}
