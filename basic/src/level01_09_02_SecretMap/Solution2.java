package level01_09_02_SecretMap;

import java.util.ArrayList;
import java.util.Arrays;

class Solution2 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
	
		ArrayList<String> binaryStringArr1 = new ArrayList<String>();
		ArrayList<String> binaryStringArr2 = new ArrayList<String>();
		String zeroAdd = "";

		for (int i = 0; i < n; i++) {
			binaryStringArr1.add(Integer.toBinaryString(arr1[i]));
			binaryStringArr2.add(Integer.toBinaryString(arr2[i]));
		}
		for (int i = 0; i < n; i++) {
			if (binaryStringArr1.get(i).length() < n) {
				for (int a = 0; a < n - binaryStringArr1.get(i).length(); a++) {
					zeroAdd += "0";
				}
				binaryStringArr1.set(i, zeroAdd + binaryStringArr1.get(i));
				zeroAdd = "";
			}
			if (binaryStringArr2.get(i).length() < n) {
				for (int a = 0; a < n - binaryStringArr2.get(i).length(); a++) {
					zeroAdd += "0";
				}
				binaryStringArr2.set(i, zeroAdd + binaryStringArr2.get(i));
				zeroAdd = "";
			}
			String result = "";
			for (int a = 0; a < n; a++) {
				if (binaryStringArr1.get(i).charAt(a) == '0' && binaryStringArr2.get(i).charAt(a) == '0') {
					result += "2";
				} else {
					result += "#";
				}
			}
			answer[i] += result;
			result = "";
		}
		return answer;
	}



	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		String[] answer = new Solution2().solution(n, arr1, arr2);

		System.out.println(Arrays.toString(answer));

	}

}
