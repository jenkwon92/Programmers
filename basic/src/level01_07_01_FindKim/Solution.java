package level01_07_01_FindKim;

public class Solution {
	public String solution(String[] seoul) {
		int x =0;
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim"))
        		x =i;
        }
        return "�輭���� "+x+"�� �ִ�";
	}
}
