package br.com.fiap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exemplo2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>(
                Arrays.asList(23,10,45,56,1,34));
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(String.format("%d ", numeros.get(i)));
        }
        Collections.sort(numeros);
        System.out.println();
        for (Integer i : numeros) {
            System.out.print(String.format("%d ", i));
        }
    }
}
