
    import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

    public class IOBonus_exercise4 {
        public static void main(String a[]){
            StringBuilder sb = new StringBuilder();
            String strLine = "";
            try
            {
                String filename= "data/myfile.txt";
                FileWriter fw = new FileWriter(filename,false);
                //appends the string to the file
                fw.write("IO Exercises\nArray Exercises\nMethod Exercises");
                fw.close();
                BufferedReader br = new BufferedReader(new FileReader("data/myfile.txt"));
                //read the file content
                while (strLine != null)
                {
                    sb.append(strLine);
                    sb.append(System.lineSeparator());
                    strLine = br.readLine();
                    System.out.println(strLine);
                }
                br.close();
            }
            catch(IOException ioe)
            {
                System.err.println("IOException: " + ioe.getMessage());
            }
        }
    }


