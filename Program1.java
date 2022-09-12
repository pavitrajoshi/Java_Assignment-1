
import java.util.Scanner;
import java.io.*;

public class Program1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        try{
            System.out.println("result="+num1/num2);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by 0: " +e);
        }
        try{
            int arr[]=new int[5];
            arr[6]=9;
        }
       catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index exceeds: " +e);
        }
        try{
            File file=new File("sample.txt");
            FileReader fr=new FileReader(file);
        }
       catch(FileNotFoundException e){
            System.out.println("file does not exist: " +e);
        }

    }
    
}
