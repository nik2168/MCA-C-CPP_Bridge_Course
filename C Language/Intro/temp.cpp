#include<iostream>
using namespace std;



int main(){

double a = 8;
double j = 4;

int ans = 0;
while(a > 0){
   a -= j;
   j =  j/2;
   cout<<ans<<endl;
   ans++;
}

cout<<ans;

    return 0;
}

