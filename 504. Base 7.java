//https://leetcode.com/problems/base-7/description/ 


//math
//time complexity : O(log₇ n)
//space complexity: O(log₇ n)

class Solution {
    public String convertToBase7(int num) {
        if(num==0)
            return "0";

        int n=Math.abs(num);
        StringBuilder res=new StringBuilder();

        while(n>0){
            res.append(n%7);
            n/=7;
        }
        
        if(num<0)
            res.append('-');

        return res.reverse().toString();
    }
}

