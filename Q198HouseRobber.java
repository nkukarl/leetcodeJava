
public class Q198HouseRobber {
	public int rob(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);
		}
		
		int a = nums[0];
		int b = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			int tmp = Math.max(a + nums[i], b);
			a = b;
			b = tmp;
		}
		return b;
			
	}
}
