package OldBooks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String favBook=scan.nextLine();
        int count=0;
        while (true){
            String name=scan.nextLine();
            if(name.equals(favBook)){

                System.out.printf("You checked %d books and found it.",count);
                break;
            }else if (name.equals("No More Books")){
                System.out.printf("The book you search is not here!%nYou checked %d books.",count);
                break;
            }
            count++;
        }
    }
}
