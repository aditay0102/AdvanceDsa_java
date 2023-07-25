#include <iostream>
using namespace std;

void merge(int *arr,int s,int e){

    int mid = (s+e)/2;

    int len1 = mid -s -1;
    int len2 = e - mid;
     
    int *first = new int[len1];
    int *second = new int[len2];

    int mainAxixArray = s;

    for(int i = 0; i<len1;i++){
        first[i] = arr[mainAxixArray]
    }

    mainAxixArray = mid +1;

    for(int i =0;i<len2;i++){
        second[i] arr[mainAxixArray++];   
    }

    // merge 2 sorted array man
    int index1 = 0;
    int index2 = 0;

    mainAxixArray = s

    while(index1 < len1 && index2 < len2 ){
        if(first[index1] < second[index2]){
            arr[mainAxixArray] = first[index1++];
        }
        else{
            arr[mainAxixArray] = second[index2++];
        }

    }

    while(index1 < len1){
        arr[mainAxixArray++] = first[index1++]; 
    }

    while(index2 < len2){
        arr[mainAxixArray] = second[index2++];
    }

}

void mergeSort(int *arr,int s,int e){
    // base case
    if(s>e){
        return;
    }

    int mid = (s+e)/2;

    // left part sort kerna hai
    mergeSort(arr,s,mid);

    // righ part sort kerna hai
    mergeSort(arr,mid+1,e);

    // merge
    merge(arr,s,e);
}

int main(){
    int arr[5] = {2,5,1,3,4};
    int n = 5;
    mergeSort(arr,0,n-1);



return 0;
}