package level01_03_RemoveTheSmallest;

import java.util.ArrayList;

/*
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 */
public class RemoveTheSmallest_final {
	//이런 긴 코드가 아니여도 가능한 방법이 있을까
	public int[] solution(int[] arr) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(arr.length ==1) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		int ref = arr[0]; // 기준값
		for (int i = 0; i < list.size(); i++) {
			if (ref > arr[i]) {
				ref = arr[i];
			}
		}
		list.remove(list.indexOf(ref)); // 최소값 제거

		if (list.size() > 1) {
			answer = new int[list.size()]; // answer 배열 길이 지정
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
		return answer;
	}
}
