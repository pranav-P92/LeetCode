//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/


//2-pointer approach
//time complexity : O(n)
//space complexity : O(n)

class Solution {
    public int findMaxK(int[] nums) {
       Set<Integer> set=new HashSet<>();
       int max=-1;
       for(int x:nums){
        if(set.contains(-x)){
            max=Math.max(max,Math.abs(x));
        }
        set.add(x);
       }
       return max;
    }
    
}


//2-pointer approach
//time complexity : O(Nlogn)
//space complexity : O(1)
class Solution {
    public int findMaxK(int[] nums) {
       Arrays.sort(nums);
       int i=0;
       int j=nums.length-1;
       while(i<j){
        if(nums[i]+nums[j]>0){
            j--;
        }
        else if(nums[i]+nums[j]<0){
            i++;
        }
        else{
            return nums[j];
        }
       }
       return -1;
    }
}
