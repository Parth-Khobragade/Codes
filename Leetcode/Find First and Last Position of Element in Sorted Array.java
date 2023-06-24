class Solution {
    public int[] searchRange(int[]nums, int target) {
    int arr[]= {-1,-1};
	
    arr[0]=search(nums,target,true);
    arr[1]=search(nums,target,false);

    return arr;          
	
}
  
	
	int search(int[] arr,int tar,boolean firststartindex) {
	int ans=-1;
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(tar<arr[mid]) {
			end=mid-1;
			
		}
		
		else if(tar>arr[mid]){
			start=mid+1;
		}
		else {
			ans=mid;
			if(firststartindex) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
	}
	return ans;
	
    }
}

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
