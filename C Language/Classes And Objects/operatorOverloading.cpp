#include<iostream>
using namespace std;

class Overload{
    public:

    int c;
    int v;

Overload(){
this->c = 3;
this->v = 4;
}

void printInfo(){
    cout<<c<<" "<<v<<endl;
}


Overload operator +(Overload pass2){
    Overload temp;
    temp.c = c + pass2.c;
    temp.v = v + pass2.v;

    return temp;
}


};


int main() {

Overload a;
Overload b;

Overload t = a.operator+(b);

cout<<t.c<<" "<< t.v<<endl;


    return 0;
}