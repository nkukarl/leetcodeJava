import java.util.*;

public class Q219ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> summary = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (summary.get(nums[i]) != null) {
				int j = summary.get(nums[i]);
				if (j - i <= k) {
					return true;
				}
			}
			summary.put(nums[i], i);
		}
		return false;
	}
}
