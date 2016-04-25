import java.util.*;

public class Q118PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		
		if (numRows < 1) {
			return ans;
		}
		
		List<Integer> firstRow = new ArrayList<Integer>();
		firstRow.add(1);
		ans.add(firstRow);
		
		if (numRows == 1) {
			return ans;
		}
		List<Integer> secondRow = new ArrayList<Integer>();
		secondRow.add(1);
		secondRow.add(1);
		ans.add(secondRow);

		int i = 3;
		while (i <= numRows) {
			List<Integer> row = new ArrayList<Integer>();
			row.add(1);
			for (int j = 1; j <= i - 2; j++) {
				int tmp = ans.get(i - 2).get(j - 1) + ans.get(i - 2).get(j);
				row.add(tmp);
			}
			row.add(1);
			ans.add(row);
			i++;
		}
		
		return ans;
	}
}
