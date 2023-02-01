#include <iostream>
using namespace std;
int main() {
  
  int size;
  cout<<"Enter Size: ";
  cin>>size;

  for(int row = 0; row < size; row++) {
    for(int spaces = 0; spaces < row; spaces++) {
      cout<<" ";
    }
    for(int stars = 0; stars < size-row; stars++) {
      cout << "* ";
    }
    cout<<endl;
  }
}
