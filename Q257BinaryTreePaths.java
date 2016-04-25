import java.util.*;

public class Q257BinaryTreePaths {
//	public List<String> binaryTreePaths(TreeNode root) {
//		List<String> ans = new ArrayList<String>();
//		List<Integer> cur = new ArrayList<Integer>();
//		helper(root, cur, ans);
//		return ans;
//		
//	}
//	public void helper(TreeNode root, List<Integer> cur, List<String> ans) {
//		if (root == null) {
//			return;
//		}
//		if (root.left == null && root.right == null) {
//			cur.add(root.val);
//			String str = list2str(cur);
//			ans.add(str);
//		} else {
//			List<Integer> leftCur = new ArrayList<Integer>();
//			List<Integer> rightCur = new ArrayList<Integer>();
//			for (int i = 0; i < cur.size(); i++) {
//				leftCur.add(cur.get(i));
//				rightCur.add(cur.get(i));
//			}
//			leftCur.add(root.val);
//			rightCur.add(root.val);
//			
//			helper(root.left, leftCur, ans);
//			helper(root.right, rightCur, ans);
//		}
//	}
//	public String list2str(List<Integer> cur) {
//		String ans = "";
//		for (int i = 0; i < cur.size(); i++) {
//			int x = cur.get(i);
//			if (i != cur.size() - 1) {
//				ans += Integer.toString(x) + "->";
//			} else {
//				ans += Integer.toString(x);
//			}
//		}
//		return ans;
//	}
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> ans = new ArrayList<String>();
		String cur = "";
		helper(root, cur, ans);
		return ans;
	}
	public void helper(TreeNode root, String cur, List<String> ans) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			if (cur == "") {
				cur += Integer.toString(root.val);
			} else {
				cur += "->" + Integer.toString(root.val);
			}
			ans.add(cur);
		} else {
			if (cur == "") {
				cur += Integer.toString(root.val);
			} else {
				cur += "->" + Integer.toString(root.val);
			}
			helper(root.left, cur, ans);
			helper(root.right, cur, ans);
		}
	}
}
