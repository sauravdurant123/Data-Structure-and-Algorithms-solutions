##Check if an Array is Sorted

##Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.

Note: Two consecutive equal values are considered to be sorted.

##Example
Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: True.
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

Example 2:
Example 2:
Input: N = 5, array[] = {5,4,6,7,8}
Output: False.
Explanation: The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False.

Here element 5 is not smaller than or equal to its future elements.

##Solutions

1. Brute Force
   We run two loops, one will run from 0 to n, the other from i+1 to n and we will check if any future elements is greater than the current element and if it we return false else return true.

   Time - O(N^2)
   Space - O(1)

2. Optimal Approach
   We know that the next element should always be smaller then the next element in the array. So we run a single loop and in each iteration we check if the ith element is greater than the next element than it is not sorted and we return false else we return true.

   Time - O(n)
   Space - O(1)
