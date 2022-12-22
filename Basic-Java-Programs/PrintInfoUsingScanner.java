/*Q2-Write a program to print your information using Scanner class*/
import java.util.Scanner;
class PrintInfoUsingScanner 
{
    public static void main(String[] args)
    {
        String name;
        int rollNo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your roll number");
        rollNo = sc.nextInt();
        System.out.println("Your name is "+name);
        System.out.println("Your roll number is "+rollNo);
    }   
}
