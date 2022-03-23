package Walking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int count=0;
        int dif=0;
        while (true){
            String steps=scan.nextLine();
            if (steps.equals("Going home")) {
                int home = Integer.parseInt(scan.nextLine());
                count = count + home;
                if (count < 10000) {
                    dif = 10000 - count;
                    System.out.printf("%d more steps to reach goal.", dif);
                    break;
                } else if (count >= 10000) {
                    dif = count - 10000;
                    System.out.printf("Goal reached! Good job!%n%d steps over the goal!", dif);
                    break;

                }
            }
            int stepsDone=Integer.parseInt(steps);
            count=count+stepsDone;
            if (count>=10000){
                dif=count-10000;
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!",dif);
                break;
            }

        }
    }
}
