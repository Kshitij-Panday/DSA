package sorting;

import java.util.Arrays;

// Bubble Sort
public class BubbleSort {

  public static void main(String[] args) {

    int[] arr = {2, 5, 8, 7, 9, 3, 11, 6};

    bubbleSort(arr);

    System.out.println(Arrays.toString(arr));
  }

  static void bubbleSort(int[] arr) {

    // checks if array is already sorted
    boolean swapped;

    for (int i = 0; i < arr.length; i++) {

      swapped = false;

      // after each pass, largest element moves to the end
      for (int j = 1; j <= arr.length - i - 1; j++) {

        // swap if current element is smaller
        if (arr[j] < arr[j - 1]) {

          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;

          swapped = true;
        }
      }

      // if no swapping happened, array is sorted
      if (!swapped) {
        break;
      }
    }
  }
}