public class MFDriver {

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
		long timeOne = (timeFinal - timeInit);
		sum += timeOne;
		//System.out.print(a + "," + timeOne + "\n");

	    }
	    System.out.print(a + "," + (sum / 20.) + "\n");
	}
	
    }//end main

}
