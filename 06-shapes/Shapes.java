class Main {
    public static void main(String[] args) {
        System.out.println("Shapes");
        square(5);
        rectangle(8, 10);
        triangle(5);
    }
    //end main
    public static void square(int x) {
        for(int row = 1; row <= x; row++) {
            System.out.println("");
            for (int col = 1; col <= x; col++) {
                System.out.print("* ");
            }
            //adds the amount of stars to each row
        }
        //creates rows
    }
    //end square
    public static void rectangle(int x, int y) {
        for(int row = 1; row <= x; row++) {
            System.out.println("");
            for (int col = 1; col <= y; col++) {
                System.out.print("* ");
            }
            //adds the amount of stars to each row
        }
        //creates rows
    }
    //end rectangle
    public static void triangle(int x) {
        for(int row = 1; row <= x; row++) {
            System.out.println("");
            for (int space = 1; space <= x-row; space++) {
                System.out.print(" ");
            }
            //adds spaces, same # as user input - row #
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //adds the amount of stars to each row
        }
        //adds rows
    }
    //end triangle
}
//end class

// rectangle, two outputs 
// triangle, one ouptut 
