package week11;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Scanner;

public class UpperLowerDivision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char [] inSrc = sc.nextLine().toCharArray();
        char [] outSrc1 = null;
        char [] outSrc2 = null;


        char[] temp = new char[1];
        CharArrayReader input = new CharArrayReader(inSrc);
        CharArrayWriter output1 = new CharArrayWriter();
        CharArrayWriter output2 = new CharArrayWriter();

        try {
            while (true) {

                if((int)temp[0]>=97 && 122>=(int)temp[0]){
                    output2.write(temp[0]);
                }
                else if((int)temp[0]>=65 && 90>=(int)temp[0]){
                        output1.write(temp[0]);
                }

                if(input.read(temp) < 0){
                    break;
                }
            }
        } catch (IOException e) {}

        outSrc1 = output1.toCharArray();
        outSrc2 = output2.toCharArray();

        System.out.println(outSrc1);
        System.out.println(outSrc2);
    }
}
