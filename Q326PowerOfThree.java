
public class Q326PowerOfThree {
	public boolean isPowerOfThree(int n) {
		if (n <= 0) {
			return false;
		}
		return Math.pow(3, 19) % n == 0;
	}
}
