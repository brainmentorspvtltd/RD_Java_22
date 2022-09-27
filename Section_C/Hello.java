class Hello {
    // void show() {
    //     System.out.println("Hello...");
    // }
    public static void main(String[] args) {
        // System.out.println("Hello Java...");
        // show();
        String name = args[0];
        System.out.println("Hello " + name);

        int age = Integer.parseInt(args[1]);
        System.out.println("Age is : " + age);
        
    }
}