public class ControlFlow {

    public static void main(String[] args) {
        controlFlow(25,"male");
        ControlFlow.controlFlow(18,"female");
        ControlFlow.checkVoteEligiblity(21,true);
        ControlFlow.checkGradeRecords(92);
        ControlFlow.getSwitchCase(2);
        ControlFlow.getSwitchCase1(1 );
        ControlFlow.getSwitchcase2("Banana");
        ControlFlow.getSwitchcase2("banana");


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
// --------------------------------Nested class is a child this a real Example:---------------

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

//    -------------------------------Switch case is an alternative way for if else--------------

    public static void getSwitchCase(int productSerial){

        String productName;

        switch (productSerial){
            case 1:
                productName = "Water";

                break;
            case 2:
                productName = "Milk";

            case 3:
                productName ="Soda";
                break;
            case 4:
                productName = "Honey";
                break;
            case 5:
                productName = "Gum";
                break;
            default:
                productName = "Invalid Product";

        }
        System.out.println("your cart has the fallowing productName : " + productName);
    }

//     if there is no break inside the case it will execute the next case
    public static void getSwitchCase1(int productSerial){

        String productName;

        switch (productSerial){
            case 1:
                productName = "Water";


            case 2:
                productName = "Milk";
                break;

            case 3: productName ="Soda";
                break;
            case 4:
                productName = "Honey";
                break;
            case 5:
                productName = "Gum";
                break;
            default:
                productName = "Invalid Product";

        }
        System.out.println("your cart has the fallowing productName : " + productName);
    }

    public static void getSwitchcase2(String productName){
        int  serialNumber;
        switch (productName){
            case ("Banana"):
                serialNumber = 1001;
                break;
            case "Strawberry" :
                serialNumber = 1002;
                break;
                case "Orange" :
                serialNumber = 1003;
                break;
            default:
                serialNumber = 00000;
                break;
        }
        System.out.println("The Serial code for this product is  : " + serialNumber);
    }
}
