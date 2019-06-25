import java.util.*;

public class Set {

public static void main(String[] args) {
 
	Random r = new Random();
 
	HashSet<Integer> hashSet = new HashSet<Integer>();
	TreeSet<Integer> treeSet = new TreeSet<Integer>();

	// start time
	long startTime = System.nanoTime();
 
	for (int i = 0; i < 1000; i++) {
		int x = r.nextInt(1000 - 10) + 10;
		hashSet.add(new Integer(x));
	}
	// end time
	long endTime = System.nanoTime();
	long duration = endTime - startTime;
	System.out.println("HashSet: " + duration);
 
	// start time
	startTime = System.nanoTime();
	for (int i = 0; i < 1000; i++) {
		int x = r.nextInt(1000 - 10) + 10;
		treeSet.add(new Integer(x));
	}
	// end time
	endTime = System.nanoTime();
	duration = endTime - startTime;
	System.out.println("TreeSet: " + duration);
 
}
}