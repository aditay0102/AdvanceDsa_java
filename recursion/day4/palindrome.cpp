#include <iostream>

using namespace std;

bool pali(string a, int s , int e){
    if(s>e){
        return true;
    }

    if(a[s] != a[e]){
        return false;
    }
    else{
     return  pali(a,s+1,e-1);

    }

}

int main(){

    string a = "iti";
    bool ans = pali(a,0,a.length()-1);
    if(ans){
        cout<<"true"<<endl;
    } 
    else{
        cout<<"false"<<endl;
    }
    

return 0;
}