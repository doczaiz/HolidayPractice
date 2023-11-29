import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        // this demonstrates the basic for loop for iterating a specific number of times

        Loop obj = new Loop();
        obj.CountUp(10);

        System.out.println();
        Loop.doPrint();
        System.out.println();
        obj.CountDown(20);
        System.out.println();
        obj.MultiplesofN();
        System.out.println();
        obj.NestedForLoops();

    }


    public void CountUp(int max) {
//        int max = 10;
        System.out.println("Counting Up...");
        for (int i = 1; i <= max; i++) {
            System.out.println(i);
//            System.out.printf("%d ", i);

        }
    }

    public static void doPrint(){
        int number1=5;
        int number2=2;
        int total=number1+number2;
        System.out.println("Total : "+total);
        for (int i=0; i<total;i++){
            System.out.println("Happy New Year");
        }
    }

    public void CountDown(int maximum) {
//        int maximum=10;
        System.out.println("Counting Down...");
        for (int i = maximum; i >= 1; i--) {
            System.out.printf("%d ", i);
        }
    }

    public void MultiplesofN() {

        int maxMultiples = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want multiples of : ");
        int multiplesOf = input.nextInt();
        for (int i = 1; i <= maxMultiples; i++) {
            int answer = i * multiplesOf;
            System.out.printf("%d * %d == %d\n", i, multiplesOf, answer);
        }
    }

    public void NestedForLoops() {
        // simple example of next for loops
        int max = 9;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j <= max; j++) {
                System.out.printf("[%d,%d]",i, j);
            }
        }


    }
}
