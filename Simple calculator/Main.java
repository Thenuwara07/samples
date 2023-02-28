// Simple Calculater
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner Scanner=new Scanner(System.in);
    System.out.print("Enter the first number  = ");
    double num1=Scanner.nextDouble();
    Scanner.nextLine();
    System.out.print("\nEnter the second number = ");
    double num2=Scanner.nextDouble();
    Scanner.nextLine();
    System.out.print("\n(+ or - or * or / or %
                     ) Press symbol - ");
    String operation=Scanner.nextLine();

    if (operation.equals("+")){
      System.out.printf("%f + %f = %f",num1,num2,num1+num2);
    }
    else if (operation.equals("-")){
      System.out.printf("%f - %f = %f",num1,num2,num1-num2);
    }
    else if (operation.equals("*")){
      System.out.printf("%f * %f = %f",num1,num2,num1*num2);
    }
    else if (operation.equals("/")){
      if (num2==0){
        System.out.println("Cannot divide by 0");
      }
      else{
        System.out.printf("%f / %f = %f",num1,num2,num1/num2);
      }
    }
    else if (operation.equals("%")){
      if (num2==0){
        System.out.println("Cannot module by 0");
      }
      else{
        System.out.printf("%f % %f = %f",num1,num2,num1%num2);
      }
    }
    else{
      System.out.println("%operation is not supported.");
    }
  }
}