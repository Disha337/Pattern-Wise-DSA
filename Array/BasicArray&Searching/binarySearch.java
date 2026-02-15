//Leetcode 704. Binary Search
//Level : Easy
//Technique : Binary Search
//Time COmplexity : O(log n)
//Space Complexity : O(1)

class Solution{
  public int search(int[] nums, target){
    
    //left and right pointers
    int left = 0;
    int right = nums.length - 1;

    //Continue searching until condition is valid
    while(left <= right){

      //Calculate the mid 
      int mid = left + (right - left)/2;

      //The target is found
      if(nums[mid] == target){
        return mid;
      }
      //The target is in right half
      else if(nums[mid] < target){
        left = mid + 1;
      }
        //The target is in left half
      else{
        right = mid - 1;
      }
    }
    //target not found
    return -1;
  }
}
