public class Constructor {


    String name;
    String address;
    int age;

// the constructor is a type of method and used to initialise an object( to create an object)
// the constructor always created inside class level.
// The constructor does not have any return type

    //  AccessModifier className / constructorName(){}
    public Constructor() {

        System.out.println("Hello EveryOne This`s a Default Constructor");
        System.out.println("You can create multi constructor by changing signature(parameter)pattern");
        System.out.println("This: is used to call non-static variable ");
    }

    //    =============================================================================
//single parameters
    public Constructor(String name) {

        this.name = name;
        System.out.println("My name is :" + this.name);
    }

    // double signatures
    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name and Age Info :" + name + " " + age);
    }

    public Constructor(String name, String location) {
        this.name = name;
        this.address = location;
        System.out.println("My name is : " + this.name + " and i live in " + address);
    }

    // triple parameters
    public Constructor(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.address = location;
        System.out.println("Full Student Info : " + " " + name + " " + age + " " + location);
    }

    public Constructor(int num1, int num2) {
        int Total = num1 + num2;
        System.out.println("The total is : " + Total);
    }

    public Constructor(int num1, int num2, int num3, int num4) {
        int Total = num1 + num2 + num3 + num4;
        System.out.println("The total is : " + Total);
    }


    public static void main(String[] args) {

        //  create an object
        Constructor obj = new Constructor();

//        ================================================================================

       Constructor studentInfo = new Constructor("Rachid", 35, "Bayonne,NJ");
        Constructor studentNameAndAge = new Constructor("Sanae", 29);
        Constructor studentNameAndLocation = new Constructor("Sanae", "Elizabeth, NJ");

//  ==========================================================================================================

        Constructor totalCalc = new Constructor(100,200);
        Constructor total = new Constructor(100,200,50,50);
    }
}
