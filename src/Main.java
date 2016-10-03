import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = 
                    new BufferedReader( new InputStreamReader(System.in));
            String seedStr = stdReader.readLine();

            String[] inputStr = seedStr.split(" ");

            String tateStr = inputStr[0];
            String yokoStr = inputStr[1];

            Integer tate = Integer.valueOf(tateStr);
            Integer yoko = Integer.valueOf(yokoStr);
 
            System.out.println(tate*yoko + " " + 2*(tate+yoko));
            System.exit(0);

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        } 
    }
}
