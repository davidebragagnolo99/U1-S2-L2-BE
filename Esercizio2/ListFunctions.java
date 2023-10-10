package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFunctions {
    public static List<Integer> generateRandomList(int N) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < N; i++) {
            randomList.add(random.nextInt(101));
        }

        Collections.sort(randomList);
        
        return randomList;
    }
    
    public static List<Integer> createInverseList(List<Integer> originalList) {
        List<Integer> inverseList = new ArrayList<>(originalList);
        Collections.reverse(inverseList);

        return combinedList;
    }
    
    public static void printListByParity(List<Integer> list, boolean printEven) {
        for (int i = 0; i < list.size(); i++) {
            if (printEven && i % 2 == 0) {
                System.out.println(list.get(i));
            } else if (!printEven && i % 2 != 0) {
                System.out.println(list.get(i));
            }
        }
    }
}
