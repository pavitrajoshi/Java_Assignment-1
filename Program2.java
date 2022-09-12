import java.lang.*;
import java.util.Scanner;

class NegativeNumberNotAllowedException extends Exception{
    public String toString(){
        return "NegativeNumberNotAllowedException";
    }
}

class NumberNotPrimeException extends Exception{
    int num;
    NumberNotPrimeException(int n){
        num=n;
    }
    public String toString(){
        return "NumberNotPrimeException : "+num+" is not prime";

    }
}


class Program2{
    public static void main(String args[])throws NumberNotPrimeException,NegativeNumberNotAllowedException{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        try{
        if(num<0)
        {
            throw new NegativeNumberNotAllowedException();
        }
        else{
        boolean isPrime=true;

        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isPrime=false;
            }
        }
            if(isPrime){
                System.out.println(num +  " is prime");
            }
            else{
                  throw new NumberNotPrimeException(num);
                 }
            }
        }
        catch(NumberNotPrimeException e ){
            System.out.println("Exception: "+ e);
        }

        catch(Exception e ){
            System.out.println("Exception: "+ e);
        }

    }
}
