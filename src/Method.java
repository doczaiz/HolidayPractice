public class Method {


    public static void main(String[] args) {
        Method.family();
        Method.doTotal();
        System.out.println(Method.returnTotal());
        Method.returnTotal(); // it will do just a system.out.println

        Method obj = new Method();
        System.out.println(obj.choice());
        System.out.println(obj.choice1());
        System.out.println(Method.result());
        System.out.println(obj.testResult());
        System.out.println("============================");
        System.out.println(obj.operation(10,90));
        obj.operation(105,90);

    }


//    Method is a block of code which have a name and return
//    Method is a block of code with a name which will execute that block of code if called
//    Method is a function

// static method should call by class name.
// Void is a return type


// AccessModifier ReturnType(Data type) MethodName(){}


// There is 2 type of Method ***** Non-Return type of method ***** and *********** Return type of method******


    //    ***** Non-Return type of method *****
    public static void family() {

        System.out.println("***** Non-Return type of method *****");
        System.out.println("Happy Birthday");
    }

    public static void doTotal() {
        int price = 100;
        int qte = 7;
        int total = qte * price;
        System.out.println("The Total Amount is: " + total);
    }

    //    ***** Return type of method *****

    public static int returnTotal() {
        int price = 50;
        int qte = 10;
        int total = qte * price;
        System.out.println("***** Return type of method *****");
        return total;
    }


    public double choice() {
        double x = 100;
        double y = 90;
        double z1 = x * y;
        return z1;
    }

    public double choice1() {
        double x = 1;
        double y = 9;
        if (x > y) {
            return x;
        } else {
            System.out.println("X is not greater than Y");
        }
        return x;
    }

    // variable x = (expression) ? value if true : value if false(x>y)?x:y
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

    public double testResult() {
        int x = 9;
        int y = 22;
        if (x > y) {
            return (x > y) ? x : y;
        }
        return (x>y) ? x: y;
    }


    public int operation(int x,int y) {
        if (x > y) {
            return x;
        }
        if (y > x) {
            return y;
        }
        if (x == y) {
            return 0;
        }

    return (x>y) ? x:y;
    }

}