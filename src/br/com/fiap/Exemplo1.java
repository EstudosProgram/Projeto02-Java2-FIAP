package br.com.fiap;

import java.util.ArrayList;

public class Exemplo1 {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");
        System.out.println("Tamanho " + carros.size());
        System.out.println("Exibindo valor do índice 2: " + carros.get(2));
        System.out.println(carros);
    }
}
