#https://leetcode.com/problems/number-of-1-bits/


class Solution:
    def hammingWeight(self, n: int) -> int:
        r=[]
        c=0
        while n>0:
            d=n%2
            r.append(d)
            n//=2
            if(d==1):
                c+=1
        return c

        
