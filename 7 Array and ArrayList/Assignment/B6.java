/* 
    Subtract the Product and Sum of Digits of an Integer
*/

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int n = 234;

        int digit = digits(n);
        int[] arr = arrCreator(digit, n);

        System.out.println(product(arr) - sum(arr));
    }

    public static int[] arrCreator(int dig, int n) {
        int[] arr = new int[dig];

        int i = 0;
        while(n>0) {
            arr[i] = n%10;
            n/=10;
            i++;
        }

        return arr;
    }

    public static int digits(int n) {
        int count = 0;

        while(n>0) {
            n /= 10;
            count++;
        }

        return count;
    }

    public static int product(int[] arr) {
        int prod = 1;
        
        for(int i : arr) {
            prod *= i;
        }

        return prod;
    }

    public static int sum(int[] arr) {
        int s = 0;

        for(int i : arr) {
            s += i;
        }

        return s;
    }
}