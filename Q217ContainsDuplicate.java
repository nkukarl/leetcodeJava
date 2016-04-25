import java.util.*;

public class Q217ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> tmp = new HashSet<Integer>();
		for (int n : nums) {
			if (tmp.contains(n)) {
				return true;
			}
			tmp.add(n);
		}
		return false;
	}
}
