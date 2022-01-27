package Aula13;

import java.io.*;

public class ManipuladorDeArquivos {

    public File inicializa() throws NomeInvalidoException {

        File arquivo = new File("C:\\Users\\Pichau\\OneDrive\\Documentos\\GitHub\\MeusArquivos\\aula13.txt");
        boolean existe = arquivo.exists();

        if(!arquivo.getName().equals("aula13.txt")){
            throw new NomeInvalidoException();
        }

        if(!existe){
            try{
                arquivo.createNewFile();
            } catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return arquivo;
    }

    public void escreve(File arquivo, String texto, boolean sobrescrever){
        try{

            FileWriter fw = new FileWriter(arquivo, !sobrescrever);
            BufferedWriter bw = new BufferedWriter(fw);
            //escreve o conteúdo no arquivo
            bw.write(texto);
            bw.newLine();
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void leia(File arquivo){

        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            while(br.ready()){
                String linha = br.readLine();
                System.out.println(linha);
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
    }
}
