#include <stdio.h>
#include <math.h>
int findPrime(int n);

int main()
{
    int n, primeNumber;
    printf("Enter a number: ");
    scanf("%d", &n);

    primeNumber = findPrime(n);
    if (primeNumber == 1)
    {
        printf("Number is prime.\n");
    }
    else
    {
        printf("Number is not prime.\n");
    }
}

// int findPrime(int n){
//     if(n==1) return 0;
//     if(n==2 || n==3) return 1;
//     if(n%2==0 || n%3==0) return 0;
//     for(int i=5; i*i<=n ; i=i+6)
//         if(n%i==0||n%(i+2)==0)
//             return 0;
//     return 1;
// }

int findPrime(int n)
{
    for (int i = 0; i <= n/2; i++)
    {
        if ((6 * i + 1) == n)
            return 1;
    }
    return 0;
}
