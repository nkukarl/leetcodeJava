
public class Q009PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int len = 0;
		int y = x;
		while (y > 0) {
			y /= 10;
			len++;
		}
		while (len > 1) {
			int tail = x % 10;
			int head = x / (int) Math.pow(10, len - 1);
			if (head != tail) {
				return false;
			}
			x = (x - head * (int) Math.pow(10, len - 1)) / 10;
			len -= 2;
		}
		return true;
	}
}
