package Divide_and_Conqure;
/*
 * Remember always in divide and conqure we should use recurrison .
 * 
 * JUST WATCH VIDEO ONCE ITS EASY
 * 
 * 
 */
public class INTV_QuickSort {
    public static void printarr(int arr[]){
        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        // Base case to stop recursion
        if (si >= ei) {
            return;
        }

        // Last element
        int pinx = partition(arr, si, ei);
        quickSort(arr, si, pinx - 1);
        quickSort(arr, pinx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for the elements smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // To put pivot in correct place at last
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        quickSort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
