#https://leetcode.com/problems/add-binary/

class Solution:
    def addBinary(self, a: str, b: str) -> str:
        def bin_to_deci(x):
            t=int(x)
            bsum=0
            i=0
            while t>0:
                d=t%10
                e=d*(2**i)
                bsum+=e
                t//=10
                i+=1
            return bsum
        def deci_to_bin(z):
            if z==0:
                return '0'
            r=[]
            while z>0:
                d=z%2
                r.append(d)
                z//=2
            return ''.join(str(i) for i in r[::-1])

        xa=bin_to_deci(a)
        xb=bin_to_deci(b)
        z=xa+xb
        return deci_to_bin(z)


# class Solution:
#     def addBinary(self, a: str, b: str) -> str:
#         return bin(int(a,2) + int(b,2))[2:]
        
