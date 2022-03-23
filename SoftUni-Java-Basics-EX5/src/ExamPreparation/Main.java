package ExamPreparation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=Integer.parseInt(scan.nextLine());
        int CountRE=0;
        double avarege=0;
        int PRcounter=0;
        String lName="" ;
        while (true){
            String name=scan.nextLine();
            if (name.equals("Enough")){
                avarege=avarege/PRcounter;
                System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s",avarege,PRcounter,lName);
                break;
            }
            int mark =Integer.parseInt(scan.nextLine());
            if(mark<=4) {
                CountRE++;
                if (CountRE==count) {
                    System.out.printf("You need a break, %d poor grades.",count);
                    break;

                }
            }
            lName=name;
            avarege= avarege+mark;
            PRcounter++;
        }
    }
}
