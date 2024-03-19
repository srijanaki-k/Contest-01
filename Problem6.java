
import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        // Sorting the array to handle negative numbers
        Arrays.sort(nums);
        
        // If all numbers are positive or all are negative, return the product of the last three elements
        int n = nums.length;
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        
        // If there are both positive and negative numbers, the maximum product could be from two smallest negative numbers and the largest positive number
        int option2 = nums[0] * nums[1] * nums[n - 1];
        
        // Return the maximum of the two options
        return Math.max(option1, option2);
    }
}
