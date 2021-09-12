package level01_07_05_Random;

public class Main {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		String[] strings = { "sun" ,"bed","car"};
		int n = 1;
		String [] strArray = solution.solution(strings, n);
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
