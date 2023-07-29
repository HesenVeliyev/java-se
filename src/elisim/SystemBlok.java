package elisim;

import elisim.Calculater;

public class SystemBlok {

    public static void getSystemBlok(int menyu, int a, int b){


        if(menyu==1){
            Calculater.getSum(a,b);
        }
        else if (menyu==2) {
            Calculater.getsooht(a,b);

        }
        else if (menyu==3) {
            Calculater.getout(a,b);

        }
        else if (menyu==4) {
            Calculater.getdivide(a,b);

        }




    }

}
