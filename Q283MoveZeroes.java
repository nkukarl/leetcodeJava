
public class Q283MoveZeroes {
	public void movingZeros(int[] nums) {
		int i = 0;
		int j = 0;
		while (i < nums.length) {
			if (nums[i] != 0) {
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
				j ++;
			}
			i++;
		}
	}
}
