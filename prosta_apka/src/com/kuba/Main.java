package com.kuba;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World!");
        System.out.println("Druga linia");

        System.out.println('a' + 'A');
        System.out.println("a" + "A");
        System.out.println(1 + 2);
        System.out.println((1.0 + 2.0));
        System.out.println(true);

        int liczba1 = 5;
        int liczba2 = liczba1;

        System.out.println(liczba1 + liczba2);

        double liczba3, liczba4;
        liczba3 = 5.3;
        liczba4 = 11.0;
        System.out.println(liczba3 * liczba4);

        System.out.println((liczba1 - liczba3) * (liczba2 + liczba4));

        double n =9.0;
        int g = 3;
        double root = Math.sqrt(n);
        System.out.println(root);

        double pow = Math.pow(n, g);
        System.out.println(pow);

        BigInteger k = new BigInteger("213432534562412421646");
        System.out.println(k);

        BigInteger m = new BigInteger("436894672513475414135763");
        System.out.println(m);

        BigInteger suma = m.add(k);
        System.out.println(suma);

        BigInteger oblicz = m.multiply(k);
        System.out.println(oblicz);
    }
}
