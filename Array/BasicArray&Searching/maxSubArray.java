//Leetcode 53. Maximum Subarray
//Level : Medium
//Technique : Kadane's algorithm
//Time Complexity : O(n)
//Space Complexity : O(1)

class Solution{
  public int maxSubArray(int[] nums){
    
    //The CurrSum stores sum of Current subarray
    int currSum = nums[0];
    
    //The maxSum stores the maximum sum of subarray
    int maxSum = nums[0];
    
    //Traverse the array from index 1
    for(int i=1; i<nums.length; i++){
      
      //Either continue with exsting sum i.e extend it or start from new 
      currSum = Math.max(nums[i], currSum+nums[i]);
      
      //Update the maxSum
      maxSum = Math.max(maxSum, currSum);
    }
    
    //return the result
    return maxSum;
  }
}
