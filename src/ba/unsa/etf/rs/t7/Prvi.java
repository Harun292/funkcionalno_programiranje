package ba.unsa.etf.rs.t7;

import java.util.function.Function;

public class Prvi {
    public static void Funkcija(Function<Double, Double> f) {
        for(double i = 0; i<=100; i++)
            System.out.println(f.apply(i));
    }


    public static void main(String[] args) {
        Funkcija(x -> x*x+2*x+10);
    }
}
