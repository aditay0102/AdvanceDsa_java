#include <iostream>
using namespace std;

int srt(int *arr,int n){
    int i = 0;
    
    if(n == 0 || n == 1){
        return true;
    }

    if(arr[i]>arr[i+1]){
        return false;
    }
    else{
        return srt(arr+1,n-1);
    }

    
}

int getsum(int *arr,int n){
    if(n == 0){
        return 0;
    }

    if(n == 1){
        return arr[0];

    }

    int sum = arr[0] + getsum(arr+1,n-1);
    return sum;
}

int main(){
    int n = 5;
    int arr[n] = {3,2,4,5,5};
    
    cout<<getsum(arr,n)<<endl;

    /*
    if(srt(arr)){
        cout<<"it is sorted man"<<endl;
    }
    else{
        cout<<" it is not sorted man"<<endl;    
    }
    */

return 0;
}