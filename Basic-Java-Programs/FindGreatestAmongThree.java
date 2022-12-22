/*Q4-Enter value for three variables and find out the greatest among them*/
import java.util.Scanner;
class FindGreatestAmongThree
{
  public static void main(String[] args)
  {
      int num1,num2,num3;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number");
      num1=sc.nextInt();
      System.out.println("Enter second number");
      num2=sc.nextInt();
      System.out.println("Enter third number");
      num3=sc.nextInt();
      if(num1>num2&&num1>num3)
      {
          System.out.println("First number is greatest among three");
      }
      else if(num2>num1&&num2>num3)
      {
          System.out.println("Second number is greatest among three");
      }
      else
      {
          System.out.println("Third number is greatest among three");
      }
  }
}