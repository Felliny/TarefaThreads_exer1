package View;

import Controller.ThreadVetor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[] threadVetor = new int[1000];
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número Par(for) ou impar(foreach)"));


        for (int i = 0; i < 1000; i++) {
            threadVetor[i] = (int) ((Math.random() * 91) + 10);
        }
        for (int i=0; i<2; i++){
            ThreadVetor vet = new ThreadVetor(valor, threadVetor);
            vet.start();
        }


    }
}
