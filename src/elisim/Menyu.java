package elisim;

import java.util.Scanner;

public class Menyu {


    public static int  getMenyu(){
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Menyu daxil et:\n"+
                "Menyu 1:\n"+
                "Menyu 2:\n"+
                "Menyu 3:\n"+
                "Menyu 4:\n");
        int menyu =sc.nextInt();
        return menyu;

    }

}
