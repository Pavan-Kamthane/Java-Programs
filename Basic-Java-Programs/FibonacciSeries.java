/*Q5-Write a program to print first nth term of a fibonacci series*/
import java.util.Scanner;
class FibonacciSeries 
{
   public static void main(String[] args) 
   {
       int nTerm=0,firstTerm=0,secondTerm=1,result=0;
       int nTermCopy;
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter nth term for fibonacci series");
       nTerm=sc.nextInt();
       nTermCopy=nTerm;
       System.out.println("The first "+nTerm+" term is");
       System.out.print("0");
       while(nTerm!=1)
       {
          result=firstTerm+secondTerm;
          firstTerm=secondTerm;
          secondTerm=result;
          System.out.print(" "+firstTerm);
          nTerm--;
       }
       System.out.println(" "+result);
   }
}
