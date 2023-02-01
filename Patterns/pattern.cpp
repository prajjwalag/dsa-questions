#include <iostream>
using namespace std;
int main() {
  int size;
  cout<<"Enter size: ";

  cin>>size;

  for(int row = 0; row < size; row++) {
    for(int num1 = 0; num1 < size-row; num1++) {
      cout << num1+1 << " ";
    }
    for(int star1 = 0; star1 < row; star1++) {
      cout << "* ";
    }
    for(int star2 = 0; star2 < row; star2++) {
      cout << "* ";
    }
    for(int num2 = 0; num2 < size-row; num2++) {
      cout << num2+1 <<" ";
    }
    cout<<endl;
  }

}
