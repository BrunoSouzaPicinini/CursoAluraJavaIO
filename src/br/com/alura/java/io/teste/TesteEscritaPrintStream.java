package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintStream {

    public static void main(String[] args) throws IOException {

        PrintStream printStream = new PrintStream("loremEscritoPrintStream.txt");

        printStream.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        printStream.println();
        printStream.println();
        printStream.println();
        printStream.println("Teste de nova linha escrita");

        printStream.close();
    }

}
