#include<bits/stdc++.h> 
using namespace std; 
int to_search;
bool found = true;
// This class represents a directed graph using adjacency list representation ​
class Graph { 
    int V; // No. of vertices 
    list<int> *adj; // adjacency lists 
public: 
    Graph(int V); // Constructor 
    void addEdge(int v, int w); // to add an edge to graph 
    void DFS(); // prints all vertices in DFS manner 
    void DFSUtil(int s, vector<bool> &visited); }; 
Graph::Graph(int V) { 
    this->V = V;
    adj = new list<int>[V]; } 
void Graph::addEdge(int v, int w) { 
    adj[v].push_back(w); } 
void Graph::DFSUtil(int s, vector<bool> &visited) { 
    stack<int> stack; 
      stack.push(s);          // Push the current source node.  
    while (!stack.empty()) { 
        stack.pop();
        if (!visited[s]) { cout << s << " "; 
                  visited[s] = true; 
        } 
        for (auto i = adj[s].begin(); i != adj[s].end(); ++i) 
            if (!visited[*i]) 
                stack.push(*i); 
        if(s == to_search){
          found = false;
          break;
        }}}
// prints all vertices in DFS manner 
void Graph::DFS()  { 
    // Mark all the vertices as not visited 
    vector<bool> visited(V, false);
    for (int i = 0; i < V; i++) 
        if (!visited[i] && found == true) {
            DFSUtil(i, visited); 
        }}
int main() { 
    Graph g(5); // Total 5 vertices in graph 
    g.addEdge(1, 0); 
    g.addEdge(2, 1); 
    g.addEdge(3, 4); 
    g.addEdge(4, 0); 
    to_search = 3;
    cout << "this is the path from the start node to the goal node:\n"; 
    g.DFS();
    return 0; } 
