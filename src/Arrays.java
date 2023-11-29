import java.util.ArrayList;

public class Arrays {

    // ARRAYLIST: Dynamic Array: No need to declare array size
    // List : list of your collection/ product/ clothing

    public static void main(String[] args) {
        Arrays.gameBoard();
        Arrays.doArrayList();
        Arrays.doShopping();

// Create a 2D array
        int[][] mat = new int[2][2];
        mat[0][0] = 99;
        mat[0][1] = 151;
        mat[1][0] = 30;
        mat[1][1] = 5;

        // print 2D integer array using deepToString()

    }


    //Example in Java to Create 2d ArrayList using Fixed-Size Array

    public static void multiArrayList(){
        ArrayList<String>[][] arraylist1 = new ArrayList[3][3];
        arraylist1[0][0] = new ArrayList<String>();

        arraylist1[0][0].add("sone");
        arraylist1[0][0].add("stwo");
        arraylist1[0][0].add("sthree");

        arraylist1[0][1] = new ArrayList<String>();
        arraylist1[0][1].add("sone");
        arraylist1[0][1].add("stwo");
        arraylist1[0][1].add("sthree");

        arraylist1[0][2] = new ArrayList<String >();
        arraylist1[0][2].add("sone");
        arraylist1[0][2].add("stwo");
        arraylist1[0][2].add("sthree");

//        System.out.println(Arrays.deepToString(arraylist1));

    }

    public static void doShopping (){

        ArrayList<String> shoppingList = new ArrayList<String>();
        System.out.println("Size: " + shoppingList.size());
        shoppingList.add("carrots");
        System.out.println(shoppingList);
        shoppingList.add("bread");
        System.out.println(shoppingList);
        shoppingList.add("chocolate");
        System.out.println(shoppingList);
        System.out.println("Size: " + shoppingList.size());
        ArrayList<Integer> quantities = new ArrayList<Integer>();
        quantities.add(2);
        quantities.add(4);
        System.out.println("quantities : "+quantities);

    }
    public static void doArrayList(){
        // Let's demonstrate some basics of arraylists
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(85);
        grades.add(70);
        System.out.printf("Second Grade : %d\n", grades.get(1));
        System.out.println("first Grade : "+ grades.get(2));
    }

    public static void gameBoard() {
        char[][] board = new char[3][3];    // tic-tac-toe board
        board[0][0] = 'X';                  // place an X in upper-left
        board[1][2] = 'O';                  // place an O in row 1 col 2
        board[2][0] = 'X';                  // place an X in row 2 col 0
        board[2][2] = 'O';                  // place an O in row 2 col 0
        board[1][1] = 'W';                  // place an W in row 1 col 1

        // Print the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d][%d]=%s ", i, j, board[i][j]);
            }
            System.out.printf("\n");
        }

    }
}


