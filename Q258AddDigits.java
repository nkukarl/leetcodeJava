
public class Q258AddDigits {
	public int addDigits(int num) {
//		This function uses recursion
		if (num >= 0 && num <= 9) {
			return num;
		}
		int ans = 0;
		while (num != 0) {
			ans += num % 10;
			num = num / 10;
		}
		return addDigits(ans);
	}
	
	public int addDigits_opt(int num) {
//		This function returns answer in O(1) time
		if (num % 9 == 0) {
			return 9;
		}
		return num % 9;
	}
}
