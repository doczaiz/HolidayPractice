import java.util.ArrayList;
import java.util.Random;

public class Sorting {

    public static void main(String[] args) {
        Random generator = new Random(3);
        int found = -1;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(generator.nextInt(100) + 1);

        }
        System.out.println("UNSORTED");
        System.out.println(numbers);


//       found = find(numbers,50);
//        System.out.printf("The number %d was %s found\n", 50, found<0 ? "not" : "");
//        Collections.sort(numbers, new IntegerComparator());
//        //numbers = sort(numbers);
//        System.out.println("SORTED");
//        printNumbers(numbers);
//        //int found =find(numbers, 50);
//        found = Collections.binarySearch(numbers,50, new IntegerComparator());
//
//        System.out.printf("The number %d was %s found\n", 50, found<0 ? "not" : "");


    }
}
