
public class Q070ClimbingStairs {
	public int climbStairs(int n) {
		if (n <= 2) {
			return n;
		}
		int a = 1;
		int b = 2;
		while (n - 2 != 0) {
			int tmp = a + b;
			a = b;
			b = tmp;
			n--;
		}
		return b;
	}
}
