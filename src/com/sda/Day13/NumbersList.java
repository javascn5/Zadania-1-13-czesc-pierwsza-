package com.sda.Day13;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

import static java.lang.Math.abs;

public class NumbersList {
    private LinkedList<Integer> list = new LinkedList<>();
    private LinkedList<Integer> podzielnePrzez3 = new LinkedList<>();
    private LinkedList<Integer> podzielnePrzezZadana = new LinkedList<>();
    private LinkedList<Integer> nieparzyste = new LinkedList<>();
    private LinkedList<Integer> pierwsze = new LinkedList<>();
    private LinkedList<String> slowa = new LinkedList<>();
    private LinkedList<Character> litery = new LinkedList<>();
    private Set<Character> samoISpol = new HashSet<Character>();

    public int addAndReturnBiggest() {
        int liczba;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Podaj liczbe (0 - wyjscie): ");
            liczba = scanner.nextInt();

            if (liczba != 0) {
                list.add(liczba);
            }

        } while (liczba != 0);

        if (list.size() == 0) {
            System.out.println("Nie podano zadnej liczby!");
            return 0;
        }

        int biggest = Integer.MIN_VALUE;

        for (int big : list) {
            if (big > biggest) {
                biggest = big;
            }
        }
        list.clear();
        return biggest;
    }

    public int addAndReturnSmallest() {
        int liczba2;
        Scanner scanner2 = new Scanner(System.in);

        do {
            System.out.print("Podaj liczbe (0 - wyjscie): ");
            liczba2 = scanner2.nextInt();

            if (liczba2 != 0) {
                list.add(liczba2);
            }

        } while (liczba2 != 0);

        if (list.size() == 0) {
            System.out.println("Nie podano zadnej liczby!");
            return 0;
        }

        int smallest = Integer.MAX_VALUE;

        for (int small : list) {
            if (small < smallest) {
                smallest = small;
            }
        }

        list.clear();

        return smallest;
    }

    public LinkedList<Integer> addAndReturnS3Div() {
        int liczba3;
        Scanner scanner3 = new Scanner(System.in);

        do {
            System.out.print("Podaj liczbe (0 - wyjscie): ");
            liczba3 = scanner3.nextInt();

            if (liczba3 != 0) {
                list.add(liczba3);
            }

        } while (liczba3 != 0);

        if (list.size() == 0) {
            System.out.println("Nie podano zadnej liczby!");
            return null;
        }

        for (int podzielna : list) {
            if (podzielna % 3 == 0) {
                podzielnePrzez3.add(podzielna);
            }
        }

        list.clear();

        return podzielnePrzez3;
    }

    public LinkedList<Integer> addAndReturnUserDiv(LinkedList<Integer> lista, int dzielnik) {

        if (lista.size() == 0) {
            System.out.println("Nie podano zadnej liczby!");
            return null;
        }

        for (int podzielna : lista) {
            if (podzielna % dzielnik == 0) {
                podzielnePrzezZadana.add(podzielna);
            }
        }

        return podzielnePrzezZadana;
    }

    public LinkedList<Integer> nieparzyste(int min, int max){
        for(int i = min; i <= max; i++){
            if(i % 2 != 0){
                nieparzyste.add(i);
            }
        }
        return nieparzyste;
    }

    public LinkedList<Integer> liczbyPierwsze(int min, int max){

        for(Integer i = min; i <=max; i++){
            boolean czyPierwsza = true;
            for(int j = 2; j < abs(i); j++){
                if(i % j == 0){
                    czyPierwsza = false;
                }
            }
            if(czyPierwsza == true){
                pierwsze.add(i);
            }
        }
        return pierwsze;
    }

    public int IleSlow(){
        Scanner scanner = new Scanner(System.in);
        String dane;
        System.out.print("Wprowadz zdanie: ");
        dane = scanner.nextLine();
        String[] tablicaSlow = dane.split(" ");

        for(String slowko : tablicaSlow){
            slowa.add(slowko);
        }

        return slowa.size();
    }

    public int IleLiter(){
        Scanner scanner = new Scanner(System.in);
        String dane;
        System.out.print("Wprowadz zdanie: ");
        dane = scanner.nextLine();

        int result = 0;

        for(char znak : dane.toCharArray()){
            result += Character.isAlphabetic(znak)?1:0;     //wyjasnic zapis
        }


        return result;
    }

    public int ileSamoglosek(String dane){

        SetSet samo_spol = new SetSet();

        int result = 0;
        samoISpol.addAll(samo_spol.fillSetSamo());

        for(char znak : dane.toCharArray()){
            if(samoISpol.contains(znak)){
                result++;
            }
        }

        samoISpol.clear();

        return result;
    }

    public int ileSpolglosek(String dane){

        SetSet samo_spol = new SetSet();

        int result = 0;
        samoISpol.addAll(samo_spol.fillSetSpol());

        for(char znak : dane.toCharArray()){
            if(samoISpol.contains(znak)){
                result++;
            }
        }

        samoISpol.clear();
        return result;
    }

    public String spaceDelete(String dane){
        String trimed = dane.replaceAll(" ", "");

        return trimed;
    }

    public String sentenceModification(String dane){
        String[] modificatedWords = dane.split(" ");
        String modificated = "";

        for(String slowo : modificatedWords){
            slowo = slowo.toUpperCase().substring(0,1).concat(slowo.substring(1));
            modificated += slowo;
        }

        return modificated;
    }

    public String removePunctuation(String dane){
        char[] znaki = dane.toCharArray();
        SetSet litery = new SetSet();
        samoISpol.addAll(litery.fillSetSpol());
        samoISpol.addAll(litery.fillSetSamo());
        samoISpol.addAll(litery.fillSpace());

        String bialeZdanie = "";

        for(char symbol : znaki){
            if (samoISpol.contains(symbol)){
                bialeZdanie += symbol;
            }
        }

        return bialeZdanie;
    }
}
