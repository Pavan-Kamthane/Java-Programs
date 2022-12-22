/*Q7-Write a program to enter a number and a digit print the frequecy of of digit in the given number*/
import java.util.Scanner;
public class FrequencyOfNumber 
{
    public static void main(String[] args) 
    {
        int num,frequency=0,digit,lastDig,numCopy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and the digit whose frequency you have to count");
        num = sc.nextInt();
        digit = sc.nextInt();
        numCopy=num;
        while(num!=0)
        {
            lastDig = num%10;
            if(lastDig==digit)
            {
                frequency++;
            }
            num=num/10;
        }
        System.out.println("The frequency of "+digit+" in "+numCopy+" is "+frequency);
    }
}
