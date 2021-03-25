package sorting;

import java.util.Comparator;

public class SortingDemo {
    public static void main(String[] args) throws Exception {
        Sorter s = (Sorter) MiFactory.getInstance("ggg");
        System.out.println(s);
        Integer[] testArray = new Integer[5];
        for (int i = testArray.length; i > 0; i--) {
            testArray[i-1]= i;
        }
        Comparator<Integer> intComp = (a,b)->a-b;
        Timer t = new Timer();
        t.setStartTime((double) System.currentTimeMillis());
        s.sort(testArray, intComp);
        t.setEndTime((double) System.currentTimeMillis());
        System.out.println("Tiempo: "+t.elapsedTime());

    }
}
