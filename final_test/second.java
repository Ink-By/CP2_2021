package finalExam;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        char[] inSrc = sc.nextLine().toCharArray();
        char[] outSrc = null;

        CharArrayReader input = new CharArrayReader(inSrc);
        CharArrayWriter Upper = new CharArrayWriter();
        CharArrayWriter Lower = new CharArrayWriter();

        char [] temp = new char[inSrc.length];
        int len = 0;

        for(int i=0;i<inSrc.length;i++){
            if((int)inSrc[i]>=97&&(int)inSrc[i]<=122){
                Lower.write(inSrc[i]);
            }
            else if((int)inSrc[i]>=65&&(int)inSrc[i]<=90){
                Upper.write(inSrc[i]);
            }
        }
        char [] up = null;
        char [] down = null;
        down = Lower.toCharArray();
        up = Upper.toCharArray();

        int downcnt = down.length;

        for(int i=0;i<downcnt;i++){
            System.out.print(up[i]);
            System.out.print(down[i]);
//AaaaAAaaAAAAAaa
        }
    }
}
