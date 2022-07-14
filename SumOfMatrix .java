package sumofmatrix;
import java.util.*;
public class SumOfMatrix 
{
    public static void main(String[] args) 
    {
        int[][] a = new int[3][3];
        System.out.println("Enter number in matrix 1 :  ");
        a = inputMethodForArray(a);
        int[][] b = new int[3][3];
        System.out.println("Enter number in matrix 2 :  ");
        b = inputMethodForArray(b);
        int[][] c = sumMethodForArray(a,b);
        showMethodForArray(c);
    }
    public static int[][] inputMethodForArray(int a[][])
    {
        Scanner input = new Scanner(System.in);
        for (int i=0;i<a.length;i++) //a.length is used for get lenght in rows
        {
             for(int j=0;j<a[i].length;j++) //a.length is used to get length in coloumn
             {
                 a[i][j]=input.nextInt();
             }
        }
        return a;
    }
    public static void showMethodForArray(int a[][])
    {
         Scanner input = new Scanner(System.in);
        for (int i=0;i<a.length;i++) //a.length is used for get lenght in rows
        {
             for(int j=0;j<a[i].length;j++) //a.length is used to get length in coloumn
             {
                 System.out.println(a[i][j]);
             }
        }
    }
    public static int[][] sumMethodForArray(int a[][],int b[][])
    {
        System.out.println("Sum of Matrix");
        int[][] c = new int[3][3];
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
    }
    
}
