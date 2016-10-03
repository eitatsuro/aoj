import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_7_C
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    private final static String SPACE = " ";
    public static void main(String[] args) {
        try {
            LineNumberReader stdReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            
            String sStr;
            int r = 0;
            int c = 0;
            int an[] []= null;

            while ((sStr = stdReader.readLine()) != null) {
                // ���͍s��
                if (stdReader.getLineNumber() == 1) {
                    String[] inputs = sStr.split(SPACE);
                    r = Integer.valueOf(inputs[0]);
                    c = Integer.valueOf(inputs[1]);
                    
                    // r�s x c��̍s��m��
                    // �����i�[�p�v�f���m��.
                    an = new int[r+1][c+1];
                }

                // �s��l�擾
                // 0, 1, 2, 3, ....   x  0, 1, 2, 3, ... (0�Ԗڂ��琔����)
                if (stdReader.getLineNumber() >= 2){
                    String[] matrix_row = sStr.split(SPACE);
                    int i = 0;
                    int row = stdReader.getLineNumber() - 2;
                    for (String temp : matrix_row) {
                        an[row][i] = Integer.valueOf(temp);
                        i++;
                    }
                    
                    if (stdReader.getLineNumber() == r+1) break;
                }

            }


            // �A�E�g�v�b�g�v�Z
            for (int i = 0; i<r; i++){
                int sumOfRow = 0;
                for (int j = 0; j<c; j++){
                    sumOfRow += an[i][j];
                }
                an[i][c] = sumOfRow;
            }

            for (int i = 0; i<=c; i++){
                int sumOfColumn = 0;
                for (int j = 0; j<r; j++){
                    sumOfColumn += an[j][i];
                }
                an[r][i] = sumOfColumn;
            }
            
            
            // ���ʏo��
            for (int[] r_temp : an) {
                int i = 0;
                for (int c_temp : r_temp) {
                    System.out.print(c_temp );
                    if (i <c) {
                        System.out.print(SPACE);
                    }
                    i++;
                }
                System.out.println();
            }

            stdReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
}