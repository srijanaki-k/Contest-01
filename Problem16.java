class Solution {
    public boolean hasAlternatingBits(int n) {
        // Check if the XOR of the number and its right-shifted version by 1 position has no consecutive set bits
        long xor = (long)n ^ ((long)n >> 1);
        return (xor & (xor + 1)) == 0;
    }
}
