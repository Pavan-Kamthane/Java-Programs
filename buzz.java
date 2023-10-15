import java.util.*;
class buzz
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        int d=n%10;
        if((n%7==0)&&(d==7))
        {
            System.out.println("Buzz no.");
        }
        else
        {
            System.out.println("Not buzz no.");
        }
    }
}
