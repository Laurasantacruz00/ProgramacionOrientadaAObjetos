/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura Santacruz
 */
import java.io.*;

public class Colores {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String a[], b[], c[], d[], e;

        int i;

        a = new String[11];
        b = new String[11];
        c = new String[11];
        d = new String[11];
        for (i = 1; i <= 10; i++) {
            System.out.println("Primera lista de colores ");
            System.out.println("Ingrese color " + i);
            a[i] = bufEntrada.readLine();
        }
        for (i = 1; i <= 10; i++) {
            System.out.println("Segunda lista de colores ");
            System.out.println("Ingrese color " + i);
            b[i] = bufEntrada.readLine();
        }
        for (i = 1; i <= 10; i++) {
            System.out.println("Tercera lista de colores ");
            System.out.println("Ingrese color " + i);
            c[i] = bufEntrada.readLine();
        }
        for (i = 1; i <= 10; i++) {
            System.out.println("Cuarta lista de colores ");
            System.out.println("Ingrese color " + i);
            d[i] = bufEntrada.readLine();
        }
        for (i = 1; i <= 10; i++) {
            if (a[i].equals(b[i])) {
                if (b[i].equals(c[i])) {
                    if (c[i].equals(d[i])) {
                        System.out.println("Son iguales");
                    } else {
                        System.out.println("Son distintas");
                    }
                } else {
                    System.out.println("Son distintas");
                }
            } else {
                System.out.println("Son distintas");
            }
        }

    }
}
