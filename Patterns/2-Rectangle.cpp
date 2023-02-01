#include <iostream>
using namespace std;
int main() {
  int rowSize, columnSize;
  cout<<"Enter Row Size: ";
  cin>>rowSize;

  cout<<"Enter Column Size: ";
  cin>>columnSize;

  for(int row = 0; row < rowSize; row++) {
    for(int col = 0; col < columnSize; col++) {
      cout << "* ";
    }
    cout<< endl;
  }
}
