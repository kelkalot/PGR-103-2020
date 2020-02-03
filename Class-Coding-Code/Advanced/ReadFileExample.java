import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
        public static void main(String[] args) {
            BufferedReader reader;

            int jpegCounter = 0;
            int pngCounter = 0;
            int gifcounter = 0;

            try {
                //New reader
                reader = new BufferedReader(new FileReader(
                        "/Users/michaelriegler/Downloads/images.txt"));
                String line = reader.readLine();

                //while there are new lines read them
                while (line != null) {

                    //print the current line
                    System.out.println(line);

                    //Add your code here!
                    if (line.toUpperCase().contains("JPEG"))
                        jpegCounter=jpegCounter+1;
                    if (line.toUpperCase().contains("PNG"))
                        pngCounter=pngCounter+1;
                    if (line.toUpperCase().contains("GIF"))
                        gifcounter=gifcounter+1;

                    // read next line
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //Here you will need to add the print
            System.out.println(jpegCounter+" "+pngCounter+" "+gifcounter);
        }
}
