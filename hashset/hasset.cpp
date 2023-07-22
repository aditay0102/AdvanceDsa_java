#include <iostream>
#include <bits/stdc++.h>
#include <unordered_set>


using namespace std;

// insert(),size(),clear(),begin(),end(),find(),erase(),count();


int main(){
    unordered_set<int> s;
    int arr[5] = {1,1,3,4,2};

    for(int i=0;i<5;i++){
        s.insert(arr[i]);
    }

    for(auto it = s.begin(); it!=s.end();it++){
        cout<<*it<<endl;
    }

return 0;
}