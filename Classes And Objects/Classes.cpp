#include<iostream>
using namespace std;


class Fruit{
    public: 
    string a;
    double * ptrRoll;

   Fruit(string a, double b){
    this->a = a;
    this->ptrRoll = new double;
    *ptrRoll = b;
   }

   Fruit(Fruit &obj){
    ptrRoll = new double;
    *ptrRoll = *obj.ptrRoll; // deep copy to avoid same location memory conflicts in copy constructor;
   }

   ~Fruit(){} // destructure

   void getInfo(){
    cout<<"a value is : "<<a<<endl;
    cout<<"ptrRoll is "<<*ptrRoll<<endl;
   }

};

// A friend function is a function that isn't a member of a class but has access to the class's private and protected members. 
// Friend functions aren't considered class members; they're normal external functions that are given special access privileges.

int main(){

    try
    {
        /* code */
    }
    catch(const std::exception& e)
    {
        std::cerr << e.what() << '\n';
    }
    
    // shawlow copy when we won't use dynamic heap memory and called copy constructor

    // deep copy when we use heap memory allocation using pointer ...

Fruit n("Mango", 2395.23);

Fruit a(n); // copy constructor
n.getInfo();
*(a.ptrRoll) = 38.54; // shawlow copy will change value for all objects
n.getInfo();
    return 0;
}