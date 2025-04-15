##Second Largest element in an array

##Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

##Example
Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.

##Solutions

1. Brute Force
   We use sorting algorithm and return the second last element in the array
   Time - O(nlogn)
   Space - O(1)

2. Better Approach
   We use a max_variable and second_max variable which will initital store Integer.MIN_VALUE. Now we first run a loop and find the maximum value in the array. We run another loop and then check if the current element is greater than secondMax variable and it is not equal to max and then store the value in it.
   Time - O(2N)
   Space - O(1)

3. Optimal Approach
   We use a max_variable and second_max variable which will initital store Integer.MIN_VALUE. We run a single loop and check if the current element is greater than max if it is then we store the max variable value in secMax and current value in max. Else we check if the current value is greater than secMax but not equal to max.
   Time - O(n)
   Space - O(1)
