//WAP to Insert the elements into the Queue

#include<stdio.h>
#include<conio.h>
#define max 5
int Q[max];
int f=0;
int r=0;
void insert()
{
    int x;
    printf("Enter the Element u want to insert : ");
    scanf("%d",&x);
    if(r==max)
    printf("Queue is FULL");
    else
    {
        Q[r] = x;
        r = r + 1;
    }
}
int main()
{
    insert();
    return 0;
}