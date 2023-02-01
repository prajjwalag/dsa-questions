#include <iostream>
using namespace std;
int main() {
  int size;
  cout<<"Enter Size: ";
  cin>>size;


  for(int row = 0; row < size; row++) {
    for(int col = 0; col < size; col++) {
      if(col == 0 || row == 0 || col == size-1 || row == size-1){
        cout << "* ";
      }
      else {
        cout << "  ";
      }
    }
    cout<< endl;
  }
}
