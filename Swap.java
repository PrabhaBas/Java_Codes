import java.io.*;
class Swap
{
    public static void main(String arg[])throws IOException
    {
        
        // Swapping Code -- java
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a,b:");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        System.out.println("Before swapping= "+a+" "+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("After swapping= "+a+" "+b);
    }
}
