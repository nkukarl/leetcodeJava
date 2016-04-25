
public class Q027RemoveElement {
	public int removeElement(int[] nums, int val) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			while (left < right && nums[left] != val) {
				left++;
			}
			while (right > left && nums[right] == val) {
				right--;
			}
			if (left < right) {
				int tmp = nums[left];
				nums[left] = nums[right];
				nums[right] = tmp;
				left++;
				right--;
			}
		}
		if (nums[left] == val) {
			return left;
		}
		return left + 1;
	}
}
