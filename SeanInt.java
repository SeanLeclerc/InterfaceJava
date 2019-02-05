public class SeanInt implements Sean {

   public void mange() {
      System.out.println("Sean mange");
   }

   public void voyage() {
      System.out.println("Sean voyage");
   } 

   public int noOfLegs() {
      return 0;
   }

   public static void main(String args[]) {
      SeanInt m = new SeanInt();
      m.mange();
      m.voyage();
   }
} 