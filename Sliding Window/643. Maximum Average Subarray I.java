//https://leetcode.com/problems/maximum-average-subarray-i/description/


//sliding-window approach
//time complexity : O(n)
//space compexity : O(1)

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        //finding sum of first k elements
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum=sum;

        //sliding array
        for(int j=k;j<nums.length;j++){
            sum+=nums[j]-nums[j-k];
            maxSum=Math.max(maxSum,sum);
        }
         double  average=(double)maxSum/k;

        return average;
    }
}
