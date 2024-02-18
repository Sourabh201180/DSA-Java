//Wap to Reverse a string in stack

#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>
#define MAX 20
int top = -1;
char stack[MAX];
char pop();
void push(char);

void push(char item)
{
    if(top == (MAX-1))
    {
        printf("\nStack is Full\n");
        return;
    }
    stack[top=top+1] = item;
}

char pop()
{
    if(top == -1)
    {
        printf("\nStack is Empty\n");
        exit(1);
    }
    return stack[top--];
}

int main()
{
    char str[20];
    int i;
    printf("Enter the string : ");
    gets(str);
    for(i=0;i<strlen(str);i++)
        push(str[i]);
    for(i=0;i<strlen(str);i++)
        str[i]=pop();
    printf("\nReversed string is : ");
    puts(str);
    return 0;
}


/*#include<stdio.h>
#include<conio.h>
#include<string.h>
int main()
{
    char s[10],*a,*b,temp = 0;
    int i,n;
    n = strlen(s);
    printf("Enter the string : ");
    for(i=0;i<n/2;i++)
    {
        scanf("%s",&s[i]);
    }
    *a = &s[i];
    *b = &s[n-i-1];
    for(i=0;i<n/2;i++)
    {
        //temp = &s[i];
        //&s[i] = &s[n-i-1];
        //&s[n-i-1] = temp;
        temp = *a;
        *a = *b;
        *b = temp;
    }
    printf("Reversed string is : %s",s);
    return 0;
}*/