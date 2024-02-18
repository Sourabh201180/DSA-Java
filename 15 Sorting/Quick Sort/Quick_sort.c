// a[6] = {6, 3, 9, 5, 2, 8}

#include<stdio.h>

void main() {
    int a[] = {6, 3, 9, 5, 2, 8};
    // int n = sizeof(a);
    int n = 6;

    quicksort(a, 0, n-1);
    for(int i=0; i<n; i++) {
        printf("\t%d",a[i]);
    }
}

void quicksort(int a, int lb, int ub) {
    if(lb<ub) {
        int pivindx = partition(a, lb, ub);
        quicksort(a, lb, pivindx-1);    // for lesser values w.r.t pivot
        quicksort(a, pivindx+1, ub);    // for greater values w.r.t pivot
    }
}

int partition(int a, int lb, int ub) {
    int piv = a[ub];
    int i = (lb-1);
    
    for(int j=lb; j<ub; j++) {
        if(a[j]<piv) {
            i++;
            // perform swap operation
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    i++;
    int temp = a[i];
    a[i] = piv;
    a[ub] = temp;

    return i;
}