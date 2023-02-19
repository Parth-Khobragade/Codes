class Solution {
    int print2largest(int arr[], int n) {
         Arrays.sort(arr);

        if(arr[0]==arr[n-1]){

            return -1;

        }

        int max1=arr[n-1];

        for(int i=n-1;i>=0;i--){

            if(arr[i]<max1){

                max1=arr[i];

                break;

            }

        }

        return max1;

    }

}
