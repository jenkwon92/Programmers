package level01_07_02_String;

public class Solution {
	public boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) {
			char[] charArray = s.toCharArray();
			for (int i = 0; i < charArray.length; i++)
				if (charArray[i] > 57)
					return false;
			return true;
		} else {
			return false;
		}
	}
}
