
class Solution{
    static int evenlyDivides(int N){
        // code here
        int copy = N;
        int count=0;
        while(copy>0)
        {
            if((copy%10)!=0 && (N%(copy%10))==0)
                count++;
            copy = copy/10;
        }
        return count;
    }
}


{https://practice.geeksforgeeks.org/problems/count-digits5716/1?page=1&difficulty[]=-2&sortBy=submissions}
