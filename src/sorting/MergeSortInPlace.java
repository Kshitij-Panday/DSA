package sorting;

import java.util.Arrays;

public class MergeSortInPlace {

  public static void main(String[] args) {
    int[] arr = {8, 3, 4, 12, 5, 6};

    mergeSortInPlace(arr, 0, arr.length);

    System.out.println(Arrays.toString(arr));
  }

  static void mergeSortInPlace(int[] arr, int s, int e) {
    // Base case: array of length 1
    if (e - s == 1) {
      return;
    }

    int mid = s + (e - s) / 2;

    // Sort left half
    mergeSortInPlace(arr, s, mid);

    // Sort right half
    mergeSortInPlace(arr, mid, e);

    // Merge the two sorted halves
    mergeInPlace(arr, s, mid, e);
  }

  static void mergeInPlace(int[] arr, int s, int mid, int e) {
    int[] mix = new int[e - s];

    int i = s;
    int j = mid;
    int k = 0;

    // Merge both halves
    while (i < mid && j < e) {
      if (arr[i] < arr[j]) {
        mix[k++] = arr[i++];
      } else {
        mix[k++] = arr[j++];
      }
    }

    // Copy remaining elements of left half
    while (i < mid) {
      mix[k++] = arr[i++];
    }

    // Copy remaining elements of right half
    while (j < e) {
      mix[k++] = arr[j++];
    }

    // Copy merged array back to original array
    for (int l = 0; l < mix.length; l++) {
      arr[s + l] = mix[l];
    }
  }
}