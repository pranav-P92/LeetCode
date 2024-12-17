#https://leetcode.com/problems/word-pattern/



class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        counter={}
        patternSignature=[]   #pattern
        for ind, char in enumerate(pattern):
            if char not in counter:
                counter[char]=ind
            patternSignature.append(counter[char])

        counter2={}  
        sSignature=[]
        for ind,word in enumerate(s.split(" ")):
            if word not in counter2:
                counter2[word]=ind
            sSignature.append(counter2[word])


        return patternSignature==sSignature


