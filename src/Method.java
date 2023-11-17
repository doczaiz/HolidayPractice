public class Method {


    public static void main(String[] args) {
        Method obj = new Method();
        System.out.println("Non return type Method");
        Method.family();
        Method.doTotal();
        obj.doSubstraction(100, 50, 90);
        System.out.println("Return type Method");// static method
        System.out.println(Method.returnTotal());
        Method.returnTotal(); // it will do just a system.out.println
        System.out.println(Method.result());

        System.out.println("============================");


        System.out.println(obj.choice());
        System.out.println(obj.choice1());

        System.out.println(obj.testResult());
        System.out.println("============================");
        System.out.println(obj.operation(100, 90));// to print non-static return type method
        int value = obj.operation(105, 90);
        System.out.println("Value :" + value);
        obj.weatherForcast(65); // to print non-static non return type method

        System.out.println("Weekly Salary : " + obj.weeklySalary(40.00, 45.00));
        System.out.println("Yearly Salary : " + obj.yearlySalary(40, 45, 50));
        System.out.println("yearly Income : "+ obj.yearlyIncome(40,45,52));

        System.out.println(obj.isPizzaAvailibale("Doninos",'M',19.99));
        System.out.println(obj.isPizzaAvailibale("Doninos",'L',29.99));
        obj.isPizzaAvailibale("Pizza Hot ",'S',10.99);

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

    public void doSubstraction(int num1, int num2, int num3) {
        System.out.println("the substraction of this method is : " + ((num1 + num2) - num3));
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
        return (x > y) ? x : y;
    }


    public int operation(int x, int y) {
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

    public double weeklySalary(double workingHour, double hourSalary) {
        double wSalary = workingHour * hourSalary;
        return wSalary;
    }

    public double yearlySalary(double workingHour, double hourSalary, int numberofWeeks) {
        double ySalary = weeklySalary(workingHour, hourSalary);
        return ySalary * numberofWeeks;
    }

    public double yearlyIncome(double workingHour, double hourSalary, int numberofWeeks) {
        double yearlyIncome = (weeklySalary(workingHour, hourSalary)*numberofWeeks);
        return yearlyIncome;
    }


    public void weatherForcast(int temperature) {
        System.out.println("weather Forcast " + temperature);
    }

    public boolean isPizzaAvailibale(String pizzaName,char size,double price){
        char pizzaSize = size;
        double pizzaPrice = price;
        if (pizzaSize == 'L') {
            System.out.println(pizzaName +" Pizza "+" Size "+ pizzaSize + " is Availibale");
        }
        else{
                System.out.println(pizzaName +" Pizza Size "+ size+ " not Availiable");
            }
      return pizzaSize=='L';

    }
}