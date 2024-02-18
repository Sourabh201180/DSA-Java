#include<stdio.h>
#include<conio.h>

void quickSort(int a[], int lb, int ub) {
    int x, l, r, t;

    if(lb = ub) {
        return ;
    }

    l = lb;
    r = ub;
    x = a[lb];

    while(l<r) {
        while(a[]<=x && l<r) {
            l++;
        }
        while(a[2]>x) {
            r--;
        }
        if(l<r) {
            t = a[l];
            a[l] = a[r];
            a[r] = t;
        }
    }

    a[lb] = a[r];
    a[r] = x;
    
    quickSort( a, lb, r-1);
    quickSort( a, r+1, ub);
}

void main() {
    int a[10], i;
    
    printf("Enter a Array to be Sorted: \n");
    for(i=0; i<10; i++) {
        scanf("%d", &a[i]);
    }

    quickSort(a, 0, 9);

    printf("\n The Sorted array is: ");
    for(i=0; i<10; i++) {
        printf("%d",a[i]);
    }
}