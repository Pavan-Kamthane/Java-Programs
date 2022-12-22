/*Q3-Write a program to print the HCF of two numbers*/
import java.util.Scanner;
class HcfOfANumber
{
     public static void main(String[] args) 
     {
         int num1,num2,HCF,reminder;
         int n1Copy,n2Copy;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter two numbers");
         num1 = sc.nextInt();
         num2 = sc.nextInt();
         n1Copy = num1;
         n2Copy=num2;
         while(num2!=0)
         {
             reminder=num1%num2;
             num1= num2;
             num2=reminder;
         }
         HCF=num1;
         System.out.println("HCF of "+n1Copy+" and "+n2Copy+" is "+HCF);
     }    
}
