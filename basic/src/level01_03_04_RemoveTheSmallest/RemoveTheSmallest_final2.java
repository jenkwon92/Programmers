package level01_03_04_RemoveTheSmallest;

import java.util.ArrayList;

/*
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 */
public class RemoveTheSmallest_final2 {
	//런타임 에러가 난이유는? 배열크기가 넘쳐서?
	public int[] solution(int[] arr) {
		int[] answer = {-1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// arr.length == 1 일경우를 제외한다 
		if(arr.length > 1) {
			
			//list로 arr 값 넣어줌
			for(int i=0; i<arr.length;i++) {
				list.add(arr[i]);
			}
			
			//인데스 0 을 기준 값으로 
			int min = arr[0];
			
			//Math.min(int,int) 사용해서 가장  작은 수 
			for(int i=1; i<arr.length; i++) { //1부터 시작한 이유는 기준값이 인덱스 0
				min = Math.min(min, arr[i]); 
			}
			
			for(int i=0; i<list.size();i++) {
				if(list.get(i) == min) {
					list.remove(i);
				}
			}
			
			answer = new int[list.size()];
			for(int i=0; i<list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
		
		return answer;
	}
}






















