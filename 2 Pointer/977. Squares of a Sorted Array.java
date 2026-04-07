//https://leetcode.com/problems/squares-of-a-sorted-array/

//2-pointer approach

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];

        int l=0;
        int r=n-1;
        int index=n-1;

        while(l<=r){
            int leftSq=nums[l]*nums[l];
            int rightSq=nums[r]*nums[r];

            if(leftSq>rightSq){
                result[index]=leftSq;
                l++; 
            }
            else{
                result[index]=rightSq;
                r--;
            }
            index--;


        }

         return result;   
    }
}
