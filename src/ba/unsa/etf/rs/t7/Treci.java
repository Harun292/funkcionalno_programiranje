package ba.unsa.etf.rs.t7;

import java.util.Arrays;
import java.util.Scanner;

public class Treci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Koliko želite elemenata: ");
        int br_el = s.nextInt();
        int[] niz = new int[br_el];
        System.out.println("Unesite brojeve:");

        for (int i = 0; i < br_el; i++) {
            niz[i] = s.nextInt();
        }
        Arrays.stream(niz).sorted().forEach(System.out::print);
    }
}