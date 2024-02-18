//Wap to Pop the elements of the stack

#include<stdio.h>
#include<conio.h>
int main()
{
    int s[10],top=-1,i,n;
    printf("Enter the max. no. of element u want to push : ");
    scanf("%d",&n);
    //push
    if(top==n-1)
    printf("Stack is Full");
    else
    {
        printf("Push Elements into the stack :\n");
        for(i=0;i<n;i++)
        {
            int elem;
            printf("Enter %d element : ",i+1);
            scanf("%d",&elem);
            top = top + 1;
            s[top] = elem;
        }
    }
    //Original stack
    printf("Original Stack contains : ");
    for(i=0;i<n;i++)
    {
        printf("\n\t%d",s[i]);
    }
    //Pop
    if(top==-1)
    printf("Stack is Empty");
    else
    {
        int elem;
        elem = s[top];
        printf("\nDeleted element is %d",elem);
        top = top - 1;
        n = n - 1;
    }
    //Display
    printf("\nStack After Deletion is : ");
    for(i=0;i<n;i++)
    {
        printf("\n\t%d",s[i]);
    }
    return 0;
}