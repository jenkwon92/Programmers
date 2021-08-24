package level01_03_GcdAndLcm;

public class Solution2 {
	/*
	 * ��Ŭ���� ȣ���� Euclidean algorithm
	 * 
	 * ��Ŭ���� ȣ���� �Ǵ� ��Ŭ���� �˰������� 2���� �ڿ��� �Ǵ� ������ �ִ������� ���ϴ� �˰������� �ϳ�. ȣ�����̶� �� ���� ���� ����
	 * ���� ����� �ᱹ ���ϴ� ���� ��� �˰������� ��Ÿ��.
	 * 
	 * 
	 * 2���� �ڿ����� �޾� �ִ������� �ޱ� ���� 2���� �� �ڿ��� �� ���� �ڿ������� ��� ������鼭 ���� ū ������� ���� �� �ִ�. ����
	 * ���� ������� ������ Ǯ�� �ð����⵵�� O(N)�� �ȴ�. ���� ����� �ƴ����� ȿ���� ���̱� ���� ��Ŭ���� ȣ�����̶� �˰������� ����ϸ�
	 * �ð����⵵�� O(logN)���� ���� �� �ִ�.
	 * 
	 * 2���� �ڿ��� a, b�� ���ؼ� a�� b�� ���� �������� r�̶� �ϸ� (�� a>b), a�� b�� �ִ������� b�� r�� �ִ������� ����
	 * ������ ����, b�� r�� ���� ������ r0�� ���ϰ�, �ٽ� r�� r0�� ���� �������� ���ϴ� ������ �ݺ��Ͽ� �������� 0�� �Ǿ��� ��
	 * ������ ���� a�� b�� �ִ������̴�
	 * 
	 * GCD(A,B) = GCD(B,A %B) if A%B = 0 -> GCD =B else GCD(B,A%B)
	 * 
	 * 1. �Է����� �� �� m,n(m>n)�� ���´�. 2. n�� 0�̶��, m�� ����ϰ� �˰������� �����Ѵ�. 3. m�� n���� ������
	 * ��������, n�� ����ϰ� �˰������� �����Ѵ�. 4. �׷��� ������, m�� n���� ���� �������� ���Ӱ� m�� �����ϰ�, m�� n�� �ٲٰ�
	 * 3������ ���ƿ´�.
	 * 
	 * public static int gcd(int p, int q) { if (q == 0) return p; return
	 * gcd(q,p%q); }
	 * 
	 * �� �� a, b E Z �̰�, r = a % b �̶�� �Ѵ�. (r �� a�� b�� ���� �������� �ǹ�) �� �� r�� (0 <= r < b)
	 * �̰�, a >= b �̴�. �� �� a �� b�� �ִ������� (a, b)��� �� �� (a, b)�� �ִ������� (b, r)�� �ִ�������
	 * ����. ��, �Ʒ��� ���ٴ� �ǹ̴�. GCD(a, b) = GCD(b, r)
	 */

	/*
	 * �� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������. �迭�� �� �տ� �ִ�����, �״���
	 * �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. ���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)��
	 * [3, 12]�� ��ȯ�ؾ� �մϴ�.
	 */

	public int[] solution(int n, int m) {

		int a = n;
		int b = m;
		
		int gcd= 0;
		
		while( b!=0) {
			int r = a%b;
			a = b;
			b = r;
			gcd =a;
		}
		
		int[] answer = new int[2];
		answer[0] = gcd;
		answer[1] = n * m / answer[0];
		return answer;
	}	
	
	
	/*
	 	public int[] solution(int n, int m) {

		int[] answer = new int[2];
		answer[0] = gcd(n, m);
		answer[1] = n * m / answer[0];
		return answer;
	}

	static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}

	 */
}