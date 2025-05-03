#https://leetcode.com/problems/add-digits/description


class Solution:
    def addDigits(self, num: int) -> int:
        def recur(n):
            while n>=10:
                sum=0
                while n>0:
                    div=n%10
                    sum+=div
                    n//=10
                n=sum
            return n
        return recur(num)
