import java.util.*;

public class Q119PascalTriangleII {
	public List<Integer> getRow(int rowIndex) {
		rowIndex++;
		List<Integer> ans = new ArrayList<Integer>();
		if (rowIndex < 1) {
			return ans;
		}
		ans.add(1);
		if (rowIndex == 1) {
			return ans;
		}
		ans.add(1);
		if (rowIndex == 2) {
			return ans;
		}
		int index = 3;
		while (index <= rowIndex) {
			List<Integer> tmp = new ArrayList<Integer>();
			tmp.add(1);
			for (int j = 1; j <= index - 2; j++) {
				tmp.add(ans.get(j - 1) + ans.get(j));
			}
			tmp.add(1);
			ans = tmp;
			index++;
		}
		return ans;
	}
}
