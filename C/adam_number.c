/*
Adam number is a number when reversed, the square of number and the square of reversed number
should be numbers which are reverse of each other.
*/
#include <stdio.h>

int revserDigits(int num) {
  int res = 0;
  while (num > 0) {
    res = res * 10 + num % 10;
    num /= 10;
  }
  return res;
}

int square(int num) {
  return num * num;
}

int isAdam(int num) {
  return (square(num) == revserDigits(square(revserDigits(num))));
}

int main(int argc, char const *argv[]) {
  printf("%d\n", isAdam(12));
  return 0;
}
