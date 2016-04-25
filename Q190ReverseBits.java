
public class Q190ReverseBits {
	public int reverseBits(int n) {
		int counter = 0;
		int ans = 0;
		while (counter < 32) {
			ans <<= 1;
			ans += (n & 1);
			n >>= 1;
			counter++;
		}
		return ans;
	}
}
