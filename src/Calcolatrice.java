import java.sql.SQLOutput;

public class Calcolatrice {

    public double somma(double a, double b){
        double somma = a + b;
        System.out.println("La somma e` " + somma);
        return somma;
    }

    public void somma(double[] num){
        double somma =0 ;
        for (double n: num){
            somma += n;
        }
        System.out.println("La somma del array e` " + somma);
//        return somma;
    }

}
