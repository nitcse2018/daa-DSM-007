#include <bits/stdc++.h> 
using namespace std;
struct Item { 
    float weight; 
    int value; }; 
struct Node { 
    int level, profit, bound; 
    float weight; }; 
bool cmp (Item a, Item b) { 
    double r1 = (double) a.value / a.weight; 
    double r2 = (double)b.value / b.weight; 
    return r1 > r2; } 
int bound(Node u, int n, int W, Item arr[]) { 
    if (u.weight >= W)  return 0; 
    int profit_bound = u.profit; 
    int j = u.level + 1;    //including next items
    int totweight = u.weight;
while ((j < n) && (totweight + arr[j].weight <= W)) { 
//checking KnapSack condition
        totweight += arr[j].weight; 
        profit_bound += arr[j].value;   //increasing current profit
        j++;  } 
    if (j < n)  //increase currrent profit for last item
        profit_bound += (W - totweight) * arr[j].value /   arr[j].weight; 
    return profit_bound; }
// Returns maximum profit we can get with capacity W 
int knapsack(int W, Item arr[], int n) { 
    sort(arr, arr + n, cmp); 
    queue<Node> Q; 
    Node u, v; 
    u.level = -1;  u.profit = u.weight = 0;     //initialize dummy as starting node
    Q.push(u);  
    int maxProfit = 0; 
    while (!Q.empty()) {        //Do while (Q is not empty).
        u = Q.front();             //Extract an item from Q. Let the item be u.
        Q.pop(); 
        if (u.level == -1)        //if at dummy node next level will be 0
            v.level = 0; 
        if (u.level == n-1)    //if it is last level 
            continue; 
        v.level = u.level + 1;      //Compute profit of next level node.
        v.weight = u.weight + arr[v.level].weight; 
        v.profit = u.profit + arr[v.level].value; 
        if (v.weight <= W && v.profit > maxProfit)
maxProfit = v.profit;            //If the profit is more than max, then update max.
        v.bound = bound(v, n, W, arr);    //Compute bound of next level node. 
        if (v.bound > maxProfit) 
            Q.push(v);     //If bound is more than max, then add next level node to Q.
        v.weight = u.weight;   //when next level node is not considered as part of solution
        v.profit = u.profit;      //but weight and profit without considering next level nodes.
        v.bound = bound(v, n, W, arr); 
        if (v.bound > maxProfit) 
            Q.push(v); }  ////add a node to queue with level as next
    return maxProfit; } 
int main() { 
    int W = 10; // Weight of knapsack 
    Item arr[] = {{2, 40}, {3.14, 50}, {1.98, 100}, 
                {5, 95}, {3, 30}}; 
    int n = sizeof(arr) / sizeof(arr[0]); 
    cout << "Maximum possible profit = " << knapsack(W, arr, n); 
    return 0; }
