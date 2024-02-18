// Binary Search
// Pre-requisits => already Sorted array has to be passed.

#include<conio.h>
#include<stdio.h>

int binarySort(int a[], int s, int e, int key) {
    while(s<=e) {
        int mid = (s+e)/2;
        if(a[mid]==key) {
            return mid;
        }
        else if(a[mid]<key) {
            s = mid + 1;
        }
        else if(a[mid]>key) {
            e = mid -1;
        }
    }
    return -1;
}

void main() {
    int a[] = {10, 20, 30, 40, 50, 60, 70};
    int n = sizeof(a)/sizeof(int);
    int s = 0;
    int e = n-1;
    int key = 220;

    int ans = binarySort(a, s, e, key);
    
    if(key!=0) {
        printf("\nkey (%d) not found! ", key);
    }
    else {
        printf("\nKey (%d) found at position : %d", key, ans);
    }
}