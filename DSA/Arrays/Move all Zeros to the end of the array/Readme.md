##Move all Zeros to the end of the array

##Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.

##Example
Example 1:
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

Example 2:
Input: 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

##Solutions

1. Brute Force
   We use a temp array to store all the non zero elements in it from the main array. Now we run a loop from 0 to the size of the non zero array and place all the elements in the given array. After that we run another loop from non zero size to n and place 0 for the rest of the indexes in the main array.

   Time - O(N)
   Space - O(N)

2. Optimal Approach
   We use two pointer technique to move 0 to the end. We first find the index where the first zero is present, if no zero is present we simply return. We then keep a pointer at the first 0 index and then start the second pointer from index + 1 to n. For each elements we check if the element is not equal to 0 and if it is not we simply swap the element.

   Time - O(n)
   Space - O(1)
