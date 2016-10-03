import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_7_A
 * 
 * @author chrone
 * 
 */
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            while ((sStr = stdReader.readLine()) != null) {
                String[] inputs = sStr.split(" ");
                
                int m = Integer.valueOf(inputs[0]);
                int f   = Integer.valueOf(inputs[1]);
                int r   = Integer.valueOf(inputs[2]);
                
                if (m == -1 && f == -1 && r == -1) {
                    break;
                    // nothing to do.
                }
                
                if (m==-1 || f == -1 || (m+f <30)) {
                    // F
                    System.out.print("F");
                } else if ( m+f >= 80) {
                    // A
                    System.out.print("A");
                } else if  (m+f < 80 && m+f >=65) {
                    // B
                    System.out.print("B");
                } else if ( (m+f >=50 && m+f < 65) || r>=50) {
                    // C
                    System.out.print("C");
                } else if (m+f>=30 && m+f<50) {
                    // D
                    System.out.print("D");
                } else if (m+f<30) {
                    // F
                    System.out.print("F");
                }
                System.out.println();
            }

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}