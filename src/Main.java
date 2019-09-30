import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        double zisk,kurz,celkovyVklad,sum=0;//strata je ziadna na zacitku ked podavas az po prvom raze ju mas vo vyske vkladu alebo ziadnu
        ArrayList<Double>arrayList=new ArrayList<>();

       for (int i=0;i<3;i++) {
           System.out.println("zadaj planovany zisk(profit):");
           zisk = scanner.nextDouble();

           kurz = 3.10 + (3.19 - 3.10) * random.nextDouble();
           System.out.println("aktualny kurz na remizu:" + (double) Math.round(kurz * 100) / 100);

           celkovyVklad=vzorecNaVklad(zisk,sum,kurz);

           System.out.println("hodnota sum: "+sum);
           arrayList.add(celkovyVklad);
           sum+=celkovyVklad;
           System.out.println("tvoj ocakavany vklad aby si vykril stratu zarobil profit ktory si zadal: " + celkovyVklad);
       }

    }
    //vzorec na optimalny vklad aby si splinil ocakavny profit plus vykril straty z predchadzajucich prehier
     static double vzorecNaVklad(double a,double b,double x){
        double vysledok;
        vysledok=(a+b)/(x-1);
        return ((double) Math.round(vysledok*100)/100);
    }


}
