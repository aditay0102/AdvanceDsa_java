#include <iostream>
using namespace std;

bool binarySearch(int *arr,int s,int e,int k){
    // base case
    if(s>e){
        return false;
    }

    int mid = s+(e-s)/2;

    if(arr[mid] == k){
        return true;
    }

    if(arr[mid]<k){
        return binarySearch(arr,mid+1,e,k);
    }
    else{
        return binarySearch(arr,mid-1,e,k); 
    }
}

int main(){
    int arr[6] = {5,3,2,4,6,1};
    int n = 6;
    int k = 3;

    cout<<"Present or not"<< binarySearch(arr,0,n,k)<<endl;



return 0;
}