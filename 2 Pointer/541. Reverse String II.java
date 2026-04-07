//https://leetcode.com/problems/reverse-string-ii/description/

//2-pointer approach
//time complexity: O(n)
//space complexity : O(n)

class Solution {
    public String reverseStr(String s, int k) {
        char arr[]=s.toCharArray();
        for(int l=0;l<s.length();l+=2*k){
            int i = l;
            int j = Math.min(l+k-1, s.length() - 1); 
            while(i<j){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            
        }
      
        return  new String(arr);
    }
}
