//WAP to Display the Elements of the Queue

#include<stdio.h>
#include<conio.h>
#define max 5
int Q[max];
int f=0;
int r=0;
int i,n;
void inqueue()
{
    int x;
    printf("Enter the no. of Element u want to insert : ");
    scanf("%d",&n);
    printf("Enter %d elements in the Queue :\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&Q[i]);
    }
    if(r==max-1)
    printf("Queue is FULL");
    else
    {
        for(r=0,i=0;r<n&&i<n;r++,i++)
        Q[r] = Q[i];
    }
}
void dequeue()
{
    printf("Deleting Element...");
    if(f==r)
    printf("\nQueue is Empty");
    else
    {
        printf("\nDeleted element is %d",Q[f]);
        f=f+1;
    }
}
void display()
{
    if(f==r)
    printf("Queue is Empty");
    else
    {
        printf("\nQueue (After Deletion) contains :\n");
        for(i=f;i<r;i++)
        printf("\t%d",Q[i]);
    }
}
int main()
{
    inqueue();
    dequeue();
    display();
    return 0;
}