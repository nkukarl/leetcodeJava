
public class Q206ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode tmp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = tmp;
		}
		return prev;
	}
}
