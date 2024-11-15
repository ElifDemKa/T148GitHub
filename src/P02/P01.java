package P02;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        int a=128;
        int b=127;
        System.out.println("c="+(a+b));


        Scanner scan=new Scanner(System.in);
        System.out.println(" Dört harfli bir kelime griniz");
        String kelime= scan.nextLine();

        if(kelime.length()==4){
            System.out.println("giridğiniz kelime geçerlidir");
        }

    }
}
