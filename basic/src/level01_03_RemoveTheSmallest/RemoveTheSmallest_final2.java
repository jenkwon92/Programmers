package level01_03_RemoveTheSmallest;

import java.util.ArrayList;

/*
 * ������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. 
 * ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
 * ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
 */
public class RemoveTheSmallest_final2 {
	//��Ÿ�� ������ ��������? �迭ũ�Ⱑ ���ļ�?
	public int[] solution(int[] arr) {
		int[] answer = {-1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// arr.length == 1 �ϰ�츦 �����Ѵ� 
		if(arr.length > 1) {
			
			//list�� arr �� �־���
			for(int i=0; i<arr.length;i++) {
				list.add(arr[i]);
			}
			
			//�ε��� 0 �� ���� ������ 
			int min = arr[0];
			
			//Math.min(int,int) ����ؼ� ����  ���� �� 
			for(int i=1; i<arr.length; i++) { //1���� ������ ������ ���ذ��� �ε��� 0
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






















