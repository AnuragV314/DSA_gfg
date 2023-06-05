#include <stdio.h>

int fun1(int n);
int fun2(int n);
int fun3(int n);

int main()
{
    // printf("Frist fun output: ");
    // printf("%d", fun1(5));
    // printf("Frist fun2 output: ");
    // printf("%d", fun2(5));
    printf("Frist fun3 output: ");
    printf("%d", fun3(5));
}

int fun1(int n)
{
    return n * (n + 1) / 2;
}


int fun2(int n){
    int sum = 0;
    for(int i=1; i<=n; i++){
        sum = sum+i;
    }
    return sum;
}


int fun3(int n){
    int sum = 0;
    for(int i=1; i<=n; i++){
        for(int j=1;i<=i;j++){
            sum++;
        }
    }
    return sum;
}
