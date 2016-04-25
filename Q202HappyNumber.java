import java.util.*;
public class Q202HappyNumber {
	public boolean isHappy(int n) {
		HashSet<Integer> tmp = new HashSet<Integer>();
		if (n == 1) {
			return true;
		}
		while (true) {
			n = helper(n);
			if (n == 1) {
				return true;
			}
			if (tmp.contains(n)) {
				return false;
			}
			tmp.add(n);
		}
	}
	public int helper(int n) {
		int ans = 0;
		while (n != 0) {
			ans += Math.pow(n % 10, 2);
			n /= 10;
		}
		return ans;
	}
}
