#include<iostream>
#include<fstream>
using namespace std;

// We have fstream class to read and write in files in cpp
// -> ifstream - to read file
// -> ofstream - to write in files

int main(){

  // wrting in file with constructor  
// string a = "Hello there";
// ofstream out("temp.txt");
// out<<a;

// reading from file
string b;
ifstream in("temp.txt");
// in>>b; read without space
getline(in, b); // read first entire line
getline(in, b); // read second entire line
cout<<b;

    return 0;
}