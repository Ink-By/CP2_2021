package Winter2021;

import java.io.IOException;
import java.util.Scanner;

public class FinalTest_one {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        String trash = sc.nextLine();
        String [] menu = new String[first];
        String [] order = new String[second];


        int [] save = new int[second];
        String [] food = new String[first];
        int [] price = new int[first];
        for(int i=0;i<first;i++){
            menu[i]=sc.nextLine();
            String [] Split =menu[i].split(" ");
            food[i]=Split[0];
            price[i]=Integer.parseInt(Split[1]);
        }
        for(int i=0;i<second;i++){
            order[i]=sc.nextLine();
        }
        int sum = 0;
        if(second<3){
            for(int i=0;i<first;i++){
                for(int j=0;j<second;j++){

                    if(order[j].equals(food[i])){
                        sum+=price[i];

                    }
                }
            }

            System.out.println(sum);
        }else{

            for(int i=0;i<first;i++){
                for(int j=0;j<second;j++){
                    if(order[j].equals(food[i])){
                        sum+=price[i];
                        save[j]=price[i];


                    }
                }
            }
            int min =0;
            for(int i=0;i<second-1;i++){
                if(save[i]<save[i+1]){
                    min = save[i];
                }
                else{
                    min = save[i+1];
                }
            }
            System.out.println(sum-(min/2));


        }



    }
}
