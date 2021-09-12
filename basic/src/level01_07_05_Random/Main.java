package level01_07_05_Random;

public class Main {
	public static void main(String[] args) {
		Solution4 solution = new Solution4();
		//String[] strings = { "sun" ,"bed","car"};
		String[] strings= {"abce", "abcd", "cdx"};
		int n = 2;
		String [] strArray = solution.solution(strings, n);
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
