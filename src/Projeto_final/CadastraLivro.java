package Projeto_final;
import java.io.*;

import java.util.ArrayList;

public class CadastraLivro {

    private ArrayList<Livro> livros = new ArrayList<>();
    private ManipuladorDeArquivos mp = new ManipuladorDeArquivos();
    File arquivo = mp.inicializa();



    public boolean cadastrar (Livro l){

        if(l != null){
            mp.escreve(arquivo, l, false);
            return true;
        }else{
            return false;
        }

    }

    public ArrayList<Livro> retornaTodos(){
        return mp.leia(arquivo);
    }
}
