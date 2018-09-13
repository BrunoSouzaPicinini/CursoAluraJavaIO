package br.com.alura.java.io.teste;

import java.io.*;

public class TesteObjectSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Bruno de Souza Picinini");
        cliente.setProfissao("Desenvolvedor");
        cliente.setCpf("000.000.001-91");

//        String nome = "Nico Silva";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oos.writeObject(cliente);
        oos.close();
        System.out.println("gravou :" + cliente);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        Cliente clienteLido = (Cliente) ois.readObject();

        System.out.println("leu :" + clienteLido);
        System.out.println("nome :" + clienteLido.getNome());
        System.out.println("profissão :" + clienteLido.getProfissao());
        System.out.println("cpf :" + clienteLido.getCpf());
        ois.close();
    }
}
