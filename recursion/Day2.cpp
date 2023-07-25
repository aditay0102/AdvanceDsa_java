#include <iostream>
using namespace std;

void till(int n,int m){
    if(n == m){
        cout<<n<<" ";
        return ;
    }
    cout<<n<<" ";
    n++;
    till(n,m);
    
}

int fib(int n){
    if(n == 0){
        return 0;
    }
    if(n == 1){
        return 1;
    }

    int ans = fib(n-1) + fib(n-2);

    return ans;
}

int main(){

    int n , m;
    cin>>n;
    cin>>m;

   // till(n,m);

    int ans = fib(n);
    cout<<ans;

return 0;
}