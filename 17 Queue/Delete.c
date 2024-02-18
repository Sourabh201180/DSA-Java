//WAP to delete an element from the Queue

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
void delete()
{
    printf("Delete the Element");
    if(f==r)
    printf("\nQueue is Empty");
    else
    {
        printf("\nDeleted element is %d",Q[f]);
        f=f+1;
    }
}
int main()
{
    insert();
    delete();
    return 0;
}