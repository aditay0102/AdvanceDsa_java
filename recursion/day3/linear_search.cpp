#include <iostream>

using namespace std;

bool search(int *arr,int n,int k){

    // base case
    if(n == 0){
        return false;
    }


    if(arr[0] == k){
        return true;
    }
    else{
        bool remainingPart = search(arr+1,n-1,k);
        return remainingPart;
    }

}


int main(){
    int arr[6] = {1,2,3,4,5,6};
    int k = 0;


    if(search(arr,6,k)){
        cout<<" found "<<endl;
    }
    else{
        cout<<" not found "<<endl;
    }

return 0;
}