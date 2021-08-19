package level01;

/*
 * ������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. 
 * ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
 * ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
 */
public class RemoveTheSmallest {
	//��Ÿ�� ������ ��������? �迭ũ�Ⱑ ���ļ�?
	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length-1];
		int min = arr[0];
			
		if(arr.length == 1) {
			arr[0] = -1;
			return arr;
			
		}else {
			//���� ���� ��  ���� min = arr[0] �̱⋚���� 1�ν���
			for(int i=1; i<arr.length; i++) {
				min = Math.min(min, arr[i]);
			}
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != min) {
					answer[i] = arr[i];
				}
			}	
		}
		return answer;
	}
}

