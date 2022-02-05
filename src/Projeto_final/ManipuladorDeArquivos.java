package Projeto_final;

import java.io.*;
import java.util.ArrayList;

public class ManipuladorDeArquivos {

    public File inicializa() {

        File arquivo = new File("C:\\Users\\Pichau\\OneDrive\\Documentos\\GitHub\\POO_2021-2\\src\\Projeto_final\\livros.txt");
        boolean existe = arquivo.exists();


        if(!existe){
            try{
                arquivo.createNewFile();
            } catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return arquivo;
    }

    public void escreve(File arquivo, Livro livro, boolean sobrescrever){
        try{

            FileWriter fw = new FileWriter(arquivo, !sobrescrever);
            BufferedWriter bw = new BufferedWriter(fw);
            //escreve o conteúdo no arquivo
            bw.write(livro.getTitulo() + ";" + livro.getAutor() + ";" + livro.getGenero());
            bw.newLine();
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Livro> leia(File arquivo){

        ArrayList<Livro> livros = new ArrayList<>();
        Livro livro = new Livro();

        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            while(br.ready()){
                String linha = br.readLine();
                String vet[] = new String[3];
                vet = linha.split(";");
                livro.setTitulo(vet[0]);
                livro.setAutor(vet[1]);
                livro.setGenero(vet[2]);
                livros.add(livro);
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return livros;
    }
}
