#include <stdio.h>
// Linear Search
// This algorithm searches for the key in the given array in linear fashion i.e it compares every element with key
// if key is found then it returns the index of key else it returns -1
int linearSearch(int arr[],int size,int key){
  for (size_t i = 0; i < size; i++) {
    if(arr[i] == key)
    {
      return i;
    }
  }
  return -1;
}

int main(int argc, char const *argv[]) {
  int arr[] = {12,23,45,56,78,89,14,25,36,47,58,69};
  int size = sizeof(arr)/sizeof(arr[0]);
  int key = 78;
  printf("%d\n",linearSearch(arr,size,key));
  return 0;
}
