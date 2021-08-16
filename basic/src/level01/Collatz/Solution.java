package level01.Collatz;

public class Solution {
	public int solution(int num) {
		/*
		 * 1937�� Collatz�� ����� ���� ����� �� ������, 
		 * �־��� ���� 1�� �ɶ����� ���� �۾��� �ݺ��ϸ�, 
		 * ��� ���� 1�� ���� �� �ִٴ� �����Դϴ�. 
		 * �۾��� ������ �����ϴ�.
		 * 
		 * 1-1. �Էµ� ���� ¦����� 2�� �����ϴ�. 
		 * 1-2. �Էµ� ���� Ȧ����� 3�� ���ϰ� 1�� ���մϴ�.
		 * 2. ����� ���� ���� ���� �۾��� 1�� �� ������ �ݺ��մϴ�.
		 */
        int answer = -1;
        int count = 0;
        int x = num;
        boolean flag = true; //¦��
        
        while(count <= 500){
            while(num%2 == 1){
                num = num/2;
                flag = false;
                break;
            }
            
            while(num/2 == 1){
                if(flag == true){
                    while(num/2 == 1){
                     num /= 2;
                        count++;
                        break;
                    }
                }else{
                    num = num*3+1;
                    count++;
                }
                answer = count;
            }
            
        }
        return answer;
    }
}