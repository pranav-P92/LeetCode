//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive=0;
        int negative=1;
        int result[]=new int[nums.length];

        for(int i:nums){
            if(i>0){
                result[positive]=i;
                positive+=2;
            }
            else{
                result[negative]=i;
                negative+=2;
            }
        }
        return result;
    }
}
