
//change

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            int x=-1*nums[i];
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>x){
                    k--;
                }
                else if(sum<x){
                    j++;
                }
                else{
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;

                }
            }
        }
        return result;
    }
}
