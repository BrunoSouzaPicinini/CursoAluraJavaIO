package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintStream {

    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter("loremEscritoPrintWriter.txt","UTF-8");

        printWriter.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        printWriter.println();
        printWriter.println();
        printWriter.println();
        printWriter.println("Teste de nova linha escrita");

        printWriter.close();
    }

}
