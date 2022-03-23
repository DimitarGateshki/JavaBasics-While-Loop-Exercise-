package Coins;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sum=Double.parseDouble(scan.nextLine());
        double sumaST=Math.floor(sum*100);
        int counter=0;

        while (sumaST>0){
            if (sumaST>=200){
                counter++;
                sumaST -=200;
            }else if (sumaST>=100){
                counter++;
                sumaST -=100;
            }else if (sumaST>=50){
                counter++;
                sumaST -=50;
            }else  if (sumaST>=20 ){
                counter++;
                sumaST -=20;
            }else  if (sumaST>=10){
                counter++;
                sumaST -=10;
            }else  if (sumaST>=5 ){
                counter++;
                sumaST -=5;
            }else  if (sumaST>=2){
                counter++;
                sumaST -=2;
            }else  if (sumaST>=0 ){
                counter++;
                sumaST -=1;
            }

        }
        System.out.println(counter);

    }

}
