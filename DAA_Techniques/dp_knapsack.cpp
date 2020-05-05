#include <bits/stdc++.h> 
using namespace std; 
Int dp[1001][1001];
// return max value for Weight W 
int knapSack(int W, int wt[], int val[], int n){      
// Base Case  
if (n == 0 || W == 0)  
    return 0;  
//if already calculated 
if(dp[n][W] != -1) 
    return dp[n][W];  
// If weight of the nth item is more  
// than Knapsack capacity W, then  
// this item cannot be included 
// in the optimal solution  
if (wt[n-1] > W)  
    return (dp[n][W]=knapSack(W, wt, val, n-1));
// Return the maximum of two cases:  
// (1) nth item included
Int inc = knapSack(W-wt[n-1], wt, val, n-1); 
// (2) not included  
Int exc = knapSack(W, wt, val, n-1);
else return (dp[n][W] = max(val[n-1]+inc,exc);  
}   
int main()  
{  
    int val[] = {60, 100, 120};  
    int wt[] = {10, 20, 30};  
    int W = 50;  
    int n = 3; 
    For(int I=0;I<n+1;I++){
         For(int j=0;j<W+1;j++){               dp[I][j] = -1;
         }
    }  
    cout<<knapSack(W, wt, val, n);  
        return 0;  
}
