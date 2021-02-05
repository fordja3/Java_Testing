
import java.util.Scanner;

class AddingIndex
{
    public static void main(String args[])
    {
        int x,y,s, sum=0 , count=0 ;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt())
        {
            // Read an int value
            int num = sc.nextInt();
            sum += num;
            count++;
        }

        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);


        args[0].split(" ");
        s=x+y;


        System.out.println("hdslfk" + s);
    }
}