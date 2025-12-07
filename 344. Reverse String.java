//https://leetcode.com/problems/reverse-string/description/


//2-pointer approach

//time complexity : O(n)
//space complexity : 0(1)
class Solution {
    public void reverseString(char[] s) {
         int i=0;
        int j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
