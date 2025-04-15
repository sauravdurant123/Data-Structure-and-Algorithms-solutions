##Longest Subarray with sum K [Postives and Negatives]

##Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

##Example
Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 3, k = 1, array[] = {-1, 1, 1}
Result: 3
Explanation: The longest subarray with sum 1 is {-1, 1, 1}. And its length is 3

##Solutions

1. Brute Force
   We use three loops to find the sum of the sub arrays. The first two loops gets the sub array and the third loop iterates through that sub array range. We then check if the sum of the current sub array is equal to k. Then we store the length. At the end we return the max length found.

   Time - O(n^3)
   Space - O(1)

2. Better Approach
   Instead of three loops, we can reduce the loops to two as we know the second loop runs for a sub array only. So we get the sum of the current sub array and then check if it is equal to k and if it is we keep track of the max length and then return it.

   Time - O(n^2)
   Space - O(1)

3. Optimal Approach
   We use a Hashmap to store the prefix sum and the indices. Now we run a loop and check and add the sum of the current element and if it is equal to k then we store the length in a max length variable. So we know the entire sum till a certain point is sum and there is a sum of k inside it with a sum of x. So we neglect x from the entire sum. What it means is that we store the current sum and the index and we check if it is present in the HashMap and if it is present we store the maxLength. Also in order to get the max length we add the key if only it is not present in order to get the maxLength.

   Time - O(n)
   Space - O(n)
