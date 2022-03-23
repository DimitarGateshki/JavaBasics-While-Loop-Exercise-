package Vacation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double price=Double.parseDouble(scan.nextLine());
        double olnMonei=Double.parseDouble(scan.nextLine());
        int count=0;
        int daycount=0;
        while(true){
            String done=scan.nextLine();
            double monei=Double.parseDouble(scan.nextLine());
            daycount++;
            if (done.equals("save")){
                olnMonei=olnMonei+monei;
                count=0;

            }else if (done.equals("spend")){
                olnMonei=olnMonei-monei;
                count++;
                if (olnMonei<0){
                    olnMonei=0;
                }
            }
            if(count==5){
                System.out.printf("You can't save the money.%n%d",daycount);
                break;
            }
            if (price<=olnMonei){
                System.out.printf("You saved the money for %d days.",daycount);
                break;
            }



        }
    }
}
