#include <iostream>
using namespace std;

int rev(string& a,int i ,int j){
    if(i>j){
        return 0;
    }

    swap(a[i],a[j]);
    i++;
    j--;

    return rev(a,i,j);

}


// reverse a string using recursion 
int main(){
    string a = "abcd";
    rev(a,0,a.length()-1);
    cout<<a<<endl;



return 0;
}