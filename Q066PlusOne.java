import java.util.*;

public class Q066PlusOne {
	public int[] plusOne(int[] digits) {
		if (digits == null) {
			int[] ans = {1};
			return ans;
		}
		ArrayList<Integer> tmpAns = new ArrayList<Integer>();
		int carry = 1;
		int val;
		for (int i = digits.length - 1; i >= 0; i--) {
			val = (digits[i] + carry) % 10;
			carry = (digits[i] + carry) / 10;
			tmpAns.add(val);
		}
		if (carry == 1) {
			tmpAns.add(1);
		}
		int[] ans = new int[tmpAns.size()];
		int i = 0;
		for (int j = tmpAns.size() - 1; j >= 0; j--) {
			ans[i] = tmpAns.get(j);
			i++;
		}
		return ans;
	}
}
