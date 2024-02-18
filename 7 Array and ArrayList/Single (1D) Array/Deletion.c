// Wap to delete element from an array

#include<stdio.h>
#include<conio.h>

int main() {
    int a[10], i, n, pos;

    printf("Enter the no. of Element u want in your array: ");
    scanf("%d", &n);

    printf("Enter %d elements of an array :\n", n);
    for(i=0; i<n; i++) {
        scanf("%d", &a[i]);
    }

    printf("Enter the position from where u want to remove the element: ");
    scanf("%d", &pos);

    for(i=pos; i<n-1; i++) {
        a[i] = a[i+1];
    }
    n--;

    printf("Array elements After insertion :");
    for(i=0; i<n; i++) {
        printf("\n%d", a[i]);
    }
    return 0;
}