package Arrays;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Generate an array of random numbers
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100); // generate random numbers between 0 and 99
        }

        // Print the original array
        

        // Calculate the starting time
        long startTime = System.nanoTime();

        // Selection sort algorithm
        selectionSort(arr);

        // Calculate the ending time
        long endTime = System.nanoTime();

        // Print the sorted array
       

        // Calculate the difference between the starting and ending times
        long timeDifference = endTime - startTime;

        // Print the time difference
        System.out.println("Time taken to sort the array: " + timeDifference + " nanoseconds");

        // Convert the time difference to milliseconds
        double timeDifferenceMs = (double) timeDifference / 1_000_000;

        // Print the time difference in milliseconds
        System.out.println("Time taken to sort the array: " + timeDifferenceMs + " milliseconds");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    
}

    