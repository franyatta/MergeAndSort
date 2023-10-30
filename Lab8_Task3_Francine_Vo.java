/*
 * Lab8_Task3_Francine_Vo.java
 * Francine Vo
 * 01253035
 * 10/28/2023
 */
import java.util.Arrays;
import java.util.Scanner;
public class Lab8_Task3_Francine_Vo {

	public static void main(String[] args) {
		// Declare variables and create two arrays
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the " + convertToOrdinal(1) + " list's size: ");
		int length1 = input.nextInt();
		int[] list1 = new int[length1];
		for (int i = 0; i < list1.length; i++) {
			System.out.print(
					"Enter list 1's " + convertToOrdinal(i + 1) + " number: ");
			list1[i] = input.nextInt();
		}
		selectionSort(list1); // Sorts the 1st list in ascending order

		System.out.print("Enter the " + convertToOrdinal(2) + " list's size: ");
		int length2 = input.nextInt();
		int[] list2 = new int[length2];
		for (int i = 0; i < list2.length; i++) {
			System.out.print(
					"Enter list 2's " + convertToOrdinal(i + 1) + " number: ");
			list2[i] = input.nextInt();
		}
		selectionSort(list2); // Sorts the 2nd list in ascending order

		// Invoke merge method to create combined arrays
		int[] mergedList = merge(list1, list2);
		input.close();

		// Invoke displayLists method to output all lists to console
		displayLists(list1, list2, mergedList);
	}
	// Create user defined method that concatenates both arrays
	public static int[] merge(int[] list1, int[] list2) {
		// Declare total length of both arrays
		int totalLength = list1.length + list2.length;

		int[] result = Arrays.copyOf(list1, totalLength); // Copies list1 into totalLength
		System.arraycopy(list2, 0, result, list1.length, list2.length);

		// Sort and return the merged array
		selectionSort(result);
		return result;
	}
	// Create method that converts integers to their ordinal form
	public static String convertToOrdinal(int i) {
		
		// Declare variables
		int mod100 = i % 100;
		int mod10 = i % 10;
		
		if (mod10 == 1 && mod100 != 11) {
			return i + "st";
		} else if (mod10 == 2 && mod100 != 12) {
			return i + "nd";
		} else if (mod10 == 3 && mod100 != 13) {
			return i + "rd";
		} else {
			return i + "th";
		}
	}
	// Create method that outputs all the lists
	public static void displayLists(int[] list1, int[] list2,
			int[] mergedList) {
		System.out.print("List 1 is ");
		for (int element : list1)
			System.out.printf("%d ", element);
		System.out.print("\n");

		System.out.print("List 2 is ");
		for (int element : list2)
			System.out.printf("%d ", element);
		System.out.print("\n");

		System.out.print("The merged list is ");
		for (int element : mergedList)
			System.out.printf("%d ", element);
		System.out.print("\n");
	}
	public static void selectionSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list
			int currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			// Swap list[i] with list[currentMinIndex] if necessary:
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}