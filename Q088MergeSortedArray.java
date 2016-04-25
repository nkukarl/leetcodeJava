
public class Q088MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int pos = n + m - 1;
		n--;
		m--;
		while (n >= 0 && m >= 0) {
			if (nums1[m] > nums2[n]) {
				nums1[pos] = nums1[m];
				m--;
			} else {
				nums1[pos] = nums2[n];
				n--;
			}
			pos--;
		}
		while (n >= 0) {
			nums1[pos] = nums2[n];
			pos--;
			n--;
		}
	}
}
