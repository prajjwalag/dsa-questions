#include <iostream>
using namespace std;
int main() {
  
  int size;
  cout<<"Enter Size: ";
  cin>>size;

  for(int row = 0; row < size; row++) {
    int printingNumber = row+1;
    for(int spaces = 0; spaces < size-row; spaces++) {
      cout<<"  ";
    }
    for(int num1 = 0; num1 <= row; num1++, ++printingNumber) {
      cout << printingNumber << " ";
    }
    printingNumber-=2;
    for(int num2 = 0; num2 < row; num2++, --printingNumber) {
      cout << printingNumber << " ";
    }
    cout<<endl;
  }
  
  //Method 2
  
  int n;
  cin>>n;
  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i; j++) {
      cout << "  ";
    }
    for (int j = i; j <= i*2-1 ; j++) {
      cout<<j << " ";
    }
    int ele = i + (i-2);
    for (int j = 1; j <= i - 1; j++) {
      cout << ele-- << " ";
    }
    cout << endl;
  }
  return 0;
}
