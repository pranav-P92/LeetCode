//https://leetcode.com/problems/flipping-an-image/description/


//2-pointer approach
//time complexity : O(n^2)
//space complexity : O(1)

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       //flip bits
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                image[i][j]^=1;
            }
        }

        //inverting bits
        for(int l=0;l<image.length;l++){
            int left=0;
            int right=image[l].length-1;

            while(left<right){
                int temp=image[l][left];
                image[l][left]=image[l][right];
                image[l][right]=temp;
                left++;
                right--;
            }
        }
        return image;
    }
}
