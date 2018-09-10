package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {
        InputStream fileInputStream = new FileInputStream("lorem.txt");
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();

        while(null != linha) {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
    }

}
