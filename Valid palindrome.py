#https://leetcode.com/problems/valid-palindrome/

class Solution:
    def isPalindrome(self, s: str) -> bool:
        t=''
        for i in range(len(s)):
            if(s[i].isalnum()==True):
                t+=s[i].lower()
        return (t==t[::-1])
    
    #  t=''.join(i for i in s.lower() if i.isalnum())
    #  return (t==t[::-1])
