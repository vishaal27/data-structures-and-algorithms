/*
Knuth Algoritm is Algoritm (referred as TPK Algoritm) introduced by Donald Knuth and Luis Trabb Pardo to illustrate
the evolution of computer programming languages.
This Algorithm involves arrays, indexing, mathematical functions, i/o, subroutines, conditionals and iteration.
Algorithm :
ask for 11 numbers to be read into a array s
reverse the array s
for each element in array s
  call a functions to mathematical operation
  if result overflows
    alert user
  else
    print result
*/
#include <stdio.h>
#include <math.h>

// mathematical function f
double f(int n) {
  return sqrt(fabs(n)) + 5.0 * pow(n,3.0);
}

// menthod to reverse the array
void reverseArray(int arr[],int start,int end) {
  int temp;
  while (start < end) {
    temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
  }
}

int main(int argc, char const *argv[]) {
  const int size = 11;
  int arr[size];
  // read inputs to array
  for (size_t i = 0; i < size; i++) {
    scanf("%d",&arr[i]);
  }

  // reverse the array
  reverseArray(arr,0,size-1);

  // iterate through each element of array
  for (size_t i = 0; i < size; i++) {
    // compute mathematical function for each element
    double y = f(arr[i]);
    // check the conditional
    if(y > 400)
    {
      printf("Too Large\n");
    }
    else
    {
      printf("%d\n", arr[i]);
    }
  }
  return 0;
}
