package level01_03_06_IntDescending;

public class Solution2_bubble {
	public long solution(long n) {
		// String.valueof() �޼ҵ带 ���Ͽ� longŸ���� StringŸ������ ���� ��,
        // String.toCharArray() �޼ҵ带 ���Ͽ� StringŸ���� char[]�� �����Ѵ�.
        char[] arr = String.valueOf(n).toCharArray();
 
        // �ӽ� char����
        char temp = 'a';
        // ���������� ���� ���� ���ġ
        for(int i = arr.length - 1; i > -1; i--) {
            for(int j=0; j < i; j++) {
                if(arr[j] < arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // char[] �� String
        String str = "";
        for(char i : arr) {
            str += i;
        }
        // Long.parseLong()�޼ҵ带 ���Ͽ� String �� LongŸ�� ��ȯ
        return Long.parseLong(str);
    }
}
