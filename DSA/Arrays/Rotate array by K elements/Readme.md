##Rotate array by K elements

##Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

##Example
Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left
Output: 9 10 11 3 7 8
Explanation: Array is rotated to right by 3 position.

##Solutions

1. Brute Force
   For Right Rotate, we will use a temp array to store the k elements from the right of the original array. We will have a for loop from n-k to n and we store the elements in the temp array (i-n+k) index start. Now we run another loop and then we start shifting the elements from n-k-1 to the right by kth elements. Now we run another loop and place the from 0 to k and place the temp arr elements to nums arr.

   For Left Rotate, we will use a temp array and place the kth elements from the left to the temp array. Now we will run a loop from 0 to n-k and then we left shift the nums array elements. For the remaining elements we run a loop from n-k to n and place the remaining elements from temp array to original array.

   Time - O(3N)
   Space - O(K)

2. Optimal Approach
   For right rotate, we will rotate the array three times, one from 0 to n-k-1, 2nd from n-k to n-1 and third from o to n. This will rotate the array.

   For left rotate, we will rotate the array three times, one from o to k-1, 2nd from k to n-1 and the third from 0 to n-1

   Time - O(n)
   Space - O(1)
