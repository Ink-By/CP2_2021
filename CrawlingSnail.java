package week11;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrawlingSnail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char [] inSrc = sc.nextLine().toCharArray();
        char [] outSrc = null;

        String a = sc.nextLine();
        String [] num = a.split(" ");
        int first = Integer.parseInt(num[0]);
        int second = Integer.parseInt(num[1]);

        CharArrayReader input = new CharArrayReader(inSrc);
        CharArrayWriter output = new CharArrayWriter();

        char[] temp1 = new char[first-second];
        char[] temp2 = new char[second];

        int len = 0;
        int len2 = 0;

        try{
            while((len = input.read(temp1))>0){
                output.write(temp1,0,len);
                input.mark(second);

                if((len2 = input.read(temp2))>0){

                    output.write(temp2,0,len2);
                    input.reset();
                }
                if(len2 != second){
                    break;
                }
            }
        }catch (IOException e){}
        outSrc = output.toCharArray();
        System.out.println(outSrc);
    }
}
