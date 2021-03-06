
public class Q169MajorElement {
	public int majorityElement(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int ans = nums[0];
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == ans) {
				count++;
			} else {
				count--;
				if (count < 0) {
					count = 0;
					ans = nums[i];
				}
			}
		}
		return ans;
	}
}
