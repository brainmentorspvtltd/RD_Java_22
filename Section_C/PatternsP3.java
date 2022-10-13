public class PatternsP3 {
    public static void main(String[] args) {
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        int row = 11;
        int col = 11;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                if(i == 0 || j == 0 || i == row-1 || j == col-1)
                 {
                    System.out.print("*");
                 }
                 else {
                    System.out.print(" ");
                 }
            }
            System.out.println();
        }


        // *****
        // *   *
        // * * *
        // *   *
        // *****

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                if(i == 0 || j == 0 || i == row-1 || j == col-1 || i == row/2 && j == col/2)
                 {
                    System.out.print("*");
                 }
                 else {
                    System.out.print(" ");
                 }
            }
            System.out.println();
        }
        


    }
}
