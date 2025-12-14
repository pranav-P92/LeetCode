//https://leetcode.com/problems/arithmetic-slices/description/


//sliding window approach
//time complexity : O(n)
//space complexity : O(1)

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count=0;
        int current=0;
        if(nums.length<3){
            return 0;
        }
        for(int i=2;i<nums.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                current++;
                count+=current;
            }
            else{
                current=0;
            }
        }
        return count;
    }
}
