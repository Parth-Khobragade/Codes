class Solution
{
    public int[] find_sum(int n)
    {
        // Code here
        int even=0;
        int odd=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even= even +i;
            }
            else{
                odd=odd+i;
            }
        }
        return new int[]{odd, even};
    }
}

{https://practice.geeksforgeeks.org/problems/sum-of-odd-and-even-elements3033/1?page=5&difficulty[]=-2&sortBy=submissions}
