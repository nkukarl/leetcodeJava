
public class Q191NumberOf1Bits {
	public int hammingWeight(int n) {
		int i = 0;
		int count = 0;
		while (i < 32) {
			count += n & 1;
			n >>= 1;
			i++;
		}
		return count;
	}
}
