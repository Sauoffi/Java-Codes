#include <stdio.h>
int main()
{
    long int Fact(int a);
    int a;
    printf("Enter a number :");
    scanf("%d", &n);
    printf("Factorial of %d = %ld", n, Fact(a));
    return 0;
}

long int Fact(int a)
{
    if (a >= 1)
    {
        return n * Fact(a - 1);
    }
    else
    {
        return1;
    }
}