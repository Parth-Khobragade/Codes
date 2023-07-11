class Solution {
    public int maxArea(int[] height) {
     //two pointer approach
     int maxwater=0;
     int lp=0; //leftpointer
     int rp= height.length-1; //rightpointer

     while(lp<rp){
         int ht= Math.min(height[lp],height[rp]);
          int width= rp-lp;
         int currwater=ht*width;
         maxwater=Math.max(maxwater,currwater);

         if(height[lp]<height[rp]){
            lp++;
        }
         else{
            rp--;
        }
     }
     return maxwater;
    }
}

//https://leetcode.com/problems/container-with-most-water/description/
