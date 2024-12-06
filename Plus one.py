#https://leetcode.com/problems/plus-one/


class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        #digits=[]
        sum=0
        for i in range(len(digits)):
            t=(10**(len(digits)-(i+1)))
            sum+=digits[i]*t
        incr=sum+1
        l=[]
        while incr>0:
            rem=incr%10
            l.append(rem)
            incr//=10
        return l[::-1]
