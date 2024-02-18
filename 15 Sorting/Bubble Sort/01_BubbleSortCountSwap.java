import java.util.Scanner;

class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.close();

    int[] arr = new int[n];

    // int[] arr = {1, 4, 3, 2, 5};

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    if(bubbleSortAsc(arr) > bubbleSortDes(arr)) {
      System.out.println(bubbleSortDes(arr));
    } else {
      System.out.println(bubbleSortAsc(arr));
    }
  }

  static int bubbleSortAsc(int[] arr) {
    int count = 0;
    boolean flag;
    // run the steps n-1 times
    for (int i = 0; i < arr.length; i++) {
      flag = false;
      // for each step the max. element will come at the last respective index
      for (int j = 1; j < arr.length - i; j++) {
        // compare, swap if the item is smaller than its previous item
        if (arr[j] < arr[j - 1]) {
          // swap
          count++;
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
          flag = true;
        }
      }

      // if you didn't swap for a particular value of i, it means the array is sorted
      // hence stop the program.
      if (!flag) {
        // break;
        return count;
      }
    }

    return count;
  }

  static int bubbleSortDes(int[] arr) {
    int count = 0;
    boolean flag;
    // run the steps n-1 times
    for (int i = 0; i < arr.length; i++) {
      flag = false;
      // for each step the max. element will come at the last respective index
      for (int j = 1; j < arr.length - i; j++) {
        // compare, swap if the item is smaller than its previous item
        if(arr[j] < arr[j - 1]) {
          // swap
          count++;
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
          flag = true;
        }
      }

      // if you didn't swap for a particular value of i, it means the array is sorted
      // hence stop the program.
      if(!flag) {
        // break;
        return count;
      }
    }

    return count;
  }
}