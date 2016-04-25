import java.util.*;

public class Q102BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		helper(root, 0, ans);
		return ans;
	}
	public void helper(TreeNode root, int level, List<List<Integer>> ans) {
		if (root == null) {
			return;
		}
		if (level < ans.size()) {
			ans.get(level).add(root.val);
		} else {
			List<Integer> row = new ArrayList<Integer>();
			row.add(root.val);
			ans.add(row);
		}
		helper(root.left, level + 1, ans);
		helper(root.right, level + 1, ans);
	}
}
