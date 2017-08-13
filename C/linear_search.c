
// Linear Search
// This algorithm searches for a element x in a array in linear fashion.
// It compares every element of the array with x
// if true i.e array contains element x so it returns the index of x in the array
// else it returns -1
#include <stdio.h>
// Linear Search implementation
int linearSearch(int arr[],int size,int key){
  for (size_t i = 0; i < size; i++) {
    if(arr[i] == key)
    {
      return i;
    }
  }
  return -1;
}
// Main method to execute the program / Driver method
int main(int argc, char const *argv[]) {
  int arr[] = {12,23,45,56,78,89,14,25,36,47,58,69};
  int size = sizeof(arr)/sizeof(arr[0]);
  int key = 78;
  printf("%d\n",linearSearch(arr,size,key));
  return 0;
}
