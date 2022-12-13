public class LabeledForLoop {
    public static void main(String[] args) {
        outer:
        for(int i = 0; i < 5; i++) {
            inner:
            for(int j = 0; j < 5; j++) {
                System.out.println(i + "," + j);
                if(i == 3 && j == 3) {
                    break outer;
                }
            }
        }
    }
}
