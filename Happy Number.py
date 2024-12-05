#https://leetcode.com/problems/happy-number/


class Solution:
    def isHappy(self, n: int) -> bool:
        def getnext(num):
            sum=0
            while (num>0):
                d=num%10
                sum+=d*d
                num//=10
            return sum
        
        v=set()
        while n!=1 and n not in v:
            v.add(n)
            n=getnext(n)
        return n==1  
      
