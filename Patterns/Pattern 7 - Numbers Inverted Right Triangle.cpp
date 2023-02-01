#include <iostream>
using namespace std;
int main() {
  
  int size;
  cout<<"Enter Size: ";
  cin>>size;

  for(int row = 0; row < size; row++) {
    for(int col = 0; col < size-row; col++) {
      cout << col+1 << " ";
    }
    cout<<endl;
  }
}
