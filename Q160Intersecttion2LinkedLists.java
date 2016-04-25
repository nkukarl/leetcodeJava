
public class Q160Intersecttion2LinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA = getLength(headA);
		int lenB = getLength(headB);
		if (lenB > lenA) {
			ListNode tmp = headA;
			headA = headB;
			headB = tmp;
		}
		int count = 0;
		while (count < Math.abs(lenA - lenB)) {
			headA = headA.next;
			count++;
		}
		while (headA != null && headB != null) {
			if (headA == headB) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}
	public int getLength(ListNode head) {
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}
		return len;
	}
}
