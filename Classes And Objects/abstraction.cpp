#include<iostream>
using namespace std;

// the class with the virtual function is known as abstract class in cpp
class Shape{
    virtual void draw() = 0; // pure virtual function ... kind of like abstractions in java

};

class Circle : public Shape{
    public:
    void draw(){
        cout<<"We draw a circle";
    }
};

int main(){

  Circle c;
  c.draw();
    return 0;
}