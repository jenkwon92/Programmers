package level01_05_02_CaesarCipher;

public class Solution2 {
	public String solution(String s, int n) {
      	StringBuilder builder = new StringBuilder();
 
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
 
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch + n);
				if (ch > 'z')
					ch -= 26;
			} else if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + n);
				if (ch > 'Z')
					ch -= 26;
			}
			builder.append(ch);
		}
		return builder.toString();
  }
}
