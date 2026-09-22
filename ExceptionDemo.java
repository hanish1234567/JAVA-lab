public class ExceptionDemo {
   public ExceptionDemo() {
   }

   public static void main(String[] var0) {
      try {
         byte var1 = 10;
         byte var2 = 0;
         int var3 = var1 / var2;
         System.out.println("Result: " + var3);
      } catch (ArithmeticException var4) {
         System.out.println("Cannot divide by zero.");
      }

      System.out.println("Program continues...");
   }
}
