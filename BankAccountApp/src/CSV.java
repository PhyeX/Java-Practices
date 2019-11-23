import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    // This funciton will read data from a CSV file an return as a list.
    public static List<String[]>read(String file){
        List<String[]> data = new LinkedList<String[]>();
        String in;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((in  = br.readLine())!= null) {
                String[] dataRecords =in.split(",");
                data.add(dataRecords);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not find the file.");
           e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("Could not read file.");
            e.printStackTrace();
        }
        return data;
    }
}
