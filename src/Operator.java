public class Operator {

    // Operator are symbol used in coding


    //    +  (Addition)
    //   - Subtraction
    //    * (Multiplication)
    //    / (Division)
    //    % (Modulus) Remainder operator

//    there is a multi operators groups in java
//    1- Arithmetic Operators
//    2- Assignment Operators


    public static void main(String[] args) {
        System.out.println("Addition Operator : " + Operator.doSum(10, 5, 47));
        System.out.println("Subtraction Operator : " + Operator.doSubtraction(100, 50));
        System.out.println("Multiplication Operator : " + Operator.doMultiplication(10, 20, 5, 110.11, 22.22));
        Operator.doDivision(90, 2);
        Operator.doRemainder(10, 3);
        System.out.println("The Relational Operators : " + Operator.operation(75, 13));
        System.out.println("The Relational Operators : " + Operator.result());
        System.out.println("The Assignment Operators : " + Operator.title("Rachid ", " zaiz"));
        System.out.println(Operator.weeklySalary(120, 45));
        System.out.println("the Discount Amount : " + Operator.getDiscountAmount(5, 2.99, 10));

        System.out.println();
        Operator.opertaorCheck("Rachid", "zaizo");
        Operator.opertaorCheck1("Rachid", "hello");

        Operator.controlFlow(21, "male");
        Operator.checkVoteEligiblity(18, true);
        Operator.checkGradeRecords(91);


    }

    public static int doSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    static double doSubtraction(double num1, double num2) {
        double subtraction = num1 - num2;
        return subtraction;
    }

    public static int doMultiplication(int num1, int num2, int num3, double num11, double num22) {
        int multiplication = (int) (doSum(num1, num2, num3) * doSubtraction(num11, num22));
        return multiplication;
    }

    public static void doDivision(int x, int y) {
        int division = x / y;
        System.out.println("Division Operator : " + division);

    }

    public static void doRemainder(int a, int b) {
        double remainder = (a % b);
        System.out.println("Remainder Operator : " + remainder);

    }

    public static double getDiscountAmount(double qte, double price, double discountperecentage) {
        double discountAmount = ((qte * price) - (qte * price) * (discountperecentage / 100));

        return discountAmount;
    }

//    The Relational Operators
// == (equal to)	Checks if the values of two operands are equal or not, if yes then condition becomes true.	(A == B) is not true.
// != (not equal to)	Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.	(A != B) is true.
// > (greater than)	Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.	(A > B) is not true.
// < (less than)	Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.	(A < B) is true.
//  >= (greater than or equal to)
//  <= (less than or equal to)

    public static int operation(int x, int y) {
        if (x > y) {
            return x;
        }
        if (y > x) {
            return y;
        }
        if (x == y) {
            return 0;
        }

        return (x > y) ? x : y;
    }

    public static int result() {
        int greaterThan = 70;
        int lessThan = 700;
        if (greaterThan == lessThan) {
            return 0;
        }
        if (greaterThan > lessThan) {
            return greaterThan;
        }
        return (greaterThan > lessThan) ? greaterThan : lessThan;
    }

//    The Assignment Operators
// =	Simple assignment operator. Assigns values from right side operands to left side operand.	C = A + B will assign value of A + B into C


    public static double weeklySalary(double workingHour, double hourSalary) {
        double wSalary = workingHour * hourSalary;
        return wSalary;
    }


    public static String title(String lastName, String name) {
        String full = lastName + " " + name;
        return full;
    }


// ---------------- Conditional operator------------------------
//
//    && = and conditional operator : all condition must have to be true to execute
//
//
//   (| pipe) OR conditional operator pipe: one condition has to be true to execute


    public static void opertaorCheck(String name, String lastName) {

        if (name == "Rachid" && lastName == "zaizo") {
            System.out.println("Your Real Full Name is :" + name + " " + lastName);
        } else {
            System.out.println("Try one more time to enter your full name");
        }
    }

    public static void opertaorCheck1(String name, String lastName) {

        if (name == "Rachid" | lastName == "joud") {
            System.out.println("Your Real Full Name is :" + name + " " + lastName);
        } else {
            System.out.println("Try one more time to enter your full name");
        }
    }

    public static void controlFlow(int age, String gender) {

        if (age >= 18 && gender.equalsIgnoreCase("male")) {
            System.out.println("you are eligible for vote");
        } else if (age >= 18 && gender.equalsIgnoreCase("female")) {
            System.out.println("you are eligible for vote");
        } else {
            System.out.println("you are not eligible to vote");
        }
    }

    public static void checkVoteEligiblity(int age, boolean areCitizen) {

        if (age >= 18 && areCitizen) {
            System.out.println("you are eligible for vote");

        } else {
            System.out.println("you are not eligible to vote");
        }
    }

    public static void checkGradeRecords(double grade) {
        if (grade >= 80 && grade <= 100) {
            System.out.println("The Result is :  Pass");
            if (grade >= 91 && grade <= 100) {
                System.out.println("You are Super Excellent Student Your Score is : " + grade);
            } else if (grade <= 90 && grade >= 80) {
                System.out.println("You are Excellent StudentYour Score is : " + grade);
            } else {
                System.out.println("You are Smart Student Your Score is : " + grade);
            }
        } else if (grade < 80 && grade > 65) {
            System.out.println("Modest Student Level");
        } else {
            System.out.println("Poor Student Level");
        }
    }


}
