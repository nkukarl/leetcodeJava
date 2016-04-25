import java.util.*;

public class LeetCode {
	public static void main(String[] args) {
//		HelloWorld obj = new HelloWorld();
//		obj.func();
		
//		Q292
//		Q292NimGame obj = new Q292NimGame();
//		for (int i = 0; i < 20; i++) {
//			System.out.println(obj.canWinNim(i));
//		}
		
//		Q258
//		Q258AddDigits obj = new Q258AddDigits();
//		for (int i = 30; i < 50; i++) {
//			System.out.println(obj.addDigits(i));
//			System.out.println(obj.addDigits_opt(i));
//		}
		
//		Q104
//		TreeNode root = new TreeNode(4);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(6);
//		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(3);
//		root.right.left = new TreeNode(5);
//		root.right.right = new TreeNode(7);
//		System.out.println(root.val);
//		System.out.println(root.left.val);
//		System.out.println(root.right.val);
//		Q104MaximumDepthBinaryTree obj = new Q104MaximumDepthBinaryTree();
//		System.out.println(obj.maxDepth(root));
		
//		Q226
//		TreeNode root = new TreeNode(4);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(6);
//		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(3);
//		root.right.left = new TreeNode(5);
//		root.right.right = new TreeNode(7);
//		Q226InvertBinaryTree obj = new Q226InvertBinaryTree();
//		root = obj.invertTree(root);
//		System.out.println(root.val);
//		System.out.println(root.left.val);
//		System.out.println(root.right.val);
//		System.out.println(root.left.left.val);
//		System.out.println(root.left.right.val);
//		System.out.println(root.right.left.val);
//		System.out.println(root.right.right.val);
		
//		Q283
//		Q283MoveZeroes obj = new Q283MoveZeroes();
//		int[] nums = {1, 0, 3, 0, 12};
//		obj.movingZeros(nums);
//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
//		Q242
//		String s = "car";
//		String t = "rac";
//		String s = "abc";
//		String t = "cde";
//		Q242ValidAnagram obj = new Q242ValidAnagram();
//		boolean ans = obj.isAnagram(s, t);
//		System.out.println(ans);
		
//		Q217
//		int[] nums = {1, 2, 4, 2, 5, 3, 1, 6, 7, 9};
//		Q217ContainsDuplicate obj = new Q217ContainsDuplicate();
//		System.out.println(obj.containsDuplicate(nums));
		
//		Q169
//		int[] nums = {1, 2, 4, 2, 2, 3, 2, 4, 2};
//		Q169MajorElement obj = new Q169MajorElement();
//		System.out.println(obj.majorityElement(nums));
		
//		Q206
//		ListNode head = new ListNode(1);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		
//		Q206ReverseLinkedList obj = new Q206ReverseLinkedList();
//		ListNode tail = obj.reverseList(head);
//		while (tail != null) {
//			System.out.println(tail.val);
//			tail = tail.next;
//		}
		
//		Q235
//		TreeNode root = new TreeNode(4);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(6);
//		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(3);
//		root.right.left = new TreeNode(5);
//		root.right.right = new TreeNode(7);
//		TreeNode p = root.right.right;
//		TreeNode q = root.right.left;
//		Q235LCABST obj = new Q235LCABST();
//		TreeNode lca = obj.lowestCommonAncestor(root, p, q);
//		System.out.println(lca.val);
		
//		Q191
//		Q191NumberOf1Bits obj = new Q191NumberOf1Bits();
//		int ans = obj.hammingWeight(11);
//		System.out.println(ans);
		
//		Q328
//		ListNode head = new ListNode(1);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
//		Q328OddEvenLinkedList obj = new Q328OddEvenLinkedList();
//		ListNode newHead = obj.oddEvenList(head);
//		while (newHead != null) {
//			System.out.println(newHead.val);
//			newHead = newHead.next;
//		}
		
//		Q070
//		Q070ClimbingStairs obj = new Q070ClimbingStairs();
//		for (int n = 1; n < 20; n++) {
//			System.out.println(obj.climbStairs(n));
//		}
		
//		Q202
//		Q202HappyNumber obj = new Q202HappyNumber();
//		for (int i = 1; i <= 100; i++) {
//			if (obj.isHappy(i)) {
//				System.out.println(i);
//			}
//		}
		
//		Q021
//		Q021MergeTwoSortedLists obj = new Q021MergeTwoSortedLists();
//		ListNode l1 = new ListNode(1);
//		l1.next = new ListNode(3);
//		l1.next.next = new ListNode(5);
//		l1.next.next.next = new ListNode(7);
//		l1.next.next.next.next = new ListNode(9);
//		ListNode l2 = new ListNode(0);
//		l2.next = new ListNode(2);
//		l2.next.next = new ListNode(4);
//		l2.next.next.next = new ListNode(6);
//		l2.next.next.next.next = new ListNode(8);
//		ListNode head = obj.mergeTwoLists(l1, l2);
//		while (head != null) {
//			System.out.println(head.val);
//			head = head.next;
//		}
		
//		Q027
//		int[] nums = {1, 2, 3, 1, 4, 5, 2, 1, 6, 7, 8, 9, 1};
//		int val = 1;
//		Q027RemoveElement obj = new Q027RemoveElement();
//		int len = obj.removeElement(nums, val);
//		System.out.println(len);
		
//		Q066
//		int[] digits = {1, 9, 9, 9};
//		Q066PlusOne obj = new Q066PlusOne();
//		int[] ans = obj.plusOne(digits);
//		for (int i = 0; i < ans.length; i++) {
//			System.out.println(ans[i]);
//		}
		
//		Q118
//		Q118PascalTriangle obj = new Q118PascalTriangle();
//		int numRows = 5;
//		List<List<Integer>> triangle = obj.generate(numRows);
//		System.out.println(triangle);
		
//		Q102
//		Q102BinaryTreeLevelOrderTraversal obj = new Q102BinaryTreeLevelOrderTraversal();
//		TreeNode root = new TreeNode(4);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(6);
//		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(3);
//		root.right.left = new TreeNode(5);
//		root.right.right = new TreeNode(7);
//		List<List<Integer>> ans = obj.levelOrder(root);
//		System.out.println(ans);
		
//		Q119
//		Q119PascalTriangleII obj = new Q119PascalTriangleII();
//		int rowIndex = 3;
//		List<Integer> triangle = obj.getRow(rowIndex);
//		System.out.println(triangle);
		
//		Q009
//		Q009PalindromeNumber obj = new Q009PalindromeNumber();
//		System.out.println(obj.isPalindrome(1000021));
		
//		Q257
//		Q257BinaryTreePaths obj = new Q257BinaryTreePaths();
//		TreeNode root = new TreeNode(4);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(6);
//		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(3);
//		root.right.left = new TreeNode(5);
//		root.right.right = new TreeNode(7);
//		List<String> ans = obj.binaryTreePaths(root);
//		System.out.println(ans);
		
//		Q112PathSum obj = new Q112PathSum();
//		TreeNode root = new TreeNode(4);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(6);
//		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(3);
//		root.right.left = new TreeNode(5);
//		root.right.right = new TreeNode(7);
//		for (int sum = 5; sum < 20; sum++) {
//			boolean ans = obj.hasPathSum(root, sum);
//			System.out.println(ans);
//		}
		
//		Q225
//		Q225ImplementStackusingQueues obj = new Q225ImplementStackusingQueues();
//		obj.push(5);
//		obj.push(7);
//		obj.pop();
//		System.out.println(obj.top());
//		System.out.println(obj.empty());
//		obj.pop();
//		System.out.println(obj.empty());
		
//		Q036
//		Q036ValidSudoku obj = new Q036ValidSudoku();
//		char[][] board = new char[][]{
//			{'1', '2', '3'},
//			{'4', '5', '6'}
//		};
//		System.out.println(board[0].length);
//		
//		List<Integer> tmp = new ArrayList<Integer>();
//		tmp.add(1);
//		tmp.add(1);
//		tmp.add(2);
//		tmp.add(2);
//		
//		Set<Integer> uniq = new HashSet<Integer>(tmp);
//		System.out.println(uniq);
		
//		Q190
//		Q190ReverseBits obj = new Q190ReverseBits();
//		int ans = obj.reverseBits(43261596);
//		System.out.println(ans);
		
//		Q205
//		Q205IsomorphicStrings obj = new Q205IsomorphicStrings();
//		String s = "egg";
//		String t = "add";
//		String s = "foo";
//		String t = "bar";
//		String s = "paper";
//		String t = "title";
//		boolean ans = obj.isIsomorphic(s, t);
//		System.out.println(ans);
		
//		Q299
		Q299BullsCows obj = new Q299BullsCows();
		String secret = "1807";
		String guess = "7810";
		String hint = obj.getHint(secret, guess);
		System.out.println(hint);
	}
}
