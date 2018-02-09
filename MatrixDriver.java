public class MatrixDriver {

    public static void main( String[] args ) {
	for (int a = 1000; a < 10000; a+=100) {
	    int var = 0;
	    long sum = 0;
	    int[][] testA = new int[a][a];
	    for (int i = 0; i < testA.length; i++)
		for (int x = 0; x < testA.length; x++) {
		    testA[i][x] = var;
		    var++;
		}

	    for (int i = 0; i < 20; i++) {
	        long timeInit = System.nanoTime();
		
	        MatrixFinder.alg( testA, testA[0][testA.length - 1] );
		
	        long timeFinal = System.nanoTime();
		long timeOne = (timeFinal - timeInit)/20;
		sum += timeOne;
		//System.out.print(a + "," + timeOne + "\n");
	    }
	    System.out.print(a + "," + (sum / 20.) + "\n");
	}
	
	/*
	  int var = 0;
	  int[][] testB = new int[20000][20000];
	  for (int i = 0; i < testB.length; i++)
	  for (int x = 0; x < testB.length; x++) {
	  testB[i][x] = var;
	  var++;
	  }

	  for (int i = 0; i < 100; i++) {
	  System.out.println("testB Results:");
	  double timeInit = System.currentTimeMillis();
		
	  for(int n = 0; n < 10; n++){
	  MatrixFinder.alg( testB, testB[0][testB.length - 1]);
	  }
		
	  double timeFinal = System.currentTimeMillis();
	  System.out.println("Total Time: " + (timeFinal - timeInit));
	  double timeTotal = (timeFinal - timeInit)/10;
	  System.out.println("Time for One Search: " + timeTotal + "\n");
	  }
	*/
    }//end main

}
