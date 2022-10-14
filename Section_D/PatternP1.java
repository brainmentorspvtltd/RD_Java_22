public class PatternP1 {
    public static void main(String[] args) {
        // *****
        // *****
        // *****
        // *****
        // *****
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 00000
        // 11111
        // 22222
        // 33333
        // 44444
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // 01234
        // 01234
        // 01234
        // 01234
        // 01234
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("=======================");
        
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }
}
