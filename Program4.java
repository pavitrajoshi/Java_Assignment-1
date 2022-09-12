import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class VowelNotAllowedException extends Exception{
    public String toString(){
        return "Exceptio: vowels are not allowed";
    }

}

public class Program4 {
    public static void main(String[] args) throws IOException, VowelNotAllowedException {
        
        
        File file1=new File("Alphabets.txt");
        FileReader fr=new FileReader("Alphabets.txt");
        
        FileWriter fw=new FileWriter("Consonants.txt");

        try{
            file1.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
        Scanner sc=new Scanner(fr);

        String str=sc.nextLine();
        sc.close();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            try{
                if((ch=='a') ||(ch=='e')|| (ch=='i') || (ch=='o') || (ch=='u') || (ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U')){
                    throw new VowelNotAllowedException();
                }
                else{
                    System.out.println(ch +" coppied to consonants.txt");
                    fw.write(ch);
                    
                }
            }catch(Exception ee){
                System.out.println(ee);
            }
           
        }
         fw.close();
    } 
}

