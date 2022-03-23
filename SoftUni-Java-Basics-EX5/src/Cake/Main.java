package Cake;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int h=Integer.parseInt(scan.nextLine());
        int w=Integer.parseInt(scan.nextLine());
        int s=h*w;
        int picesCount=0;
        int ost=s;
        while (true){
            String input=scan.nextLine();
            if (input.equals("STOP")){

                System.out.printf("%d pieces are left.",ost);
                break;
            }
            int pices=Integer.parseInt(input);
            picesCount +=pices;
            ost=ost-pices;
            if(ost<=0){
                ost=ost*(-1);
                System.out.printf("No more cake left! You need %d pieces more.",ost);
                break;

            }

        }
    }
}
