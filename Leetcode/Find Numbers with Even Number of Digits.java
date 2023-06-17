class Solution {
    static int findNumbers(int[] nums) {
        int count=0;
     for(int num:nums){
         if(even(num)){
             count++;
         }
     }
     return count;
    }

    //    funtion to check if the digits are even or not
      public static boolean even(int num){
        if(digits(num) % 2 ==0){
            return true;
        }
        return false;
      }

      //    function to check number of digits
      public static int digits(int num) {
           int count=0;
           while(num>0){
              num=num/10;
              count++;
           }
          return count;
       }
}

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
