//https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/


//sliding-window approach
//time complexity : O(n)
//space complexity : O(1)


class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        int left=0;
        int frequency[]=new int[26];

        if(s.length()<3)
            return 0;

        for(int right=0;right<s.length();right++){
            frequency[s.charAt(right)-'a']++;

            if((right-left+1)>3){
                frequency[s.charAt(left)-'a']--;
                left++;
            }

            if((right-left+1)==3)
                if(frequency[s.charAt(left)-'a']==1 &&
                frequency[s.charAt(left+1)-'a']==1 &&
                frequency[s.charAt(left+2)-'a']==1){
                    count++;
                }
        }
        return count;
    }
}



//not recommended
//since the window length is shorter, checking if the character are not same within the window increment the count value.


//time complexity : O(n)
//space complexity : O(1)

class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            int right=i+1;
            if((s.charAt(i)!=s.charAt(right) && 
              (s.charAt(i)!=s.charAt(right+1)) &&
              (s.charAt(right)!=s.charAt(right+1)))){
                    count++;
                }
        }
        return count;
    }
}
