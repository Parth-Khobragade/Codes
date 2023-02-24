class Solution{
    int middle(int A, int B, int C){
        //code here
        if((A>C && A<B)||(A>B && A<C)){
            return A;
        }
        else if((C>A && C<B)||(C>B && C<A)){
            return C;
        }
        
        else{
            return B;
        }
    }
}

{https://practice.geeksforgeeks.org/problems/middle-of-three2926/1?page=3&difficulty[]=-1&sortBy=submissions}
