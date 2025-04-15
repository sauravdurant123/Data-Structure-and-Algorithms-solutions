##Find the number that appears once, and the other numbers twice

##Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.

##Example
Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.

##Solutions

1. Brute Force
   We run two loops to find the number that appears once in the array. In the first loop we keep a counter variable equal to 0, now in the second loop we increase the counter based on the element. Now we check if the count is 1 that means that it is the element that appears once and return it or else we return -1.

   Time - O(n^2)
   Space - O(1)

2. Better Approach 1
   We use a hash array to store the count of the elements in the array. Now we run a loop and increment the ith index of hash array if element is present or not. Now we run another loop and then return the index where the counter is 1.
   Time - O(2N)
   Space - O(max+1)

3. Better Approach 2
   We use a HashMap to store the element and the count. We run a loop and then store the element and the count. Now we run another loop for the hash map and then return the element where the count is 1.

   Time - O(2N)
   Space - O(N)

4. Optimal Approach
   We use the XOR concept to return the element appearing once as we know the xor of 2 same elements is 1. We run a loop and xor the entire elements present in the arrat the resulting XOR will have the element appearing once.
   Time - O(n)
   Space - O(1)
