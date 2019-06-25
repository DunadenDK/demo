import java.util.*;

public class TimingTest {
  public static void main(String[] args) {
     
    Map<String, String> HM = new HashMap<String,String>();
    Map<String, String>TM = new TreeMap<String,String>();
    
//Hashmap put
    
    long startTimeHMP = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            HM.put(Integer.toString(i), "foo");
        }
    long endTimeHMP = System.nanoTime();
    long durationHMP = endTimeHMP - startTimeHMP;

 System.out.println("HashMap put: " + durationHMP);
 
 //Hashmap get
 
    long startTimeHMG = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            HM.get("0");
            HM.get("1");
            HM.get("2");
            HM.get("3");
            HM.get("4");
            HM.get("5");
            HM.get("6");
            HM.get("7");
            HM.get("8");
            HM.get("9");
        }
    long endTimeHMG = System.nanoTime();
    long durationHMG = endTimeHMG - startTimeHMG;

 System.out.println("HashMap get: " + durationHMG);
 
 //Hashmap remove
 
    long startTimeHMR = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            HM.remove(Integer.toString(i), "foo");
        }
    long endTimeHMR = System.nanoTime();
    long durationHMR = endTimeHMR - startTimeHMR;

 System.out.println("HashMap remove: " + durationHMR);




  //Treemap put
    long startTMP = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            TM.put(Integer.toString(i), "foo");
        }
    long endTMP = System.currentTimeMillis();
    long durationTMP = endTMP - startTMP;
    
 System.out.println("TreeMap put: " + durationTMP);
 
 //Treemap get
 
    long startTMG = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            TM.get("0");
            TM.get("1");
            TM.get("2");
            TM.get("3");
            TM.get("4");
            TM.get("5");
            TM.get("6");
            TM.get("7");
            TM.get("8");
            TM.get("9");
        }
    long endTMG = System.currentTimeMillis();
    long durationTMG = endTMG - startTMG;
    
 System.out.println("TreeMap get: " + durationTMG);
 
 //Treemap remove
 
    long startTMR = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            TM.remove(Integer.toString(i), "foo");
        }
    long endTMR = System.currentTimeMillis();
    long durationTMR = endTMR - startTMR;
    
 System.out.println("TreeMap remove: " + durationTMR);

  }
 }
