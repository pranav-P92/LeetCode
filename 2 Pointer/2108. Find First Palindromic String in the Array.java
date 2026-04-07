//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/


//2-pointer approach
//time complexity : O(n x k) = O(k)
//space complexity : O(1)


class Solution {
    public static boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            int start=0;
            int end=words[i].length()-1;

            if (isPalindrome(words[i],start,end)){
                return words[i];
            }
        }
        return "";

    }
}
