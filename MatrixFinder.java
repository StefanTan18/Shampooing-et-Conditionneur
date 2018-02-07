//Team Shampooing et Conditionneur (Cheryl Qian, Stefan Tan, Lynne Wang)
//APCS2 pd1
//HW03 -- I Am Still Searching
//2018-02-01

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
    
    public static void main( String[] args ) {
    	int[][] testA = { { 1 , 3 , 5 } ,
			  { 7 , 9 , 11 } ,
			  { 13 , 15 , 17 }
	};
	/*System.out.println(alg( testA, 0 )); //should return (-1, -1)
	  System.out.println(alg( testA, 3 )); // (0, 1)*/
      
	int[][]  testB = { { 0, 4, 7, 11, 15} ,
			   { 2, 5, 8, 12, 19 } ,
			   { 3, 6, 9, 16 , 22 } ,
			   { 10, 17, 18, 42, 56 },
			   { 11, 18, 19, 46, 59 }
	};

<<<<<<< HEAD
	System.out.println("testA Results:");
	for (int[] r : testA){
	    for (int item : r){
		
		double timeInit = System.currentTimeMillis();
		
		for(int n = 0; n < 100000; n++){
		    alg( testB, item);
		}
		
		double timeFinal = System.currentTimeMillis();
		System.out.println("Total Time: " + (timeFinal - timeInit));
		double timeTotal = (timeFinal - timeInit)/100000;
		System.out.println("Time for One Search: " + timeTotal + "\n");
	    }
	}

	System.out.println("================================");
	for (int[] r : testB){
	    for (int item : r){
		
		double timeInit = System.currentTimeMillis();
		
		for(int n = 0; n < 100000; n++){
		    alg( testB, item);
		}
		
		double timeFinal = System.currentTimeMillis();
		System.out.println("Total Time: " + (timeFinal - timeInit));
		double timeTotal = (timeFinal - timeInit)/100000;
		System.out.println("Time for One Search: " + timeTotal);
	    }
	}
=======
	double timeInit = System.currentTimeMillis();
	
	for(int n = 0; n < 10000; n++){
	    alg( testB, 9);
	}

	double timeFinal = System.currentTImeMillis();
	System.out.println(timeFinal - timeInit):
>>>>>>> c538f3759be6ee17016bbe5f44de229e7a389d8f

	/*System.out.println(alg( testB, 15)); // (0, 4)
	System.out.println(alg( testB, 0));  // (0, 0)
	System.out.println(alg( testB, 56)); // (3, 4)
	System.out.println(alg( testB, 15)); // (0, 4)
	System.out.println(alg( testB, 22)); // (2, 4)
	System.out.println(alg( testB, 16)); // (2, 3)
	System.out.println(alg( testB, 47)); // (-1, -1)*/

    }//end main
}//end class
		    
