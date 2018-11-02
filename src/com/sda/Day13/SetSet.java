package com.sda.Day13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetSet {

    public Set<Character> fillSetSamo() {
        Set<Character> samogloski = new HashSet<Character>();

        Character[] samo = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y'};
        for(Character dodaj : samo){
            samogloski.add(dodaj);
        }

        return samogloski;
    }

    public Set<Character> fillSetSpol() {
        Set<Character> spolgloski = new HashSet<Character>();

        Character[] spol = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'w', 'v', 'x', 'z',
                'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T', 'W', 'V', 'X', 'Z'};
        spolgloski.addAll(Arrays.asList(spol));

        return spolgloski;
    }

    public Set<Character> fillSpace() {
        Set<Character> spacja = new HashSet<Character>();

        Character[] spol = {' '};
        spacja.addAll(Arrays.asList(spol));

        return spacja;
    }
}
