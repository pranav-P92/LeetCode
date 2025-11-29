//https://leetcode.com/problems/minimum-number-of-flips-to-reverse-binary-string/description/


//2-pointer approach

class Solution {
    public int minimumFlips(int n) {
        String binary="";
        String s="";

        while(n>0){
            int rem=n%2;
            s+=rem;
            n/=2;
        }
        for(int i=s.length()-1;i>=0;i--){
            binary+=s.charAt(i);
        }
        int count=0;
        for(int l=0;l<s.length();l++){
            if(binary.charAt(l)!=s.charAt(l)){
                count++;
            }
        }
        return count;
    }
}
