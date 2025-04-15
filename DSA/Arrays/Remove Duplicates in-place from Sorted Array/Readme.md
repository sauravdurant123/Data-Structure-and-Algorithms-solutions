##Remove Duplicates in-place from Sorted Array

##Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.

##Example
Example 1:

Input: arr[1,1,2,2,2,3,3]

Output: arr[1,2,3,_,_,_,_]

Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Example 2:

Input: arr[1,1,1,2,2,3,3,3,3,4,4]

Output: arr[1,2,3,4,_,_,_,_,_,_,_]

Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.

##Solutions

1. Brute Force
   We use a HashSet to first store the unique values in the array by running a loop. Now we run another for loop in the hash set and place it in the original array and then we return the size of the hash set.

   Time - O(2N)
   Space - O(N)

2. Optimal Approach
   We use two pointer technique to remove duplicates in the array. So the first pointer will start from 0 and the other pointer will start from i+1 to n. Now in the loop we will check if the arr element is not equal to the ith pointer and then we increase the first pointer and then swap the values, at then end we return the ith pointer value which will be the length of the array.

   Time - O(n)
   Space - O(1)
