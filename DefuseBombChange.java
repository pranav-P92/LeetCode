//change code

class Solution {
    public int[] decrypt(int[] code, int k) {
        int res[]=new int[code.length];
        int sum=0;
        for(int i=0;i<k+1;i++){
            sum+=num[i+1];
        }

        for(int j=k+1;j<code.length;j++){
            sum+=code[j]-code[j-k+1];
        }

        for(int l=0;l<res.length;l++){
            res[l++]=sum;
        }
    }
}


