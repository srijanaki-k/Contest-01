public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1; // Check if the least significant bit is 1
            n >>>= 1; // Right shift n by 1 bit
        }
        return count;
    }
}
