package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.*;

public class MainSuperHeroi {
    public static void main(String[] args) {
        SuperHeroi heroi;
        String nome;
        String idSecreto;
        String[] poderes;
        String[] fraquezas;
        int qtde;
        int qtde1;

        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome do herói");
                idSecreto = JOptionPane.showInputDialog("Digite o ID secreto");
                qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de poderes?"));
                qtde1 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de fraquezas?"));

                poderes = new String[qtde];
                for (int i = 0; i < poderes.length; i++) {
                    poderes[i] = JOptionPane.showInputDialog(String.format("Poder %d:", (i + 1)));
                }

                fraquezas = new String[qtde1];
                for (int i = 0; i < fraquezas.length; i++) {
                    fraquezas[i] = JOptionPane.showInputDialog(String.format("Fraqueza %d:", (i + 1)));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null,"Dados do Herói: \nNome: %s \nIDSecreto: %s \nPoderes: %s \nFraquezas: %s", heroi.getNome(), heroi.getIdSecreta(), heroi.getPoderes(), heroi.getFraquezas());
        JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}