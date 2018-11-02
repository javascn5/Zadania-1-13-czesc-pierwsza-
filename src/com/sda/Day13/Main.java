package com.sda.Day13;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumbersList biggest = new NumbersList();
//todo Zad. 2
//        System.out.println("Najwieksza podana liczba to: " + biggest.addAndReturnBiggest());
//todo Zad. 3
//        System.out.println("Najmniejsza podana liczba to: " + biggest.addAndReturnSmallest());
//todo Zad. 4
//        System.out.println("Podane liczby podzielne przez 3: " + biggest.addAndReturnS3Div());
//todo Zad. 5
//        LinkedList<Integer> listaLiczb = new LinkedList<>();
//        listaLiczb.add(1);
//        listaLiczb.add(2);
//        listaLiczb.add(3);
//        listaLiczb.add(4);
//        listaLiczb.add(5);
//        listaLiczb.add(6);
//        listaLiczb.add(7);
//        listaLiczb.add(8);
//        listaLiczb.add(9);
//
//        System.out.println("Liczby podzielne przez 2: " + biggest.addAndReturnUserDiv(listaLiczb, 2));
//todo Zad. 6
//        int min = -10;
//        int max = 15;
//
//        System.out.println("Liczby nieparzyste z przedziełu od " + min + " do " + max + ": " + biggest.nieparzyste(min, max));
//todo Zad. 7
//        int min = -10;
//        int max = 15;
//        System.out.println("Liczby pierwsze z przedziełu od " + min + " do " + max + ": " + biggest.liczbyPierwsze(min, max));
//todo Zad. 8
//        System.out.println("Wprowadzono " + biggest.IleSlow() + " slow/a/o.");
//todo Zad. 9   wyjaśnić zpais metody
//        System.out.println("Wprowadzono " + biggest.IleLiter() + " liter");
//todo Zad. 10
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Wprowadz zdanie: ");
//        String dane = scanner.nextLine();
//        System.out.println("Podane zdanie zawiera " + biggest.ileSamoglosek(dane) + " samoglosek.");
//        System.out.println("Podane zdanie zawiera " + biggest.ileSpolglosek(dane) + " spolglosek.");
//todo Zad. 11
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Wprowadz zdanie: ");
//        String dane = scanner.nextLine();
//
//        System.out.print("Po usunieciu spacji: " + biggest.spaceDelete(dane));
//todo Zad. 12
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Wprowadz zdanie: ");
//        String dane = scanner.nextLine();
//
//        System.out.print("Po usunieciu spacji i modyfikacji pierwszych liter slow: " + biggest.sentenceModification(dane));
//todo Zad. 13
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadz zdanie: ");
        String dane = scanner.nextLine();

        System.out.println("Zdanie po oczyszczeniu z symboli interpunkcyjnych: " + biggest.removePunctuation(dane));
    }
}
