##Find the missing number in an array

##Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.

##Example
Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.

Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.

##Solutions

1. Brute Force
   We use two loops, one will run from 1 to n and other from 0 to n-1 for the array elements. Now in the second loop we will check if the current number is missing or not and if it is missing we return the number. Else we return -1

   Time - O(N^2)
   Space - O(1)

2. Better Approach
   We use a hash array the sizr of n+1 and then we run a loop and check if the and add 1 to the index of the hash array. Now we run another loop and then we check if any index is 0 which means it is the missing number and return the index or else we return -1.

   Time - O(2N)
   Space - O(N)

3. Optimal Approach 1
   We will use mathematical formula to find the missing number in the array. We know that the sum of n natural numbers is n \* (n+1)/2, so we calculate it. We will run a loop and then sum up all the elements in the array. Now we find the difference between the natural numbers sum and the sum of elements in the array which will return us the missing number.
   Time - O(n)
   Space - O(1)

4. Optimal Approach 2
   We will XOR operator to find the missing number in the array. We know that XOR of two same numbers is equal to 1. So in the loop we get the XOR of all n numbers as well as XOR of array elements in the array. Now we do another XOR between XOR of natural numbers of XOR of elements which will return us the missing number.

   Time - O(n)
   Space - O(1)
