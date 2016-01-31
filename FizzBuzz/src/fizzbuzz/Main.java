package fizzbuzz;
        
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;	
        while ((line = buffer.readLine()) != null) 
            System.out.println(output(Integer.parseInt(line.split(" ")[0]), Integer.parseInt(line.split(" ")[1]), Integer.parseInt(line.split(" ")[2])));
        
        buffer.close();
        System.exit(0);
    }
   
    public static String output(int multiple_a, int multiple_b, int limit)
    {
        String output = "";
        for(int i=1;i<=limit;i++)
        {
            if(i % multiple_a == 0)
                if(i % multiple_b == 0)
                    output +=  " FB";
                else
                    output +=  " F";
            else if(i % multiple_b == 0)
                output +=  " B";
            else
                output +=  " " + i;
        }
        return output.trim();
    }
}
