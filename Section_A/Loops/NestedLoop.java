public class NestedLoop {
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

        // 11111
        // 22222
        // 33333
        // 44444
        // 55555
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

        // 12345
        // 12345
        // 12345
        // 12345
        // 12345
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

    }
}
