class Solution {
    public boolean isPowerOfThree(int n) {
        // Base case: If n is less than or equal to 0, it cannot be a power of three
        if (n <= 0) {
            return false;
        }
        
        // Check if n is divisible by 3 without leaving a remainder
        while (n % 3 == 0) {
            n /= 3;
        }
        
        // If n becomes 1 after dividing by 3 repeatedly, then it is a power of three
        return n == 1;
    }
}
