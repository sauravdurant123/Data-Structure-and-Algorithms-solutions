##Largest element in an array
 
##Problem Statement: Given an array, we have to find the largest element in the array.

##Example
Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array. 

##Solutions
1. Brute Force 
   We use sorting algorithm and return the last element in the array 
Time - O(nlogn)
Space - O(1)

2. Better Approach
   We use a max_variable. which will store the Integer.MIN_VALUE, now we run a loop and inside the loop for each iteration we store the maximum value between the current and max variable and then return it.
Time - O(N)
Space - O(1)