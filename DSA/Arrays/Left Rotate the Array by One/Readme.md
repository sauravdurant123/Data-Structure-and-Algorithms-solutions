##Left Rotate the Array by One

##Problem Statement: Given an array of N integers, left rotate the array by one place.

##Example
Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1
Explanation:
Since all the elements in array will be shifted
toward left by one so ‘2’ will now become the
first index and and ‘1’ which was present at
first index will be shifted at last.

Example 2:
Input: N = 1, array[] = {3}
Output: 3
Explanation: Here only element is present and so
the element at first index will be shifted to
last index which is also by the way the first index.

##Solutions

1. Brute Force
   We use a temp array to store the rotated array in it. So we run a loop from 1 to n and inside it we place ith+1 element in the ith index of the temp array lastly we will store the 0th index value in the nth-1 index of temp array and return it.

   Time - O(N)
   Space - O(N)

2. Optimal Approach
   We use the original array for traversal. We store the first element (0th index) in a temp variable and then we run a loop where in the ith index we place the ith + 1 index value at last in the n-1 index we place the temp value.

   Time - O(n)
   Space - O(1)
