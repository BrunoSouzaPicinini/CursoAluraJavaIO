package br.com.alura.java.io.teste;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
//            System.out.println(linha);

            Scanner scannerLinha = new Scanner(linha);
            scannerLinha.useLocale(Locale.US);
            scannerLinha.useDelimiter(",");

            String tipoConta = scannerLinha.next();
            int agencia = scannerLinha.nextInt();
            int conta = scannerLinha.nextInt();
            String titular = scannerLinha.next();
            Double saldo = scannerLinha.nextDouble();

//            System.out.println(tipoConta + agencia + conta + titular + saldo);

            System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f %n",
                    tipoConta, agencia, conta, titular, saldo);

            scannerLinha.close();

//            String[] valores = linha.split(",");
//            System.out.println(Arrays.toString(valores));

        }
        scanner.close();

    }
}
