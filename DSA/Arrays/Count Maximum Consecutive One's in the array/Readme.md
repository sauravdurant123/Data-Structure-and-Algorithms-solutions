##Count Maximum Consecutive One's in the array

##Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

##Example
Example 1:
Input: prices = {1, 1, 0, 1, 1, 1}
Output: 3
Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

Input: prices = {1, 0, 1, 1, 0, 1}
Output: 2
Explanation: There are two consecutive 1's in the array.

##Solutions

1. Optimal Approach
   We have a count to store the current count and a maxCount to store the count of maximum 1. Now we run a loop from 0 to n and if we will increase the counter for consecutive 1s and whenever there is another value we reduce the count to 0. Now we will update the maxCount with the counter.
   Time - O(n)
   Space - O(1)
