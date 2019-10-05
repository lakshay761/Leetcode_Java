package ip1_n;

//https://leetcode.com/problems/sort-array-by-parity/

//Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

//You may return any answer array that satisfies this condition.

//Example:
//Input: [3,1,2,4]
//Output: [2,4,3,1]
//Explanation
//The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

//Note:
//1 <= A.length <= 5000
//0 <= A[i] <= 5000

//Solution
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
 	 	int temp = 0;
 	 	 for(int j = 0 ; j< A.length ; j++){
 	 	     if(A[j] %2 == 0){
 	 	         temp = A[i];
 	 	         A[i] = A[j];
 	 	         A[j] = temp;
 	 	         i++;
 	 	     }
 	 	 }
 	 	 return A;
    }
}
