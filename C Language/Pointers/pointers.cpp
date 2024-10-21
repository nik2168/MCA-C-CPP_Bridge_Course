#include<iostream>
using namespace std;

int main() {

//    int t = 3;
//    int * a = new int;
//    *a = 45;
//    cout<<*a;

int a [] = {1,2,3,4};

for(int i = 0; i < 4; i++){
    cout<<&a[i]<<endl;
}
 
    return 0;
}