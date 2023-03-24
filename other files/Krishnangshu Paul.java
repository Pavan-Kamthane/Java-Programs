import java.io.*;
 
class GFG {
    public static void main(String[] args)
    {
        int r = 1, c = 0, n = 5;
       
        while (r <= n) {
            while (c <= r - 1) {
                
                System.out.print("* ");
                c++;
            }
            r++;
            c = 0;
           
            System.out.println();
        }
    }
}
