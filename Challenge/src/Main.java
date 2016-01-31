import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(args[0]);
        Scanner scan = new Scanner(file);
        while(scan.hasNext())
            System.out.println(makeItShorter(scan.nextLine()));
    }
    
    public static String makeItShorter(String line){
        byte count = 0;
        Scanner scan = new Scanner(line);
        scan.useDelimiter(" ");
        String str;
        if(line.length() > 55)
        {
            line = "";
            while(scan.hasNext())
            {
                str = scan.next();
                count += str.length() + 1;
                if (count <= 40) 
                    line += " " + str;
                else 
                    return (line.trim() + "... <Read More>");
            }
        }
        return line;
    }
}
