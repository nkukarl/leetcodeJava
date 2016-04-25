
public class Q112PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		
		return helper(root, 0, sum);
		
	}
	public boolean helper(TreeNode root, int cur, int sum) {
		if (root == null) {
			return false;
		}
		cur += root.val;
		if (root.left == null && root.right == null) {
			if (cur == sum) {
				return true;
			}
		}
		return helper(root.left, cur, sum) || helper(root.right, cur, sum);
	}
}
