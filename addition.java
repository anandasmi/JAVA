import java.util.Scanner;
class addition
  {
    public static void main(String args[])
   {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter your 1st number = ");
     int a = s.nextInt();
     System.out.println("Enter your 2nd number = ");
     int b = s.nextInt();
      System.out.println("Enter your 3rd number = ");
      int c = s.nextInt();
      System.out.println("Addition of three digits is = " +(a+b+c));
  }
}