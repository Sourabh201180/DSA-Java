// Binary Search 

#include<stdio.h>
#include<conio.h>
#define max 6

void main() {
    int a[max], f, l, mid, search, i;
    f = 0;
    l = max - 1;

    printf("Enter the Elements of an array:\n");
    for(i=0; i<max; i++) {
        scanf("%d",&a[i]);
    }

    printf("\nEnter the Element u want to search: ");
    scanf("%d",&search);

    while(f<=l) {
        mid = (f+l)/2;
        
        if(a[mid]>search) {
            l = mid - 1;
        }
        else if(a[mid]<search) {
            f = mid + 1;
        }
        else if(a[mid]==search) {
            printf("\n%d found at %d position.", search, mid+1);
            break;
        }
    }

    if(f>l) {
        printf("\n%d not found!", search);
    }
}