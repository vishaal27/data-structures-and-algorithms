#include <stdio.h>

int fib(int n){
  if(n <= 1){
    return n;
  }
  return fib(n-2) + fib(n-1);
}
// Genrates fibonacci sequence upto 8 terms
int main(int argc, char const *argv[]) {
  int n = 8;
  for (size_t i = 0; i < n; i++) {
    printf("%d ", fib(i));
  }
  printf("\n");
  return 0;
}
