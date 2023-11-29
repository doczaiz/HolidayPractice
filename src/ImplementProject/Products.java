package ImplementProject;

public class Products {

    String productName;
    double productPrice;

    public Products(){}
    public Products(String porductName,double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;
        System.out.println(porductName+" "+productPrice);
        System.out.println("Constructor");

    }

    public static  String productDaitels(String name,double price){
        String productName = name;
        double productPrice = price;
        String productDeatails = productName+" "+productPrice;
        return productDeatails;
    }


    public static void main(String[] args) {
        Products obj = new Products();
       Products product1 = new Products("milk", 4.99);
//        System.out.println(product1);
        Products product2 = new Products("soda",1.99);
        Products product3 = new Products("Water",0.99);
        Products product4 = new Products("Water", 0.99);
        System.out.println(" method example ");
        System.out.println(Products.productDaitels("honey",9.99));



    }

}
