class Solution
{
      public int gcd(int A , int B) 
    { 
        if(A == 0){
            return B;
        }
        
        if(B == 0){
            return A;
        }
        
        if(A == B){
            return A;
        }
        
        if(A > B){
            return gcd(B, A % B);
        }
        
        if(B > A){
            return gcd(B % A, A);
        }
        
        return -1;
    } 
}


{https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/0}
