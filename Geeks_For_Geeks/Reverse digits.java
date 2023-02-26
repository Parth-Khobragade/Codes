class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
        long reverse=0;
        long remainder=0;
        while(n>0){
            remainder=n%10;
            reverse=(reverse*10)+remainder;
            n=n/10;
            
        }
        return reverse;
    }
}

{https://practice.geeksforgeeks.org/problems/reverse-digit0316/1?page=1&difficulty[]=-2&sortBy=submissions}
