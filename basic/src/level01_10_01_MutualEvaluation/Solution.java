package level01_10_01_MutualEvaluation;

import java.util.ArrayList;

public class Solution {
	public String solution(int[][] scores) {
		StringBuilder sb = new StringBuilder();
		String answer = "";
		long max = 0;
		long min=0;
		long sum=0;
		long avg = 0;
		String grade = "";
		//세로로 리스트를 끌어서
		//2 4 6 10 9
		
		int[] num = {2,4,6,10,9, 11};
		
		int max1 = num[0];
		
		for(int a=0; a<num.length; a++) {
			if(max1<num[a])
				max1=num[a];
		}
		System.out.println(max1);
		
		
		
		for(int i=0; i<scores.length; i++) {
			max=scores[0][i];
			min=scores[0][i];
			for(int j=0; j<scores.length; j++) {
				if(i==j) {
					max = Math.max(max, scores[i][j]);
					min = Math.max(min, scores[i][j]);
					sum += scores[i][j];
				}
				
				
				/*
				 * if(scores[i][j] >max || scores[i][j] <min) { avg = sum/(scores.length-1);
				 * if(avg>=90) grade += "A"; else if (avg >= 80) grade += "B"; else if (avg >=
				 * 70) grade += "C"; else if (avg >= 50) grade += "D"; else grade += "F"; }else
				 * { sum += scores[i][j]; avg = sum/(scores.length); if(avg>=90) grade += "A";
				 * else if (avg >= 80) grade += "B"; else if (avg >= 70) grade += "C"; else if
				 * (avg >= 50) grade += "D"; else grade += "F"; }
				 */
				
				
				

				//sb.append(grade);
				//System.out.println(grade);
					
			}
			System.out.println(max);
			System.out.println(min);
			System.out.println(sum);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
		
		Solution solution = new Solution();
		String answer = solution.solution(scores);
		System.out.println(answer);
	}
}
