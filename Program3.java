import java.util.Scanner;
class SubstringNotFoundException extends Exception{
    public String toString(){
        return "SubstringNotFoundException";
    }
}

public class Program3 {
    public static void main(String args[]) {
     System.out.println("Enter text");
     Scanner sc = new Scanner(System.in);
     String text = sc.nextLine();
     boolean found = false;
     int index,i=0;
     char ch;
     String tempTxt;
     while(i<text.length()){
     ch = text.charAt(i);
     if(ch=='s' || ch=='S' && i+5 < text.length())
     {
       tempTxt = text.substring(i,i+6);
        if(tempTxt.equalsIgnoreCase("SDMCET")){
            found = true;
            System.out.println("Pattern is found at position "+(i+1)+" in the input text");
        break;
       }
       i=i+1;
     }
        else
    i=i+1;
     }
    try{
    if(found == false)
    throw new SubstringNotFoundException();
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}
