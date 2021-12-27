package week11;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Scanner;

public class FaultyTape {
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

        char[] temp = new char[first];
        int skip = second;
        int len = 0;

        try{
            while((len = input.read(temp))>0){
                output.write(temp,0,len);
                input.skip(skip);
            }
        }catch (IOException e){

        }

        outSrc = output.toCharArray();
        System.out.println(outSrc);
    }
}
