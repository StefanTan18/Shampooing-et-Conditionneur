/*
  Starts at the element at the bottom left and compare it to the number that is 
  being searched for, x.
  If x is greater than that element then compare it to the element to the right.
  If x is less than that element then compare it to the element one row above.
  For every element you compare x - if x is greater than the elemnt, compare x 
  to the element on the right. If x is less than the element to the right, then 
  compare x to to the element above.
  Repeat that step until the element equals x.
*/

/*Noticed
- OutOfMemoryError: Java heap space
 */

public class MatrixFinder{
	
    public static String alg(int[][] matrix, int n){
	int dims = matrix.length; //number of rows and number of columns
	int track = 0; //stores the column to compare n to
	for (int r = dims - 1; r >= 0; r--){ //starts from the bottom left of the matrix, iterates to row above
	    for (int c = track; c < dims; c++){ //iterates to next column
		if (n < matrix[r][c]){
		    track = c; 
		    break; //exits inner loop and returns to the outer loop
		}
		else if (n == matrix[r][c]) {
		    return "(" + r + ", " + c + ")"; //returns coordinates of n when it is found
		}
	    }
	}
	return "(" + -1 + ", " + -1 + ")";
    }
    
}//end class
		    
