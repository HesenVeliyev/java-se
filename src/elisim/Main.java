package elisim;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menyu = Menyu.getMenyu();
        System.out.println("a ededi daxil edin :");
        int a = sc.nextInt();
        System.out.println("b ededi daxil edin :");
        int b = sc.nextInt();

        SystemBlok.getSystemBlok(menyu, a, b);


    }


}
