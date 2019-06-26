import java.util.*;

public class SetCompare {

public static void main(String[] args) {
 
	Random r = new Random();
 
	HashSet<Integer> hashSet = new HashSet<Integer>();
	TreeSet<Integer> treeSet = new TreeSet<Integer>();
	
	// start time
	long startTimeHSA = System.nanoTime();
    	for (int i = 0; i < 1000; i++) {
	    	int x = r.nextInt(1000 - 10) + 10;
	    	hashSet.add(new Integer(x));
	    }
	// end time
	long endTimeHSA = System.nanoTime();
	long durationHSA = endTimeHSA - startTimeHSA;
	
	System.out.println("HashSet add: " + durationHSA);
	
		// start time
	long startTimeHSR = System.nanoTime();
 	    for (int i = 0; i < 1000; i++) {
		    int x = r.nextInt(1000 - 10) + 10;
		    hashSet.remove(new Integer(x));
	    }
	// end time
	long endTimeHSR = System.nanoTime();
	long durationHSR = endTimeHSR - startTimeHSR;
	
	System.out.println("HashSet remove: " + durationHSR);
	
	

	// start time
	long startTimeTSA = System.nanoTime();
	    for (int i = 0; i < 1000; i++) {
		    int x = r.nextInt(1000 - 10) + 10;
		    treeSet.add(new Integer(x));
	    }
	// end time
	long endTimeTSA = System.nanoTime();
	long durationTSA = endTimeTSA - startTimeTSA;
	
	System.out.println("TreeSet add: " + durationTSA);

	// start time
    long startTimeTSR = System.nanoTime();
	    for (int i = 0; i < 1000; i++) {
		    int x = r.nextInt(1000 - 10) + 10;
		    treeSet.add(new Integer(x));
	    }
	// end time
	long endTimeTSR = System.nanoTime();
	long durationTSR = endTimeTSR - startTimeTSR;
	
	System.out.println("TreeSet remove: " + durationTSR);
 
}
}