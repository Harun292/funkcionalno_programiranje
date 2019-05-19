package ba.unsa.etf.rs.t7;

import java.util.Arrays;
import java.util.Scanner;

public class Drugi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Koliko želite elemenata: ");
        int br_el = s.nextInt();
        int [] niz = new int[br_el];
        System.out.println("Unesite brojeve:");

        for (int i = 0; i<br_el; i++){
            niz[i]  = s.nextInt();
        }

        Arrays.sort(niz);
        for(int i=0;i<br_el;i++){
            if(i==br_el-1)
                System.out.print(niz[i]);
            else System.out.print(niz[i]+",");
        }
    }
}
