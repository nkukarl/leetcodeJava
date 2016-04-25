
public class Q328OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		ListNode odd = new ListNode(0);
		ListNode nOdd = odd;
		ListNode even = new ListNode(0);
		ListNode nEven = even;
		ListNode cur = head;
		while (cur != null) {
			nOdd.next = cur;
			nOdd = nOdd.next;
			cur = cur.next;
			if (cur != null) {
				nEven.next = cur;
				nEven = nEven.next;
				cur = cur.next;
			}
		}
		nOdd.next = even.next;
		nEven.next = null;
		return odd.next;
	}
}
