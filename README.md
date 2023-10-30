# MergeAndSort
This program uses a user defined method that merges two sorted lists into a new sorted list in a way that takes at most combined list length comparisons.
Goal: Write a program and use the given method header to create a method that merges two sorted lists into a new sorted list. Implement the method in a way that takes at most combined list length comparisons.

Input: The first list’s size and contents, the second list’s size and contents

Output: Sorted lists and sorted merged list

main method
Import java.util.Arrays and java.util.Scanner
Declare variables and create the two lists
Use for loops for both lists to read user inputs
Invoke convertToOrdinal method to change list number to its ordinal form to improve user readability
Invoke selectionSort method to sort the lists in ascending order
Declare and invoke merge method to create the combined list
Call displayLists method to print and output List 1, List 2, and merged list to the console.

merge method
Declare total length of both arrays 
int totalLength = list1.length + list2.length
Use Arrays.copy() to copy list1’s array into totalLength
Use System.arraycopy to copy list2 into the result array, from list1’s length to list2’s length
Invoke selectionSort method to sort result array in ascending order
Return result

convertToOrdinal method
Declare variables
mod100 is variable’s remainder after divided by 100
mod10 is variable’s remainder after divided by 10
If the remainder of mod10 ends in 1 and the remainder of mod100 doesn’t end in 11
Return variable + “st”
If the remainder of mod10 ends in 2 and the remainder of mod100 doesn’t end in 12
Return variable + “nd”
If the remainder of mod10 ends in 3 and the remainder of mod100 doesn’t end in 13
Return variable + “rd”
Else return variable + “th”

displayLists method
Print list1
Loop through the list to output each element
Print list2
Loop through the list to output each element
Print mergedList
Loop through the list to output each element

selectionSort method
Use for loop to loop through the list
Declare variables
currentMin = list[i]
currentMinIndex = i
Loop through the list to find the minimum in the list
Swap list with the currentMin if necessary
