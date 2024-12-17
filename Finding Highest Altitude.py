#https://leetcode.com/problems/find-the-highest-altitude/description/



class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        alt=0
        l=[]
        for i in range(len(gain)):
            l.append(alt)
            alt+=gain[i]
        l.append(alt)
       
        max=0
        for i in range(len(l)):
            if l[i]>max:
                max=l[i]
        return max
       
