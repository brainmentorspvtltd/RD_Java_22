class Branch{

    static void fun(int num){
        if(num<=0){
            return;
        }
        System.out.println(num);
        fun(num-1);
        fun(num-2);
    }
    public static void main(String[] args) {
        fun(3);
    }
}