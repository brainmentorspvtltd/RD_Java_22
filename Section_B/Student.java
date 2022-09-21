class Student {
    public static void main(String args[]){
         // Type casting/conversion from String to Int
         // Wrapper Classes - Integer, Float, Double, Long...
         int studentId = Integer.parseInt(args[0]);
         String studentName = args[1];
         System.out.println("Id : " + studentId);
         System.out.println("Hello : " + studentName);
    }
}