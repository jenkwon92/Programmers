package level01_06_02_FindPrimeNumber;

import java.util.ArrayList;

public class Solution_RunTimeError2 {
	public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=2; i<=n; i++) {
        		list.add(i);
        	for(int a=2; a<=Math.sqrt(i); a++) {
        		if(i%a == 0)
        			list.remove(a);
        	}
        }
        answer = list.size();
        
        return answer;
    }
}