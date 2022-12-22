/*Q6-Write a program to enter a number and count the number of even digits and odd digits*/
import java.util.Scanner;
class EvenAndOddDigits
{
    public static void main(String[] args) 
    {
        int num,evenCount=0,oddCount=0,lastDig,numCopy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        numCopy=num;
        while(num!=0)
        {
            lastDig=num%10;
            if(lastDig%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
            num=num/10;
        }
        System.out.println("The number "+numCopy+" contains "+evenCount+" even digit and "+oddCount+" odd digit");
    }    
}
