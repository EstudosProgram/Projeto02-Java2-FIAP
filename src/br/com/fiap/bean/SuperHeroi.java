package br.com.fiap.bean;

import javax.swing.*;

public class SuperHeroi {
    //atributos
    String nome;
    String idSecreta;
    String[] poderes;
    String[] fraquezas;
    public SuperHeroi() {}

    public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdSecreta() {
        return idSecreta;
    }

    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }

    public String[] getPoderes() {
        return poderes;
    }

    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }

    public String[] getFraquezas() {
        return fraquezas;
    }

    public void setFraquezas(String[] fraquezas) {
        this.fraquezas = fraquezas;
    }

    public void listarHerois() {
        String exibe = String.format("Nome do herói: %s \n", nome);
        String exibe1 = String.format("ID secreta do herói: %s \n", idSecreta);
        String exibe2 = String.format("Poderes: %s \n", poderes);
        String exibe3 = String.format("Fraquezas: %s \n", fraquezas);
        int cont = 1;
        int cont1 = 1;
        for (String i : poderes) {
            exibe2 += String.format("Poderes %d: %s \n", cont, i);
            cont++;
        }
        for (String i : fraquezas) {
            exibe2 += String.format("Poderes %d: %s \n", cont1, i);
            cont++;
        }
        JOptionPane.showMessageDialog(null, exibe2, "Listagem dos poderes", JOptionPane.INFORMATION_MESSAGE );
        JOptionPane.showMessageDialog(null, exibe3, "Listagem de fraquezas", JOptionPane.INFORMATION_MESSAGE);
    }
}