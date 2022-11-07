class CountDigit{

    static int countDigit(int num){
        if(num ==0){
            return 0;
        }

        // Small Problem + Recursion(Cycle)
        // int e = countDigit(num/10);
        // e = e + 1;
        // return e;
        return countDigit(num/10) + 1;

    }

    static void countDigit(int num, int count){
            
        // Brake or Termination Case
        if(num ==0){
            System.out.println(count);
            return ;
        }

        

        // Small Problem + Cycle (Recursion)
        countDigit(num/10, count+1);

    }
    static void show(int num){
        // Brake
        if(num ==0){
            return ;
        }
        System.out.println("Amit");
        show(num-1); // Recursion (Cycle)
    }

    public static void main(String[] args) {
        //countDigit(12345, 0);
        int result = countDigit(12345);
        System.out.println(result);
        // int num = 5;
        // show(num);
        

    }
}