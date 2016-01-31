import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new FileInputStream(args[0]));
        String line, character[];
        //StringBuilder sb = new StringBuilder();
        while(scan.hasNext())
        {
            line = scan.nextLine();
            character = line.split(" ");
            line = "";
            for(int i=0;i<character.length;i++)
            {
                //sb.append(decodeMorse(character[i]));
                line += decodeMorse(character[i]);
            }
            System.out.println(line);
            //sb.setLength(0);
        }
    }
    
    public static String decodeMorse(String input)
    {
            if (input.equals(".-"))
                return "A";
            else if (input.equals("-..."))
                return "B";
            else if (input.equals("-.-."))            
                return "C";
            else if (input.equals("-.."))            
                return "D";
            else if (input.equals("."))            
                return "E";
            else if (input.equals("..-."))            
                return "F";
            else if (input.equals("--."))            
                return "G";
            else if (input.equals("...."))            
                return "H";
            else if (input.equals(".."))            
                return "I";
            else if (input.equals(".---"))            
                return "J";
            else if (input.equals("-.-"))            
                return "K";
            else if (input.equals(".-.."))            
                return "L";
            else if (input.equals("--"))            
                return "M";
            else if (input.equals("-."))            
                return "N";
            else if (input.equals("---"))            
                return "O";
            else if (input.equals(".--."))            
                return "P";
            else if (input.equals("--.-"))            
                return "Q";
            else if (input.equals(".-."))            
                return "R";
            else if (input.equals("..."))            
                return "S";
            else if (input.equals("-"))            
                return "T";
            else if (input.equals("..-"))            
                return "U";
            else if (input.equals("...-"))            
                return "V";
            else if (input.equals(".--"))            
                return "W";
            else if (input.equals("-..-"))            
                return "X";
            else if (input.equals("-.--"))            
                return "Y";
            else if (input.equals("--.."))            
                return "Z";
            else if (input.equals(".----"))            
                return "1";
            else if (input.equals("..---"))            
                return "2";
            else if (input.equals("...--"))            
                return "3";
            else if (input.equals("....-"))            
                return "4";
            else if (input.equals("....."))            
                return "5";
            else if (input.equals("-...."))            
                return "6";
            else if (input.equals("--..."))            
                return "7";
            else if (input.equals("---.."))            
                return "8";
            else if (input.equals("----."))            
                return "9";
            else if (input.equals("-----"))            
                return "0";
            else
                return "";
    }
}
