
public class Q235LCABST {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (p == null) {
			return q;
		}
		if (q == null) {
			return p;
		}
		if (p.val < root.val && q.val < root.val) {
			return lowestCommonAncestor(root.left, p, q);
		}
		if (p.val > root.val && q.val > root.val) {
			return lowestCommonAncestor(root.right, p, q);
		}
		return root;
	}
}
