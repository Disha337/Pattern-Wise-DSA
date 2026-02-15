//Leetcode 26. Remove Duplicates from sorted array
//Level : Easy
//Pattern : Basic Array + Two Pointer
//Time Complexity : O(n)
//Space COmplexity : O(1)

class Solution{
  public int removeDuplicates(int[] nums){
    //If the array is empty return 0
    if(nums.length == 0){
      return 0;
    }

    int i = 0;
    for(int j=0 ;j<nums.length; j++){
      
      //If unique elements founds increment the i and set j at index i
      if(nums[j] != nums[i]){
        i++;
        nums[i] = nums[j];
      }
    }
    //return the result
    return i+1;
  }
}
