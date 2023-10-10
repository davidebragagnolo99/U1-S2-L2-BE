package Esercizio2;

import java.util.List;

public class App {
    public static void main(String[] args) {
        int N = 10;
        List<Integer> randomList = ListFunctions.generateRandomList(N);

        System.out.println("Random List: ");
        System.out.println(randomList);

        List<Integer> combinedList = ListFunctions.createInverseList(randomList);

        System.out.println("Combined List: ");
        System.out.println(combinedList);

        boolean printEven = true;
        System.out.println("Even Positions: ");
        ListFunctions.printListByParity(combinedList, printEven);

        printEven = false;
        System.out.println("Odd Positions: ");
        ListFunctions.printListByParity(combinedList, printEven);
    }
}
