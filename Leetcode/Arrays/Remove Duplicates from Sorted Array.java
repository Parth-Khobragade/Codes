class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        int k=j+1;
        return k;
    }
}

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
