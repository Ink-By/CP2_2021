package week6;

import java.util.Scanner;

enum Alphabet {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z}

public class CountLetters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        sc.close();

        int [] alphabet = new int[26];
        Alphabet [] alpha = Alphabet.values();



        for (int i = 0; i < words.length; i++) {
            char [] words2 = words[i].toCharArray();
            for(int j = 0; j< words2.length; j++){
                for(int k=0;k<26;k++){
                    if(alpha[k].name().charAt(0)==words2[j]){
                        alphabet[k]++;
                    }
                    else{
                        continue;
                    }
                }
            }
        }


        for (int i=0;i<26;i++){
            if(alphabet[i] != 0){
                System.out.println(alpha[i].name().charAt(0)+"="+alphabet[i]);
            }
        }

    }
}