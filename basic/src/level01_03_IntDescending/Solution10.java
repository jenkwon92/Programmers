package level01_03_IntDescending;

import java.util.Arrays;
import java.util.Collections;

public class Solution10 {
	public long solution(long n) {
		
		String [] array = (n+"").split("");
		//java.util.Collections���� �������ִ� 
		//Collections.reverseOrder()�� �̿��Ͽ� ���������� ���� Comparator ����
		
		Arrays.sort(array, Collections.reverseOrder());
		Arrays.toString(array);
		
		return Long.parseLong(String.join("", array));
	}
	//long���� int ���� �ٲٴ°ͺ��� String���� �ٲ�� ��������?
	// int�� �ٲٸ� �ȵǴ°��� - ���ڰ� �ٿ�ĳ���õǴ°ǰ�?
	// 
}