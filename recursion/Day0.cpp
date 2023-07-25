#include <iostream>

using namespace std;

// -----------------------                              FACTORIAL 
int factorial(int n){
    // base case
    if(n == 0){
        return 1; // its mandatory to return is base cae  ****
    }

    return n * factorial(n-1);

}

// --------------------------------         POWER
int power(int n){
    // base case
    if(n == 0){
        return 1;
    }
    // recursive relation
    return 2 * power(n-1);

}
// ----------------------------------     counting till n---
void count(int n){

    if(n == 0){
        return;
    }
    cout<<n<<endl;
    count(n-1);
}


int main(){
    int n;
    cin>>n;

    // int ans = factorial(n);
    // int ans = power(n);
    count(n);

    


return 0;
}
