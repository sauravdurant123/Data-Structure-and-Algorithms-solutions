##Union of Two Sorted Arrays

##Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.

##Example
Example 1:
Input:
n = 5,m = 5.
arr1[] = {1,2,3,4,5}  
arr2[] = {2,3,4,4,5}
Output:
{1,2,3,4,5}

Explanation:
Common Elements in arr1 and arr2 are: 2,3,4,5
Distnict Elements in arr1 are : 1
Distnict Elemennts in arr2 are : No distinct elements.
Union of arr1 and arr2 is {1,2,3,4,5}

Example 2:
Input:
n = 10,m = 7.
arr1[] = {1,2,3,4,5,6,7,8,9,10}
arr2[] = {2,3,4,4,5,11,12}
Output: {1,2,3,4,5,6,7,8,9,10,11,12}
Explanation:
Common Elements in arr1 and arr2 are: 2,3,4,5
Distnict Elements in arr1 are : 1,6,7,8,9,10
Distnict Elemennts in arr2 are : 11,12
Union of arr1 and arr2 is {1,2,3,4,5,6,7,8,9,10,11,12}

##Solutions

1. Brute Force
   We use a HashSet and store all the unique elements in it. After that we run a loop and place the unique elements from the set to the resulting array list

   Time - O(m+n)
   Space - O(m+n)

2. Better Approach
   We use a HashMap to store the value and count of the elements in both the array. We then run another loop and then just return the key since it is unique.

   Time - O(m+n)
   Space - O(m+n)

3. Optimal Approach
   We use two pointer technique to get the union of two array. We run a while loop while either we don't reach the end of any of the given array. Now inside the while loop we will check if the element is lesser than or equal to the element in the second array. Now inside it for unqiue elements we will insert it to our list either if the list is initially empty or if the current element is not present in the list. The same thing is done for the else condition and for each if else we icrement the pointer accordingly. Now for differnt sizes of the arrays we run two separate while loops to inside the remaining elements in the list and then return it.

   Time - O(m+n)
   Space - O(m+n)
