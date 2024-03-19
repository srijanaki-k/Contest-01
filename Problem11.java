
class Solution {
   public int waysToMakeFair(int[] nums)  {
        int n = nums.length;
        int count = 0;
        
        // Calculate initial sums of odd and even indices
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
        }
        
        // Iterate through each index to simulate removal
        for (int i = 0; i < n; i++) {
            // Update sums excluding the element at index i
            if (i % 2 == 0) {
                evenSum -= nums[i];
            } else {
                oddSum -= nums[i];
            }
            
            // Check if the sums are equal after removal
            if (evenSum == oddSum) {
                count++;
            }
            
            // Restore sums for the next iteration
            if (i % 2 == 0) {
                oddSum += nums[i];
            } else {
                evenSum += nums[i];
            }
        }
        
        return count;
    }
}
