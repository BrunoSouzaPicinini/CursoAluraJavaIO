package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("loremEscrito.txt");
        Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("Teste de nova linha escrita");


        bufferedWriter.close();
    }

}
