package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaAltoNivel {

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("loremEscritoAltonivel.txt"));

        bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("Teste de nova linha escrita");


        bufferedWriter.close();
    }

}
