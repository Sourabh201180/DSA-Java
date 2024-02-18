// a[6]={2,4,8,9,10,14}
// b[8]={1,3,6,7,11,15,18,45}

#include<stdio.h>

int main() {
    int i, j, k, m, n, a[6]={2,4,8,9,10,14}, b[8]={1,3,6,7,11,15,18,45}, c[14];
    m = sizeof(a)/sizeof(int);
    n = sizeof(b)/sizeof(int);

    while(i<m && j<n) {
        if(a[i]<b[j]) {
            c[k] = a[i];
            i++;
        } else {
            c[k] = b[j];
            j++;
        }
        k++;
    }

    while(i<m || j<n) {
        if(i<m) {
            c[k] = a[i];
            i++;
        } else {
            c[k] = b[j];
            j++;
        }
        k++;
    }

    printf("Sorted elements are: \n");
    for(k=0 ; k<(m+n) ; k++) {
        printf("\t%d",c[k]);
    }

    return 0;
}