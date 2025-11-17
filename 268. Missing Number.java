//https://leetcode.com/problems/missing-number/


class Solution {
    public int missingNumber(int[] nums) {
        int n=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            n++;
        }
        int numSum=(n*(n+1)/2);
        int totalSum=numSum-sum;
    return totalSum;
       } 
    }
