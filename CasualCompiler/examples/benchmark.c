#include <stdio.h>
#include <stdlib.h>
char* get_hello_w0rld() {
return "Hello World";
}
int d(int i) {
return 2*i;
}
int fib(int i) {
if (i<=2) {
return 1;
}
return fib(i-1)+fib(i-2);
}
int factorial(int i) {
int r = 1;
int a = 1;
while (a<=i) {
r = r*i;
a = a+1;
}
return r;
}
int main(int argc, char** ar) {
printf("%s\n",get_hello_w0rld());
printf("%d\n",d(1+2*3));
printf("%d\n",fib(5));
printf("%d\n",factorial(4));
int z = atoi(ar[0]);
return 0;
}
