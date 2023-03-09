class Solution{
    static void printFloydTriangle(int N){
        // code here
        int count=1;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
}

{https://practice.geeksforgeeks.org/problems/floyds-triangle1222/1?page=6&difficulty[]=-2&sortBy=submissions}
