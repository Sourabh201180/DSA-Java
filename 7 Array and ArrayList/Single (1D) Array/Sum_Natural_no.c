//WAP to print the sum n natural no.

#include<stdio.h>
#include<conio.h>
void main()
{
    int i,n,s=0;
    printf("Enetr the last natural no. upto which u want the sum : ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        s = s + i;
    }
    printf("\nThe sum %d natural no. is %d",n,s);
}